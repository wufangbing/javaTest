package com.unicom.sort;

import java.util.Arrays;

public class EasySort {
  public static void main(String[] args) {
    // 冒泡
    int[] arr = { 3, 1, 4, 2, 5, 1};
    int temp;
    for(int i = 0; i < arr.length - 1; i++) {
      for (int j = i; j < arr.length; j++) {
        if(arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
