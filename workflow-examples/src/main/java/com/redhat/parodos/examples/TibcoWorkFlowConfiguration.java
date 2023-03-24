// @formatter:off
package com.redhat.parodos.examples;

import com.redhat.parodos.tasks.tibco.TibcoWorkFlowTask;
import com.redhat.parodos.workflow.annotation.Infrastructure;
import com.redhat.parodos.workflows.workflow.SequentialFlow;
import com.redhat.parodos.workflows.workflow.WorkFlow;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class TibcoWorkFlowConfiguration {

	@Bean
	TibcoWorkFlowTask tibcoTask() {
		// TIBCO's default installation:
		//  1. creates a CA cert PEM file at the location specified below
		//  2. creates a server cert with hostname 'server'
		// Add the hostname 'server' to 127.0.0.1 entry in /etc/hosts
		// Set the admin password in TIBCO to 'admin' or edit the username and password below
		return new TibcoWorkFlowTask("ssl://server:7243", "admin", "admin", "/opt/tibco/ems/10.2/samples/certs/server_root.cert.pem");
	}

	@Bean
	@Infrastructure
	WorkFlow tibcoWorkFlow(@Qualifier("tibcoTask") TibcoWorkFlowTask tibcoTask) {
		return SequentialFlow.Builder.aNewSequentialFlow().named("tibcoWorkFlow").execute(tibcoTask).build();
	}

}