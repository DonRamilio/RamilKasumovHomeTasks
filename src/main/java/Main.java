import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово. (реализовать с использованием коллекций)
 * Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
 * искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
 * (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */


public class Main {
  static final String FILE_NAME1 = "C://JAVA/Lesson_8.txt";
  static final String FILE_NAME2 = "Lesson_8.txt";

  public static void main(String[] args) {
    // first homework item
    List<String> wordArray = new ArrayList<String>();
    wordArray = ArrayOperation.fillTheArray(wordArray);
    System.out.println(wordArray + "\n");
    ArrayOperation.printUniqueWords(wordArray);
    wordArray.clear();
    try {
      wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
    } catch (IOException e) {
      System.out.println("Не удалось заполнить массив из файла!\n");
    }
    try {
      wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
    } catch (IOException e) {
      System.out.println("Не удалось заполнить массив из файла!\n");
    }
    System.out.println(wordArray + "\n");
    ArrayOperation.printUniqueWords(wordArray);

    Phonebook phonebook = new Phonebook();

    phonebook.add(1234567, "Волков");
    phonebook.add(1234568, "Волков");
    phonebook.add(1234566, "Собакин");
    phonebook.add(1234564, "Котов");
    phonebook.add(1234562, "Котов");


    phonebook.get("Волков");
    phonebook.get("Котов");
    phonebook.get("Собакин");
    phonebook.get("Тигров");
  }
}