package com.bridgelabz;

//Write a Java Program to find the Frequency of each Elements in the Array.

public class FrequencyOfElements {
    public static void main(String[] args) {

        //Initialize Array
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 9, 5, 1};

        //Array freq will Store Frequincies of Element
        int [] freq = new int[arr.length];
        int visited = -1;
        for(int i =0;i < arr.length;i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //To avoid counting same element again
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited)
                freq[i] = count;
        }
        //Displays the frequency of each element present in array
        System.out.println("Element  |  Frequency");
        System.out.println("------------------");
        for(int i = 0; i < freq.length;i++){
            if(freq[i] != visited)
                System.out.println(" " + arr[i] + "      |      " + freq[i]);
        }
    }

}



