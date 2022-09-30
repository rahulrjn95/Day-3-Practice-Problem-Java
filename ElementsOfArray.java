package com.bridgelabz;

//Write a Java Program to Print the Elements of an Array.

public class ElementsOfArray {
    public static void main(String[] args){

        //Initialize Array
        int [] arr = new int [] {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("Elements of an Array");

        //Loop through the Array by Incrementing Value of i
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] +"");
        }

    }

}
