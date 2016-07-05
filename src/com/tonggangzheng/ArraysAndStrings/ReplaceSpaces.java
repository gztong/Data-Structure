package com.tonggangzheng.ArraysAndStrings;

/**
 * Created by Tong on 7/5/16.
 */
public class ReplaceSpaces {

    public static String replaceSpace(String source){
        String[] strArr = source.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strArr.length-1; i++){
            sb.append( strArr[i] +"%20");
        }

        sb.append(strArr[strArr.length-1]);

        return sb.toString();
    }
}
