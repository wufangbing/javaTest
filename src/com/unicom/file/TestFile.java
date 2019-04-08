package com.unicom.file;

import java.io.File;
import java.io.IOException;

public class TestFile {
  public static void main(String[] args) {
    File file = new File("C:/Users/wfb/Desktop/炸货铺/javascript/es6.html");
    // 创建文件
    File file1 = new File("C:\\Users\\wfb\\Desktop\\java\\javaProject\\src\\com\\unicom\\fileWriteRead"," create1.java");
    try {
      file1.createNewFile();
      file1.delete();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // 创建目录
    File file2 = new File("C:\\Users\\wfb\\Desktop\\java\\javaProject\\src\\com\\unicom\\addFile");
    file2.mkdir();
//    file2.delete();
  }
}
