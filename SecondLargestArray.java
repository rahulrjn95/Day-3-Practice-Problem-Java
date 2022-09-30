package com.bridgelabz;

//Write a Java Program to find 2nd Largest number in an Array.

public class SecondLargestArray {
    public static void main(String[] args){
        int arr[] = {14,25,35,66,77};
        int largest = arr[0];
        int secondLargest = arr[0];
        System.out.println("The given array is:");
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i] + "");
        }
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("second largest number is:"+secondLargest);
    }

}