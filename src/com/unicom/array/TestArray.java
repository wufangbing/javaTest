package com.unicom.array;
import java.util.Arrays;

/**
 * 测试数组
 */
public class TestArray {
  public static void main(String[] args) {
    int[] arr = new int[10];
    String[] str = new String[5];

    MyUser[] myUser = new MyUser[3];
    myUser[0] = new MyUser("wfb");
    myUser[1] = new MyUser("zzz");
    myUser[2] = new MyUser("djz");

    System.out.println(myUser[2].getName());

    // 数组三种初始化方式

    // 静态初始化
    int[] arr1 = {1, 2, 3, 4, 5};
    MyUser[] myUser1 = {
      new MyUser("wfb"),
      new MyUser("zzz"),
      new MyUser("djz")
    };

    // 默认初始化
    int[] arr2 = new int[5];
    MyUser[] myUser2 = new MyUser[3];

    // 动态初始化
    int[] arr3 = new int[5];
    arr3[0] = 1;
    arr3[1] = 1;
    arr3[2] = 1;

    for(int m:arr1) {
      System.out.println(m);
    }

    // 数组拷贝
    int[] arr4 = {1, 2, 3};
    int[] arr5 = new int[4];
    System.arraycopy(arr4, 1, arr5, 0, 2);

    for (int i=0; i<arr5.length; i++) {
      System.out.println(i+"--"+arr5[i]);
    }

    // 删除数组
    System.out.println("#########");
    String[] s1 = { "aa", "bb", "cc", "dd", "ee"};
    System.arraycopy(s1, 3, s1, 2, 2);
    s1[s1.length - 1] = null;
    for (int i=0; i<s1.length; i++) {
      System.out.println(i+"--"+s1[i]);
    }

    // 数组插入一个元素
    System.out.println("#############");
    String[] s2 = { "aa", "bb", "cc", "ee", "ff"};
    String[] s3 = new String[10];

    System.arraycopy(s2, 0, s3, 0, 3);
    System.arraycopy(s2, 3, s3, 4, 2);
    s3[3] = "dd";

    for (int i=0; i<s3.length; i++) {
      System.out.println(i+"--"+s3[i]);
    }

    // 测试Arrays工具类
    System.out.println("#############");
    int[] s4 = {2, 1, 3};
    Arrays.sort(s4);
    System.out.println(Arrays.toString(s4));
    System.out.println(Arrays.binarySearch(s4, 3));

    // 测试二维数组
    int[][] arrr = new int[3][];
    arrr[0] = new int[]{1, 2};
    arrr[1] = new int[]{3, 4};
    arrr[2] = new int[]{5, 6};

    // 静态初始化
    int[][] arrr1 = {{1, 2}, {3, 4}, {5, 6}};

    Object[] objarr1 = {"1001", "wfb", "20"};
    Object[] objarr2 = {"1002", "djz", "18"};
    Object[] objarr3 = {"1002", "zzz", "19"};

    Object[][] arrObj = new Object[3][];
    arrObj[0] = objarr1;
    arrObj[1] = objarr2;
    arrObj[2] = objarr3;
    for(int i=0; i< arrObj.length; i++) {
      System.out.println(Arrays.toString(arrObj[i]));
    }

  }
}

class MyUser {
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;
  public MyUser(String name) {
    this.name = name;
  }
}
