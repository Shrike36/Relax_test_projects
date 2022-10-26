package com.project.test.utils;

import java.util.*;

public class CalcUtils {
    public static long findMax(List<Long> numbers){
        long max = Long.MIN_VALUE;

        for (long number : numbers)
            if (number > max)
                max = number;

        return max;
    }

    public static long findMin(List<Long> numbers){
        long min = Long.MAX_VALUE;

        for (long number : numbers)
            if (number < min)
                min = number;

        return min;
    }

    public static double findMedian(List<Long> numbers){
        int size = numbers.size();
        return numbers.size() % 2 == 0 ?
                (double)(quickSelect(numbers,0,size-1,size/2)
                        + quickSelect(numbers,0,size-1,size/2-1)) / 2 :
                quickSelect(numbers,0,size-1,size/2);
    }

    public static double findMean(List<Long> numbers){
        int size = numbers.size();
        double M = 0;
        for (int i = 0; i < size; ++i)
            M += (numbers.get(i) - M) / (i + 1);
        return M;
    }

    public static List<List<Long>> findIncreasingSequences(List<Long> numbers){
        int size = numbers.size();
        List<Integer> positions = new ArrayList<>();
        List<Integer> lengthes = new ArrayList<>();
        int currentLength = 1;

        for (int i = 0; i < size-1; i++){
            positions.add(i);
            while (i < size - 1 && numbers.get(i) < numbers.get(i+1)) {
                currentLength++;
                i++;
            }
            lengthes.add(currentLength);
            currentLength = 1;
        }

        int maxLength = Integer.MIN_VALUE;
        for (int length : lengthes)
            if (length > maxLength)
                maxLength = length;

        List<List<Long>> ans = new ArrayList<>();
        for (int i = 0; i < positions.size(); i++){
            if(lengthes.get(i) == maxLength){
                List<Long> seq = new ArrayList<>();
                for (int j = positions.get(i); j < positions.get(i)+maxLength; j++)
                    seq.add(numbers.get(j));
                ans.add(seq);
            }
        }

        return ans;
    }

    public static List<List<Long>> findDecreasingSequences(List<Long> numbers){
        int size = numbers.size();
        List<Integer> positions = new ArrayList<>();
        List<Integer> lengthes = new ArrayList<>();
        int currentLength = 1;

        for (int i = 0; i < size-1; i++){
            positions.add(i);
            while (i < size - 1 && numbers.get(i) > numbers.get(i+1)) {
                currentLength++;
                i++;
            }
            lengthes.add(currentLength);
            currentLength = 1;
        }

        int maxLength = Integer.MIN_VALUE;
        for (int length : lengthes)
            if (length > maxLength)
                maxLength = length;

        List<List<Long>> ans = new ArrayList<>();
        for (int i = 0; i < positions.size(); i++){
            if(lengthes.get(i) == maxLength){
                List<Long> seq = new ArrayList<>();
                for (int j = positions.get(i); j < positions.get(i)+maxLength; j++)
                    seq.add(numbers.get(j));
                ans.add(seq);
            }
        }

        return ans;
    }

    private static int rand(int min, int max)
    {
        if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid range");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    private static void swap(List<Long> numbers, int i, int j)
    {
        long temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
    }

    private static int partition(List<Long> numbers, int left, int right, int pIndex)
    {
        long pivot = numbers.get(pIndex);
        swap(numbers, pIndex, right);

        pIndex = left;

        for (int i = left; i < right; i++)
        {
            if (numbers.get(i) <= pivot)
            {
                swap(numbers, i, pIndex);
                pIndex++;
            }
        }

        swap(numbers, pIndex, right);

        return pIndex;
    }

    private static long quickSelect(List<Long> numbers, int left, int right, int k)
    {
        if (left == right) {
            return numbers.get(left);
        }

        int pIndex = rand(left, right);

        pIndex = partition(numbers, left, right, pIndex);

        if (k == pIndex) {
            return numbers.get(k);
        }

        else if (k < pIndex) {
            return quickSelect(numbers, left, pIndex - 1, k);
        }

        else {
            return quickSelect(numbers, pIndex + 1, right, k);
        }
    }
}
