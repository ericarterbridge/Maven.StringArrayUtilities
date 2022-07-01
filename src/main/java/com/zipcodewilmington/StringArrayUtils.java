package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (String val : array) {
            if (val.equals(value)) {
                return true;
            }

        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
//
        int n = array.length;
        String[] revArray = new String[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            revArray[j - 1] = array[i];
            j = j - 1;
        }
        return revArray;
//

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        if (Arrays.equals(array, reverse(array))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        String arrayString = Arrays.toString(array).toLowerCase();
        for (int i = 0; i <= alphabet.length - 1; i++) {
            if (!arrayString.contains(alphabet[i])) {
                return false;
            }
            //return true;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        String[] copy = new String[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                copy[j++] = array[i];
            }

        }
        return copy;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newList = new ArrayList<>();
        newList.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != array[i]) {
                newList.add(array[i]);
            }
        }
        String[] newString = new String[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            newString[i] = newList.get(i);
        }
        return newString;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String memory = array[0];
        String pack = array[0];

        ArrayList<String> newList = new ArrayList<>();


        for (int i = 1; i < array.length; i++) {

            if (array[i].equals(memory)) {
                pack += array[i];

            } else {

                memory = array[i];
                newList.add(pack);
                pack = array[i];
                //  newList.add(pack);
            }
            //newList.add(pack);
        }
        if (array.length-1 != array.length-2) {
            newList.add(pack);
        }
        String[] newString = new String[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            newString[i] = newList.get(i);
        }
        //System.out.println(newString);
        return newString;
    }
}



