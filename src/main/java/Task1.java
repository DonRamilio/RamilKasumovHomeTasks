/**
 * Задание.1
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * Конструктор класса должен заполнять эти поля при создании объекта;
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * Создать массив из 5 сотрудников
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */
public class Task1 {

  public static void main(String[] args) {
    System.out.println("Task 1:" + "\n");

    Person[] persArray = new Person[5];
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mail.ru", "892312312", 50000, 30);
    persArray[1] = new Person("Petr Petrov", "Manager", "pepetrov@mail.ru", "892312313", 40000, 40);
    persArray[2] = new Person("Karl Karlov", "Storekeeper", "kakarlov@mail.ru", "892312314", 39000, 45);
    persArray[3] = new Person("Semen Semenoff", "Junior Manager", "sesemenoff@mail.ru", "892312315", 20000, 19);
    persArray[4] = new Person("Linda Lindman", "Secretary", "lilindman@mail.ru", "892312316", 30000, 25);
    for (Person person : persArray)
      if (person.getAge() > 40)
        System.out.println(person);

  }
}

class Person {
  private final String name;
  private final String position;
  private final String email;
  private final String phone;
  private final int salary;
  private final int age;

  public Person(String name, String position, String email, String phone, int salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return (name + "\n" + position + "\n" + email + "\n" + phone + "\n" + salary + "\n" + age);
  }
}


