package com.unicom.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期对象
 */
public class TestDate {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date.getTime());

    // 时间转化字符串
    DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");

    Date d = new Date(213213213213L);
    String str = df.format(d);
    System.out.println(str);

    // 字符串转化时间
    String str2 = "1997-7-7";
    DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");

    try {
      Date d2 = df2.parse(str2);
      System.out.println(d2);
    } catch (Exception e) {
      e.printStackTrace();
    }

    // GregorianCalender公历  日期计算
    Calendar c = new GregorianCalendar();
    c.set(2001, 1, 12, 12, 23, 24);
//    c.set(Calendar.YEAR, 2001);
//    c.set(Calendar.MONTH, 1);
//    c.set(Calendar.DATE, 3); // 默认使用当前时间的时分秒

    // 日期获取
    System.out.println(c.getTime());
    System.out.println(c.get(Calendar.YEAR));
    // 日期计算
    c.add(Calendar.YEAR, 20);
    System.out.println(c.get(Calendar.YEAR));

  }
}
