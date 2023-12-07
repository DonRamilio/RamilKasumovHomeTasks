import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 5. Нужно написать программу, которая будет принимать от пользователя ввод различных логинов.
 * Как только пользователь введет пустую строку - программа должна прекратить приём данных от пользователя
 * и вывести в консоль логины, начинающиеся на букву f (строчную).
 */
public class DemoStreamAPI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s;
    List<String> logins = new ArrayList<>();

    while (true) {
      System.out.print("Введите логин: ");
      s = scanner.nextLine();
      if (s.isBlank()) {
        break;
      }
      logins.add(s);
    }

    System.out.println("Список логинов: " + logins.stream().filter(l -> l.startsWith("f")).collect(Collectors.toList()));

  }
}