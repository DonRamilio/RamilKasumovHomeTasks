import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Task 1: ");
    System.out.println(isBetween10And20(10, -2));
    System.out.println(isBetween10And20(12, 5));
    System.out.println(isBetween10And20(20, 1));

    System.out.println("\nTask 2: ");
    printLineTimes("Результат", 4);

    System.out.println("\nTask 3: ");
    System.out.println(isNegative(-1));
    System.out.println(isNegative(1));
    System.out.println(isNegative(0));

    System.out.println("\nTask 4: ");
    isPositiveOrNegative(-1);
    isPositiveOrNegative(0);
    isPositiveOrNegative(1);

    System.out.println("\nTask 5: ");
    printLineTimes("Високосный", 2);
    System.out.println(isLeapYear(2024));
    int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    int[] multiplyOn2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    System.out.println("\nTask 6: ");
    task6(replaceValues);

    System.out.println("\nTask 7: ");
    task7(100);

    System.out.println("\nTask 8: ");
    task8(multiplyOn2);

    System.out.println("\nTask 9: ");
    task9();

    System.out.println("\nTask 10: ");
    task10(2, 3);
  }

  private static boolean isBetween10And20(int a, int b) {
    return a + b >= 10 && a + b <= 20;
  }

  private static void printLineTimes(String line, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(line);
    }
  }

  private static boolean isNegative(int a) {
    return a < 0;
  }

  private static void isPositiveOrNegative(int a) {
    System.out.println(a >= 0 ? "Положительное" : "Отрицательное");

  }

  private static boolean isLeapYear(int year) {
    return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
  }

  private static void task6(int[] replaceValues) {
    for (int i = 0; i < replaceValues.length; i++) {
      replaceValues[i] = (replaceValues[i] > 0) ? 0 : 1;
    }
    System.out.println(Arrays.toString(replaceValues));
  }

  private static void task7(int size) {
    int[] fillArr = new int[size];
    for (int i = 0; i < fillArr.length; i++) {
      fillArr[i] = i + 1;
    }
    System.out.println(Arrays.toString(fillArr));
  }

  private static void task8(int[] multiplyOn2) {
    for (int i = 0; i < multiplyOn2.length; i++) {
      if (multiplyOn2[i] < 6) {
        multiplyOn2[i] = multiplyOn2[i] * 2;
      }
    }
    System.out.println(Arrays.toString(multiplyOn2));
  }

  private static void task9() {
    int[][] arr = new int[3][3];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
        if (i == j || i == x) arr[i][j] = 1;
        else arr[i][j] = 0;
        System.out.print(arr[i][j] + " ");
      }
      System.out.print("\n");
    }
  }

  private static void task10(int len, int initialValue) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = initialValue;
      System.out.print("[" + i + "]" + arr[i] + " ");
    }
  }
}
