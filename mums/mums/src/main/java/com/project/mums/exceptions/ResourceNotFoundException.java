package com.project.mums.exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException{
	String resourceName;
	String fieldName;
	String fieldValue;
	
	
	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s not found with %s = %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}



}
