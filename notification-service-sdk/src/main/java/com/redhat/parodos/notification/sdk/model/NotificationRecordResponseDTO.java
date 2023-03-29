/*
 * Parodos Notification Service API
 * This is the API documentation for the Parodos Notification Service. It provides operations to send out and check notification. The endpoints are secured with oAuth2/OpenID and cannot be accessed without a valid token.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.notification.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.redhat.parodos.notification.sdk.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * NotificationRecordResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotificationRecordResponseDTO {

	public static final String SERIALIZED_NAME_BODY = "body";

	@SerializedName(SERIALIZED_NAME_BODY)
	private String body;

	public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";

	@SerializedName(SERIALIZED_NAME_CREATED_ON)
	private Date createdOn;

	public static final String SERIALIZED_NAME_FOLDER = "folder";

	@SerializedName(SERIALIZED_NAME_FOLDER)
	private String folder;

	public static final String SERIALIZED_NAME_FROMUSER = "fromuser";

	@SerializedName(SERIALIZED_NAME_FROMUSER)
	private String fromuser;

	public static final String SERIALIZED_NAME_ID = "id";

	@SerializedName(SERIALIZED_NAME_ID)
	private UUID id;

	public static final String SERIALIZED_NAME_LINKS = "links";

	@SerializedName(SERIALIZED_NAME_LINKS)
	private List<Link> links = null;

	public static final String SERIALIZED_NAME_MESSAGE_TYPE = "messageType";

	@SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
	private String messageType;

	public static final String SERIALIZED_NAME_READ = "read";

	@SerializedName(SERIALIZED_NAME_READ)
	private Boolean read;

	public static final String SERIALIZED_NAME_SUBJECT = "subject";

	@SerializedName(SERIALIZED_NAME_SUBJECT)
	private String subject;

	public static final String SERIALIZED_NAME_TAGS = "tags";

	@SerializedName(SERIALIZED_NAME_TAGS)
	private List<String> tags = null;

	public NotificationRecordResponseDTO() {
	}

	public NotificationRecordResponseDTO body(String body) {

		this.body = body;
		return this;
	}

	/**
	 * Get body
	 * @return body
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public NotificationRecordResponseDTO createdOn(Date createdOn) {

		this.createdOn = createdOn;
		return this;
	}

	/**
	 * Get createdOn
	 * @return createdOn
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public NotificationRecordResponseDTO folder(String folder) {

		this.folder = folder;
		return this;
	}

	/**
	 * Get folder
	 * @return folder
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public NotificationRecordResponseDTO fromuser(String fromuser) {

		this.fromuser = fromuser;
		return this;
	}

	/**
	 * Get fromuser
	 * @return fromuser
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public String getFromuser() {
		return fromuser;
	}

	public void setFromuser(String fromuser) {
		this.fromuser = fromuser;
	}

	public NotificationRecordResponseDTO id(UUID id) {

		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * @return id
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public NotificationRecordResponseDTO links(List<Link> links) {

		this.links = links;
		return this;
	}

	public NotificationRecordResponseDTO addLinksItem(Link linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<Link>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * Get links
	 * @return links
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public NotificationRecordResponseDTO messageType(String messageType) {

		this.messageType = messageType;
		return this;
	}

	/**
	 * Get messageType
	 * @return messageType
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public NotificationRecordResponseDTO read(Boolean read) {

		this.read = read;
		return this;
	}

	/**
	 * Get read
	 * @return read
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Boolean getRead() {
		return read;
	}

	public void setRead(Boolean read) {
		this.read = read;
	}

	public NotificationRecordResponseDTO subject(String subject) {

		this.subject = subject;
		return this;
	}

	/**
	 * Get subject
	 * @return subject
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public NotificationRecordResponseDTO tags(List<String> tags) {

		this.tags = tags;
		return this;
	}

	public NotificationRecordResponseDTO addTagsItem(String tagsItem) {
		if (this.tags == null) {
			this.tags = new ArrayList<String>();
		}
		this.tags.add(tagsItem);
		return this;
	}

	/**
	 * Get tags
	 * @return tags
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NotificationRecordResponseDTO notificationRecordResponseDTO = (NotificationRecordResponseDTO) o;
		return Objects.equals(this.body, notificationRecordResponseDTO.body)
				&& Objects.equals(this.createdOn, notificationRecordResponseDTO.createdOn)
				&& Objects.equals(this.folder, notificationRecordResponseDTO.folder)
				&& Objects.equals(this.fromuser, notificationRecordResponseDTO.fromuser)
				&& Objects.equals(this.id, notificationRecordResponseDTO.id)
				&& Objects.equals(this.links, notificationRecordResponseDTO.links)
				&& Objects.equals(this.messageType, notificationRecordResponseDTO.messageType)
				&& Objects.equals(this.read, notificationRecordResponseDTO.read)
				&& Objects.equals(this.subject, notificationRecordResponseDTO.subject)
				&& Objects.equals(this.tags, notificationRecordResponseDTO.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, createdOn, folder, fromuser, id, links, messageType, read, subject, tags);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotificationRecordResponseDTO {\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
		sb.append("    fromuser: ").append(toIndentedString(fromuser)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
		sb.append("    read: ").append(toIndentedString(read)).append("\n");
		sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
		sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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