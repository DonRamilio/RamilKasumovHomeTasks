import java.util.*;
import java.util.function.Function;

/**
 * Написать программу(-ы), позволяющую(-ие) выполнить следуюющее:
 * 1. Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел.
 * 2. Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить следующие манипуляции:
 * 2.1. Посчитать, сколько раз объект «High» встречается в коллекции;
 * 2.2. Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0;
 * 2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0;
 * 3. Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4". Необходимо отсортировать строки по возрастанию и добавить их в массив;
 */
public class Main {
  public static void main(String[] args) {
//    1. Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел.

    List<Integer> task1List = new ArrayList<>();
    int number;
    Random rnd = new Random();

    for (int i = 0; i < 10; i++) {
      number = rnd.nextInt() % 100;
      task1List.add(number);
    }

    long evensCount = task1List.stream().filter(n -> n % 2 == 0).count();

    System.out.println("List for task 1: " + task1List);
    System.out.println("Even numbers count: " + evensCount);

    // 2. Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить следующие манипуляции:
    List<String> highLoadCollection = Arrays.asList("Highload", "High", "Load", "Highload");
    // 2.1. Посчитать, сколько раз объект «High» встречается в коллекции;
    var highCount = highLoadCollection.stream().filter("High"::equals).count();
    // 2.2. Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0;
    var firstElement = highLoadCollection.stream().findFirst().orElse("0");
    // 2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0;
    var lastElement = highLoadCollection.stream().skip(highLoadCollection.size() - 1).findFirst().orElse("0");
    // 3. Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4". Необходимо отсортировать строки по возрастанию и добавить их в массив;
    var fCollection = Arrays.asList("f10", "f15", "f2", "f4", "f4");
    Function<String, Integer> extractNumericPart = (String f) -> Integer.parseInt(f.replace("f", ""));
    var fArray = fCollection.stream().sorted().toArray(); // отсортировано по алфавиту
    var fArray2 = fCollection.stream().sorted(Comparator.comparingInt(extractNumericPart::apply)).toArray(); // отсортировано по числовой части
  }
}


