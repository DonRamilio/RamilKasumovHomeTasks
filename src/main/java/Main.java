public class Main {
  public static void main(String[] args) {
    System.out.println("Task 1: ");
    System.out.println(isBetween10And20(10, -2));
    System.out.println(isBetween10And20(12, 5));
    System.out.println(isBetween10And20(20, 1));

    System.out.println("Task 3: ");
    System.out.println(isNegativOrPositive(-1));
    System.out.println(isNegativOrPositive(1));
    System.out.println(isNegativOrPositive(0));

    System.out.println("Task 4: ");
    isPositiveOrNegative(-1);
    isPositiveOrNegative(0);
    isPositiveOrNegative(1);

    System.out.println("Task 5: ");
    printLine("Високосный", 2);
    System.out.println(doleapYear(2024));
    int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    int[] multiplyOn2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    System.out.println("Task 6: ");
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
  /** Задание.1
   * Написать метод, принимающий на вход два целых числа и проверяющий,
   * что их сумма лежит в пределах от 10 до 20 (включительно),
   * если да – вернуть true, в противном случае – false.
   */
  static boolean isBetween10And20(int a, int b) {
    return a + b >=10 && a + b <=20;
  }
  /** Задание.2
   * Написать метод, которому в качестве аргументов передается строка
   * и число, метод должен отпечатать в консоль указанную строку,
   * указанное количество раз;
   */
  static void printLine(String line, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(line);

    }
  }

  /** Задание.3
   * 3. Написать метод, которому в качестве параметра передается целое число.
   * Метод должен вернуть true, если число отрицательное,
   * и вернуть false если положительное.
   */
  static boolean isNegativOrPositive(int a) {
    return a < 0;
  }
  /** Задание.4
   * Написать метод, которому в качестве параметра передается целое число,
   * метод должен напечатать в консоль, положительное ли число передали
   * или отрицательное. Замечание: ноль считаем положительным числом.
   */
  static void isPositiveOrNegative(int a) {
    System.out.println(a >= 0? "Положительное" : "Отрицательное");

  }
  /** Задание.5
   * Написать метод, который определяет, является ли год високосным,
   * и возвращает boolean (високосный - true, не високосный - false).
   * Каждый 4-й год является високосным, кроме каждого 100-го,
   * при этом каждый 400-й – високосный.
   */
  static boolean doleapYear(int year) {
    return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
  }


/** Задание. 6
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public static void task6(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
        replaceValues[i] = (replaceValues[i] > 0)? 0 : 1;
        System.out.print(replaceValues[i] + " ");
        }
        }

/** Задание. 7
 *2. Задать пустой целочисленный массив длиной 100.
 * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */
public static void task7(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
        fillArr[i] = i + 1;
        System.out.print(fillArr[i] + " ");
        }
        }

/** Задание. 8
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 * пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
public static void task8(int[] multiplyOn2) {
        for (int i = 0; i < multiplyOn2.length; i++) {
        if (multiplyOn2[i] < 6) {
        multiplyOn2[i] = multiplyOn2[i] * 2;
        }
        System.out.print(multiplyOn2[i] + " ");
        }
        }

/** Задание. 9
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 *  и с помощью цикла(-ов) заполнить его диагональные элементы единицами
 * (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу:
 *  индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

public static void task9() {
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

/** Задание. 10
 * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
 *  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
 *  равна initialValue;
 */
public static void task10(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
        arr[i] = initialValue;
        System.out.print("[" + i + "]" + arr[i] + " ");}
}
}
