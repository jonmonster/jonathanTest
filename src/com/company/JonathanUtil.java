package com.company;

import java.util.ArrayList;

public class JonathanUtil {

    public JonathanUtil() { }

    public ArrayList<Integer> findDupes(ArrayList<Integer> a, ArrayList<Integer>b){
        ArrayList<Integer> results = new ArrayList<Integer>();

        for(int i=0; i< a.size(); i++){
            for(int j=0; j<b.size(); j++){
                if(a.get(i) == b.get(j)){
                    results.add(a.get(i));
                }
            }
        }

        return results;
    }

}
