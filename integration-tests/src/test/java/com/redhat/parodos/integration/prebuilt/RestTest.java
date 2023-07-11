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

public class RestTest {

	private final String workflowName = "restWorkFlow";

	private final String taskName = "restTask";

	@Test
	public void runFlow() throws InterruptedException, ApiException {
		WorkFlowTestBuilder.TestComponents components = new WorkFlowTestBuilder().withDefaultProject()
				.withWorkFlowDefinition(workflowName).build();

		// EXECUTE WORKFLOW
		WorkflowApi workflowApi = new WorkflowApi(components.apiClient());

		// Define WorkRequests
		String url = "http://workflow-service:8080/api/v1/workflowdefinitions";
		WorkRequestDTO workGet = new WorkRequestDTO().workName(taskName)
				.arguments(Arrays.asList(new ArgumentRequestDTO().key("url").value(url),
						new ArgumentRequestDTO().key("method").value("get"),
						new ArgumentRequestDTO().key("username").value("test"),
						new ArgumentRequestDTO().key("password").value("test")));

		WorkFlowRequestDTO workFlowRequestGet = new WorkFlowRequestDTO().projectId(components.project().getId())
				.workFlowName(workflowName).works(Arrays.asList(workGet));

		WorkFlowExecutionResponseDTO execute = workflowApi.execute(workFlowRequestGet);

		assertNotNull(execute.getWorkFlowExecutionId());
	}

}
