package com.unicom.file;

import java.io.File;

public class FileTree {
  public static void main(String[] args) {
    File file = new File("C:\\Users\\wfb\\Desktop\\java\\javaProject\\src\\com\\unicom");
    printFile(file, 0);
  }

  static void printFile(File file, int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("_");
    }

    System.out.println(file.getName());

    if(file.isDirectory()) {
      File[] files = file.listFiles();
      for(File temp : files) {
        printFile(temp, level + 1);
      }
    }

  }
}
