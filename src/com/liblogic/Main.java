package com.liblogic;

public class Main {

    public static void main(String[] args) {

        int[] arr  = {1, 2, 3, 4, 6};

        for (int i = 0; i < arr.length ; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < arr.length; j++) {
                if(j < i){
                    left += arr[j];
                }
                if(j >  i){
                    right += arr[j];
                }
            }
            if(left == right){
                System.out.println(i);
            }
        }
    }
}

