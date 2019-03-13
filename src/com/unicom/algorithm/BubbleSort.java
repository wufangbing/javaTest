package com.unicom.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 */

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {3, 1, 6, 2, 9, 0, 7, 5, 8};

    System.out.println(Arrays.toString(BubbleSortss(arr)));
    System.out.println(TwoSortss(arr, 80));
  }

  public static int[] BubbleSortss(int[] arr) {
    int temp;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if(arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

  public static String TwoSortss(int[] arr, int key) {
    int start = 0;
    int end = arr.length -1;
    int mid;
    while(start <= end) {
      mid = (start + end)/2;
      if(key == arr[mid]) {
        return "yes";
      }
      if(key > arr[mid]) {
        start = mid + 1;
      }
      if(key < arr[mid]) {
        end = mid -1;
      }
    }
    return "no";
  }
}
