package com.unicom.Date;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 测试日历表
 */
public class TestDateForm {
  public static void main(String[] args) {
    System.out.println("请输入日期：格式（1995-10-7）");
    Scanner scanner = new Scanner(System.in);
    String inputStr = scanner.nextLine();

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    try {
      Date currentDate = df.parse(inputStr);
      char[] arr = { '0', '1', '2', '3', '4', '5', '6'};
      int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      Calendar calendar = new GregorianCalendar();
      calendar.setTime(currentDate);

      int currentYear = calendar.get(Calendar.YEAR);
      int currentMonth = calendar.get(Calendar.MONTH);
      int currentDay = calendar.get(Calendar.DATE);

      calendar.set(Calendar.DATE, 1);

      int week = calendar.get(Calendar.DAY_OF_WEEK);

      if(currentYear % 4 == 0) {
        days[1] = 28;
      }
      // 打印星期
      for (int i = 0; i < arr.length; i++) {
        System.out.printf("%3s", arr[i]);
      }
      System.out.println();

      // 打印空格
      for(int k = 0; k < week-1; k++) {
        System.out.print("   ");
      }

      int count = week-1;

      for (int j = 1; j <= days[currentMonth]; j++) {
        if(j == currentDay) {
          System.out.printf("%3d*", j);
        } else {
          System.out.printf("%3d", j);
        }

        count++;
        if(count % 7 == 0) System.out.println();
      }


    } catch (Exception e) {
      e.printStackTrace();
    }


  }
}
