/**
 * Задание.1
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * Конструктор класса должен заполнять эти поля при создании объекта;
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * Создать массив из 5 сотрудников
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */


public class Person {
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


