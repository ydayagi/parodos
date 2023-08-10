package com.redhat.parodos.vmmigration.dto.io.konveyor.forklift.v1beta1.planspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "destination", "source" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
		using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Provider implements io.fabric8.kubernetes.api.model.KubernetesResource {

	/**
	 * Destination.
	 */
	@com.fasterxml.jackson.annotation.JsonProperty("destination")
	@io.fabric8.generator.annotation.Required()
	@com.fasterxml.jackson.annotation.JsonPropertyDescription("Destination.")
	@com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
	private com.redhat.parodos.vmmigration.dto.io.konveyor.forklift.v1beta1.planspec.provider.Destination destination;

	public com.redhat.parodos.vmmigration.dto.io.konveyor.forklift.v1beta1.planspec.provider.Destination getDestination() {
		return destination;
	}

	public void setDestination(
			com.redhat.parodos.vmmigration.dto.io.konveyor.forklift.v1beta1.planspec.provider.Destination destination) {
		this.destination = destination;
	}

	/**
	 * Source.
	 */
	@com.fasterxml.jackson.annotation.JsonProperty("source")
	@io.fabric8.generator.annotation.Required()
	@com.fasterxml.jackson.annotation.JsonPropertyDescription("Source.")
	@com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
	private com.redhat.parodos.vmmigration.dto.io.konveyor.forklift.v1beta1.planspec.provider.Source source;

	public com.redhat.parodos.vmmigration.dto.io.konveyor.forklift.v1beta1.planspec.provider.Source getSource() {
		return source;
	}

	public void setSource(
			com.redhat.parodos.vmmigration.dto.io.konveyor.forklift.v1beta1.planspec.provider.Source source) {
		this.source = source;
	}

}
