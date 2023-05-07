package com.baongoc.english.services;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HackerRank {
    static boolean isAnagram(String a, String b) {

        if(a.length()- b.length() != 0) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map mapA = new HashMap<Character, Integer>();
        for(int i = 0; i< a.length(); i++) {
            if(mapA.containsKey(a.charAt(i))) {
                Integer k = (Integer) mapA.get(a.charAt(i));
               mapA.put(a.charAt(i), k+1);
            } else {
                mapA.put(a.charAt(i),1);
            }
        }

        Map mapB = new HashMap<Character, Integer>();
        for(int i = 0; i< b.length(); i++) {
            if(mapB.containsKey(b.charAt(i))) {
                Integer k = (Integer) mapB.get(b.charAt(i));
                mapB.put(b.charAt(i), k+1);
            } else {
                mapB.put(b.charAt(i),1);
            }
        }


        return mapA.equals(mapB);

    }
    public static void main(String[] args) {

        boolean ret = isAnagram("anagrams", "marganaa");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
