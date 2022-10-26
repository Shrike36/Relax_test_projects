package com.project.test.services;

import com.project.test.exceptions.FileException;
import com.project.test.responses.OperationResponse;
import com.project.test.utils.CalcUtils;
import com.project.test.utils.FileUtils;
import com.project.test.utils.OperationType;

import java.util.List;

public class OperationService {

    public static OperationResponse operation(String path, OperationType type) throws FileException {
        List<Long> numbers = FileUtils.readNumbersFromFile(path);
        if (numbers.size() == 0)
            throw new FileException("There are no numbers in file!");

        switch (type){
            case MAX:
                return new OperationResponse("max_value",
                                            CalcUtils.findMax(numbers));
            case MIN:
                return new OperationResponse("min_value",
                                            CalcUtils.findMin(numbers));
            case MEDIAN:
                return new OperationResponse("median_value",
                                            CalcUtils.findMedian(numbers));
            case MEAN:
                return new OperationResponse("mean_value",
                                            CalcUtils.findMean(numbers));
            case INCREASING_SEQUENCE:
                return new OperationResponse("increasing_sequences",
                                            CalcUtils.findIncreasingSequences(numbers));
            case DECREASING_SEQUENCE:
                return new OperationResponse("decreasing_sequences",
                                            CalcUtils.findDecreasingSequences(numbers));
        }
        throw new FileException("Cannot calc operation!");
    }

}
