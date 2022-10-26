package com.project.test.services;

import com.project.test.utils.CalcUtils;
import com.project.test.utils.FileUtils;
import com.project.test.utils.OperationType;
import org.json.JSONObject;

import java.util.List;

public class OperationService {

    public static String operation(String path, OperationType type) throws Exception{
        List<Long> numbers = FileUtils.readNumbersFromFile(path);
        if (numbers.size() == 0)
            throw new Exception("There are no numbers in file!");

        JSONObject response = new JSONObject();

        switch (type){
            case MAX:
                long max = CalcUtils.findMax(numbers);
                response.put("max_value", max);
                return response.toString();
            case MIN:
                long min = CalcUtils.findMin(numbers);
                response.put("min_value", min);
                return response.toString();
            case MEDIAN:
                double median = CalcUtils.findMedian(numbers);
                response.put("median_value", median);
                return response.toString();
            case MEAN:
                double mean = CalcUtils.findMean(numbers);
                response.put("mean_value", mean);
                return response.toString();
            case INCREASING_SEQUENCE:
                List<List<Long>> incrSeqs = CalcUtils.findIncreasingSequences(numbers);
                response.put("increasing_sequences", incrSeqs);
                return response.toString();
            case DECREASING_SEQUENCE:
                List<List<Long>> decrSeqs = CalcUtils.findDecreasingSequences(numbers);
                response.put("decreasing_sequences", decrSeqs);
                return response.toString();
        }
        return "hi";
    }

}
