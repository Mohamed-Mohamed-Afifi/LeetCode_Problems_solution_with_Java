package com.solution;

public class FirstOcc {
    public int strStr(String haystack, String needle) {
        int len_of_needle=needle.length();//2
        int max_len=haystack.length();//7
        int new_start=0;
        String newStr;
        while(new_start+len_of_needle<=max_len){
            newStr=haystack.substring(new_start,len_of_needle+new_start);
           if(newStr.equals(needle)) {
               return new_start;
           }
           new_start++;
        }
        return -1;
       }
}
