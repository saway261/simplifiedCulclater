package org.example;

public class Main {

  public static void main(String[] args) {

    ReceiveWithRegex receiveWithRegex = new ReceiveWithRegex();

    float num1;
    String operator;
    float num2;

    num1 = receiveWithRegex.receiveNum(1);
    operator = receiveWithRegex.receiveOperator();
    num2 = receiveWithRegex.receiveNum(2);

    double result;
    switch (operator) {
      case "+" -> result = num1 + num2;
      case "-" -> result = num1 - num2;
      case "*" -> result = num1 * num2;
      case "/" -> result = num1 / num2;
      default -> throw new IllegalStateException("Unexpected value: " + operator);
    }

    if (Double.isNaN(result) | Double.isInfinite(result)) {
      System.out.println("ゼロ除算は結果がNaNまたはInfinityになり、計算結果を正しく表示できません。");
    } else {
      System.out.println("計算結果：" + num1 + operator + num2 + "=" + result);
    }
  }
}


