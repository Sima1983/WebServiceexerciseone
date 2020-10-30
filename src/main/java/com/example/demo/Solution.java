package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public void fizzBuzz(){
        for(int i= 1; i <= 100; i++ ){
            if(i % 15 == 0 ){
                System.out.println("fizzbuzz");
            } else if(i % 3 == 0 ){
                System.out.println("fizz");
            }else if(i % 5 == 0 ){
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public StringBuilder rovarspraket(String s) {
        StringBuilder language = new StringBuilder(s);
        StringBuilder newLanguage = new StringBuilder("");
        for (int i = 0; i < language.length(); i++) {
            if ((language.charAt(i) >= 'a' && language.charAt(i) <= 'z') || (language.charAt(i) >= 'A' && language.charAt(i) <= 'Z')) {
                if (language.charAt(i) == 'a' || language.charAt(i) == 'A'
                        || language.charAt(i) == 'e' || language.charAt(i) == 'E'
                        || language.charAt(i) == 'i' || language.charAt(i) == 'I'
                        || language.charAt(i) == 'o' || language.charAt(i) == 'O'
                        || language.charAt(i) == 'u' || language.charAt(i) == 'U'
                        || language.charAt(i) == 'ö' || language.charAt(i) == 'Ö'
                        || language.charAt(i) == 'ä' || language.charAt(i) == 'Ä'
                        || language.charAt(i) == 'å' || language.charAt(i) == 'Å') {
                    newLanguage = newLanguage.append(language.charAt(i));
                } else {
                    newLanguage = newLanguage.append(language.charAt(i));
                    newLanguage = newLanguage.append('o');
                    newLanguage = newLanguage.append(Character.toLowerCase(language.charAt(i)));
                }
            } else {
                newLanguage = newLanguage.append(language.charAt(i));
            }
        }
        return newLanguage;
    }
    public StringBuilder rovarspråketTillbaka(String s){
        StringBuilder newLanguage= new StringBuilder(s);
        StringBuilder origin= new StringBuilder("");
        for (int i=0; i< newLanguage.length(); i++){
            if (newLanguage.charAt(i) == 'o' && Character.toLowerCase(newLanguage.charAt(i+1)) == Character.toLowerCase(newLanguage.charAt(i-1))) {
                newLanguage.replace(i-1, i+1 , String.valueOf(newLanguage.charAt(i-1)));
            } else {
                origin = origin.append(newLanguage.charAt(i));
            }
        }
        return origin;
    }
    public void dubbLetter(){
        List<Integer>list = new ArrayList<>(Arrays.asList(2,3,8,7,2,3,4,9));

        System.out.println("Original list : " + list);
        System.out.println("After clear double letter : "
                + list.stream().distinct().collect(Collectors.toList()));
    }
    public void whatSquare(int squareCount) {
        int  i,numCount = 1;
        for (i = 1; i <= 64; i++) {
            if (numCount >= squareCount) {
                System.out.println(squareCount+ " was reached at square: " + i);
                return;
            } else {
                numCount= (numCount * 2) + 1;
            }
        }
    }
}


