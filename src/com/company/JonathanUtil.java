package com.company;

import java.util.ArrayList;
import java.util.*;

public class JonathanUtil {

    public JonathanUtil() { }

    public List<Integer> findDupes(ArrayList<Integer> a, ArrayList<Integer>b){
        List<Integer> results = new LinkedList<Integer>();

        for(int i=0; i< a.size(); i++){
            for(int j=0; j<b.size(); j++){
                if(a.get(i) == b.get(j)){
                    results.add(a.get(i));
                }
            }
        }

        return results;
    }


    //I haven't taken a look at hashmaps yet, but this solution popped into my head while I was reading your email
    //and I just wanted to give it a try.
    public ArrayList<Integer> findDupes2(ArrayList<Integer> a, ArrayList<Integer>b){
        //combList is the combined list of listOne and listTwo
        ArrayList<Integer> combList = new ArrayList<Integer>();
        combList.addAll(a);
        combList.addAll(b);

        //We needed combList in order to iterate once through the total list to find the max value
        int maxVal=0;
        for(int k=0; k<combList.size(); k++){
            if(combList.get(k) > maxVal){
                maxVal = combList.get(k);
            }
        }
        //This is a precaution, to make sure we are able to add the maxvalue into the correct index
        maxVal = maxVal + 1;

        //This is the array we will use in order to insert at a specific index, with a '***' as a marker for blank
        String[] placeHolder = new String[maxVal];
        for(int i=0; i<maxVal; i++) {
            placeHolder[i] = "***";
        }


        /**
         * The idea here is to use the value as its index for the placeholder array.  If there is a time where
         * the array does not hit an empty space marker, then that means the number is duplicated.  At this point,
         * if we find that the number is duplicated, we would then add it to the results arrayList which we will
         * return.  This method allows us to reduce the number of operations, and stop it from growing exponentially
         * when you add even 1 value to the list.
         */

        ArrayList<Integer> results = new ArrayList<>();

        for(int i=0; i<a.size(); i++){
            placeHolder[a.get(i)] = String.valueOf(a.get(i));
        }

        for(int j=0; j<b.size(); j++){
            if(placeHolder[b.get(j)] != "***"){
                results.add(b.get(j));
            }
        }

        return results;
    }


    public List<Integer> findDuplicates(List<Integer> a, List<Integer> b){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> results = new ArrayList<Integer>();

        for(int i=0; i<a.size(); i++) {
            map.put(a.get(i), 0);
        }

        for(int j=0; j<b.size(); j++) {
            if (map.containsKey(b.get(j))) {
                results.add(b.get(j));
            }
        }
        return results;
    }

    public List<String> sortArray(String[] array){
        List<String> solution = new ArrayList<String>();

        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer maxVal = 0;

        for(int i=0; i<array.length; i++){
            map.put(array[i],array[i].length());
            if(array[i].length() > maxVal){
                maxVal = array[i].length();
            }
        }

        for(int i=0; i <= maxVal; i++){
            List<String> placeHolder = new ArrayList<String>();
            for(Map.Entry<String, Integer> kvp : map.entrySet()){
                if(kvp.getValue() == i){
                       placeHolder.add(kvp.getKey());
                }
            }
            Collections.sort(placeHolder);
            solution.addAll(placeHolder);
        }
        return solution;
    }

}
