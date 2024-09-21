package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReceiveWithRegex {

  Scanner scanner = new Scanner(System.in);
  Pattern pattern;
  Matcher matcher;

  public float receiveNum(int num) {
    String intRegex = "^-?[0-9]+$|^-?[0-9]+.[0-9]+";
    pattern = Pattern.compile(intRegex);

    while (true) {
      System.out.print(num + "個めの数値を入力してください：");
      String temp = scanner.next();
      matcher = pattern.matcher(temp);

      if (matcher.matches()) {
        try {
          return Float.parseFloat(temp);
        } catch (NumberFormatException e) {
          System.out.println("float型の数値に変換できません");
        }
      } else {
        System.out.println("無効な値です。整数の半角数字を入力してください");
      }
    }

  }

  public String receiveOperator() {
    String operatorRegex = "^[+\\-*/]$";
    pattern = Pattern.compile(operatorRegex);

    while (true) {
      System.out.print("演算子を入力してください (+, -, *, /): ");
      String operator = scanner.next();
      matcher = pattern.matcher(operator);

      if (matcher.matches()) {
        return operator;
      } else {
        System.out.println("無効な値です。");
      }
    }
  }

}
