/*
 * Parodos Workflow Service API
 * This is the API documentation for the Parodos Workflow Service. It provides operations to execute assessments to determine infrastructure options (tooling + environments). Also executes infrastructure task workflows to call downstream systems to stand-up an infrastructure option.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.redhat.parodos.sdk.model.WorkFlowOptionsResponseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkFlowContextResponseDTO
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.Builder
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkFlowContextResponseDTO {

	public static final String SERIALIZED_NAME_WORK_FLOW_EXECUTION_ID = "workFlowExecutionId";

	@SerializedName(SERIALIZED_NAME_WORK_FLOW_EXECUTION_ID)
	private String workFlowExecutionId;

	public static final String SERIALIZED_NAME_WORK_FLOW_OPTIONS = "workFlowOptions";

	@SerializedName(SERIALIZED_NAME_WORK_FLOW_OPTIONS)
	private WorkFlowOptionsResponseDTO workFlowOptions;

	public WorkFlowContextResponseDTO() {
	}

	public WorkFlowContextResponseDTO workFlowExecutionId(String workFlowExecutionId) {

		this.workFlowExecutionId = workFlowExecutionId;
		return this;
	}

	/**
	 * Get workFlowExecutionId
	 * @return workFlowExecutionId
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public String getWorkFlowExecutionId() {
		return workFlowExecutionId;
	}

	public void setWorkFlowExecutionId(String workFlowExecutionId) {
		this.workFlowExecutionId = workFlowExecutionId;
	}

	public WorkFlowContextResponseDTO workFlowOptions(WorkFlowOptionsResponseDTO workFlowOptions) {

		this.workFlowOptions = workFlowOptions;
		return this;
	}

	/**
	 * Get workFlowOptions
	 * @return workFlowOptions
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public WorkFlowOptionsResponseDTO getWorkFlowOptions() {
		return workFlowOptions;
	}

	public void setWorkFlowOptions(WorkFlowOptionsResponseDTO workFlowOptions) {
		this.workFlowOptions = workFlowOptions;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WorkFlowContextResponseDTO workFlowContextResponseDTO = (WorkFlowContextResponseDTO) o;
		return Objects.equals(this.workFlowExecutionId, workFlowContextResponseDTO.workFlowExecutionId)
				&& Objects.equals(this.workFlowOptions, workFlowContextResponseDTO.workFlowOptions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(workFlowExecutionId, workFlowOptions);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WorkFlowContextResponseDTO {\n");
		sb.append("    workFlowExecutionId: ").append(toIndentedString(workFlowExecutionId)).append("\n");
		sb.append("    workFlowOptions: ").append(toIndentedString(workFlowOptions)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the
	 * first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}