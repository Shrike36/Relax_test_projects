package com.project.test.utils;

public enum OperationType {
    MAX("get_max_value"),
    MIN("get_min_value"),
    MEDIAN("get_median_value"),
    MEAN("get_mean_value"),
    INCREASING_SEQUENCE("get_increasing_sequence"),
    DECREASING_SEQUENCE("get_decreasing_sequence");

    private final String request;

    OperationType(String request){
        this.request = request;
    }

    public String getRequest(){
        return request;
    }

    public static OperationType getTypeByRequest(String request){
        for (OperationType type : values()){
            if (type.getRequest().equals(request))
                return type;
        }

        return null;
    }
}
