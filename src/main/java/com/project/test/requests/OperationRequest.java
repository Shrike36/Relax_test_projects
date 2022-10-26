package com.project.test.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OperationRequest {
    private String path;
    private String operation;

    public OperationRequest() {}

    public String getPath() {
        return path;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
