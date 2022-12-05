package com.kamiltalowski.practice.basics;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {0, 2, 3, 4, 5, 0, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] countAndSumArray;
        countAndSumArray = new int [2];
        CountAndSum(numbers, countAndSumArray);
        System.out.println(countAndSumArray[0]);
        System.out.println(countAndSumArray[1]);
    }
    static int[]  CountAndSum(int[] numbers,int[] countAndSumArray){
        for (int each: numbers){
            if(each >0) {
                countAndSumArray[0]++;
            }else{
                countAndSumArray[1]+=each;
                }
        }
        return countAndSumArray;
    }
}
