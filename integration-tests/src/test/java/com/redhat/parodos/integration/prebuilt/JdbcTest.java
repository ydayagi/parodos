package com.redhat.parodos.integration.prebuilt;

import java.util.Arrays;

import com.redhat.parodos.flows.common.WorkFlowTestBuilder;
import com.redhat.parodos.sdk.api.WorkflowApi;
import com.redhat.parodos.sdk.invoker.ApiException;
import com.redhat.parodos.sdk.model.ArgumentRequestDTO;
import com.redhat.parodos.sdk.model.WorkFlowExecutionResponseDTO;
import com.redhat.parodos.sdk.model.WorkFlowRequestDTO;
import com.redhat.parodos.sdk.model.WorkRequestDTO;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class JdbcTest {

	private final String workflowName = "jdbcWorkFlow";

	private final String taskName = "jdbcTask";

	@Test
	public void runFlow() throws ApiException {

		WorkFlowTestBuilder.TestComponents components = new WorkFlowTestBuilder().withDefaultProject()
				.withWorkFlowDefinition(workflowName).build();

		// EXECUTE WORKFLOW
		WorkflowApi workflowApi = new WorkflowApi(components.apiClient());

		// 1 - Define WorkRequests
		String jdbcUrl = "jdbc:postgres://postgres-service:5432/?user=postgres&password=postgres";

		WorkRequestDTO workCreateDB = new WorkRequestDTO().workName(taskName)
				.arguments(Arrays.asList(new ArgumentRequestDTO().key("url").value(jdbcUrl),
						new ArgumentRequestDTO().key("operation").value("execute"),
						new ArgumentRequestDTO().key("statement").value("create database service")));
		WorkRequestDTO workCreateTable = new WorkRequestDTO().workName(taskName)
				.arguments(Arrays.asList(new ArgumentRequestDTO().key("url").value(jdbcUrl),
						new ArgumentRequestDTO().key("operation").value("execute"),
						new ArgumentRequestDTO().key("statement").value("create table items (id VARCHAR(255))")));
		WorkRequestDTO workInsert = new WorkRequestDTO().workName(taskName)
				.arguments(Arrays.asList(new ArgumentRequestDTO().key("url").value(jdbcUrl),
						new ArgumentRequestDTO().key("operation").value("update"),
						new ArgumentRequestDTO().key("statement").value("insert into items values('item-test')")));
		WorkRequestDTO workSelect = new WorkRequestDTO().workName(taskName)
				.arguments(Arrays.asList(new ArgumentRequestDTO().key("url").value(jdbcUrl),
						new ArgumentRequestDTO().key("operation").value("query"),
						new ArgumentRequestDTO().key("statement").value("select * from items"),
						new ArgumentRequestDTO().key("result-ctx-key").value("theresult")));

		WorkFlowRequestDTO workFlowRequestDb = new WorkFlowRequestDTO().projectId(components.project().getId())
				.workFlowName(workflowName).works(Arrays.asList(workCreateDB));
		WorkFlowRequestDTO workFlowRequestTable = new WorkFlowRequestDTO().projectId(components.project().getId())
				.workFlowName(workflowName).works(Arrays.asList(workCreateTable));
		WorkFlowRequestDTO workFlowRequestInsert = new WorkFlowRequestDTO().projectId(components.project().getId())
				.workFlowName(workflowName).works(Arrays.asList(workInsert));
		WorkFlowRequestDTO workFlowRequestSelect = new WorkFlowRequestDTO().projectId(components.project().getId())
				.workFlowName(workflowName).works(Arrays.asList(workSelect));

		WorkFlowRequestDTO workFlowRequests[] = new WorkFlowRequestDTO[] { workFlowRequestDb, workFlowRequestTable,
				workFlowRequestInsert, workFlowRequestSelect };

		// 3 - Execute WorkFlowRequests
		for (WorkFlowRequestDTO workFlowRequest : workFlowRequests) {
			WorkFlowExecutionResponseDTO execute = workflowApi.execute(workFlowRequest);

			assertNotNull(execute.getWorkFlowExecutionId());
		}
	}

}
