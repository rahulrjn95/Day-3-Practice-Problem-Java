package com.bridgelabz;

//Write a Java Program tp sort the Elements of an Array in Ascending order.

public class AscendingArray {
    public static void main(String[] args){
        //Initialize array
        int [] arr = new int [] {5,2,8,7,1};
        int temp = 0;
        //Displaying elements of original array
        System.out.println("Elements of an original array:");
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i] + "");
        }
        //sort the array in ascending order
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        //Displaying elements of array after sorting
        System.out.println("Elements of array after sorted in ascending order:");
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}
