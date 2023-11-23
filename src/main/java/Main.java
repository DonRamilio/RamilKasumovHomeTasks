import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println("Task 1:" + "\n");

    Person[] persArray = new Person[5];
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mail.ru", "892312312", 50000, 30);
    persArray[1] = new Person("Petr Petrov", "Manager", "pepetrov@mail.ru", "892312313", 40000, 40);
    persArray[2] = new Person("Karl Karlov", "Storekeeper", "kakarlov@mail.ru", "892312314", 39000, 45);
    persArray[3] = new Person("Semen Semenoff", "Junior Manager", "sesemenoff@mail.ru", "892312315", 20000, 19);
    persArray[4] = new Person("Linda Lindman", "Secretary", "lilindman@mail.ru", "892312316", 30000, 25);
    for (Person person : persArray) {
      if (person.getAge() > 40) {
        System.out.println(person);

        Park park = new Park();
        park.addAttraction("Колесо обозрения", "10:00 - 23:00", 500);
        park.addAttraction(new Park.Attraction("Американские горки", "12:00 - 22:00", 700));

        System.out.println("\nTask 2:" + "\n");
        List<Park.Attraction> attractionList = park.getAttractions();
        for (Park.Attraction attraction : attractionList) {
          System.out.println(attraction);
        }
      }
    }
  }
}
