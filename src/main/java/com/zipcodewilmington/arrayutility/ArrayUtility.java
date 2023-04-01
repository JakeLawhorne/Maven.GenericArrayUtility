package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    private T[] inputArray;
    public ArrayUtility(T[] inputArray){
        this.inputArray = inputArray;
    }

    ArrayList<T>list = new ArrayList<>();


    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate){
        ArrayList<T> list = new ArrayList<>();
        Integer count = 0;
        for(int i = 0; i < this.inputArray.length; i++){
                list.add(inputArray[i]);
            }
        for(int i = 0; i < arrayToMerge.length; i++){
            list.add(arrayToMerge[i]);
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove){
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < this.inputArray.length; i++) {
            list.add(inputArray[i]);
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(valueToRemove)){
                list.remove(valueToRemove);
            }
        }
        T[] items = (T[]) Array.newInstance(list.get(0).getClass(), list.size());

        for(int i = 0; i < items.length; i++){
            items[i] = list.get(i);
        }

        return items;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < this.inputArray.length; i++) {
            list.add(inputArray[i]);
        }
        for (int i = 0; i < arrayToMerge.length; i++) {
            list.add(arrayToMerge[i]);
        }
        T[] items = (T[]) Array.newInstance(list.get(0).getClass(), list.size());

        for (int i = 0; i < items.length; i++) {
            items[i] = list.get(i);
        }

        int count = 1, tempCount;
        T popular = items[0];
        T temp = null;
        for (int i = 0; i < (items.length - 1); i++) {
            temp = items[i];
            tempCount = 0;
            for (int j = 1; j < items.length; j++) {
                if (temp == items[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        ArrayList<T> list = new ArrayList<>();
        Integer count = 0;
        for (int i = 0; i < this.inputArray.length; i++) {
            list.add(inputArray[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(valueToEvaluate)) {
                count++;
            }
        }

        return count;
    }
}
