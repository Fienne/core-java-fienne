package com.examples;

import java.util.*;
import java.lang.*;
import java.text.*;
//import java.lang.String;*;


public class Main {

    public static String lastDigit(int d){
       int n= (d % 10);



        if (n==1){
            return("one"); }
        else if (n==2){
            return("two"); }
        else if (n==3){
            return("three");}
        else if (n==4){
            return("four");}
        else if (n==5){
            return("five");}
        else if (n==6){
            return("six");}
        else if (n==7){
            return("seven");}
        else if (n==8){
            return("eight");}
        else if (n==9){
            return("nine");}
        
       else{
            return("zero");}


    }

    // driver function



   public static void main(String[] args) {

       int n = 9856;
       System.out.println(lastDigit(n));
    }
}
