package com.unicom.String;

/**
 * 测试String
 */

public class TestString {
  public static void main(String[] args) {
    String str = "wfb";
    String str1 = new String("wfb");
    String str2 = 18 + "19";
    System.out.println(str2);

    System.out.println("################");
    String str10 = "wfb";
    String str11 = "wfb java";
    String str13 = " djz java";
    String str12 = new String("wfb");
    System.out.println(str10 == str12);
    System.out.println(str10.equals(str12));

    System.out.println("############");
    System.out.println(str11.charAt(1));
    System.out.println(str11.length());
    System.out.println(str11.indexOf("java"));


    System.out.println(str11.replace("java", "fuck"));
    System.out.println(str11.substring(1));
    System.out.println(str11.toUpperCase());
    System.out.println(str13.trim());
  }
}
