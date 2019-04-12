package com.unicom.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
  public static void main(String[] args) {
    try {
      System.out.println(openFile());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  static String openFile() throws FileNotFoundException, IOException{
    FileReader reader = null;
    reader = new FileReader("C:\\Users\\wfb\\Desktop\\java\\javaProject/javaProject.iml");
    reader.close();
//    FileReader reader = null;
//    try {
//      reader = new FileReader("C:\\Users\\wfb\\Desktop\\java\\javaProject/javaProject.iml");
//      char temp = (char)reader.read();
//      System.out.println(temp);
//      return "step1";
//    } catch (FileNotFoundException e) {
//      System.out.println("文件没有找到");
//      e.printStackTrace();
//      return "step2";
//    } catch (IOException e) {
//      System.out.println("文件读取错误");
//      return "step3";
//    } finally {
//      System.out.println("finally");
//      try {
//        reader.close();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }
    return "11";
  }
}

