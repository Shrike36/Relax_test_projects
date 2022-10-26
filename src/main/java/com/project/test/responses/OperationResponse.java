package com.project.test.responses;

public class OperationResponse {

    private String operationType;
    private Object result;

    public OperationResponse() {
    }

    public OperationResponse(String operationType, Object result) {
        this.operationType = operationType;
        this.result = result;
    }

    public String getOperationType() {
        return operationType;
    }

    public Object getResult() {
        return result;
    }
}
