/**
 * Задание.2
 * Создать класс Park с внутренним классом,
 * с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */

import java.util.ArrayList;
import java.util.List;

public class Task2 {

  public static void main(String[] args) {
    Park park = new Park();
    park.addAttraction("Колесо обозрения", "10:00 - 23:00", 500);
    park.addAttraction(new Park.Attraction("Американские горки", "12:00 - 22:00", 700));

    List<Park.Attraction> attractionList = park.getAttractions();
    for (Park.Attraction attraction : attractionList) {
      System.out.println(attraction);
    }
  }
}

class Park {

  private final List<Attraction> attractions = new ArrayList<>();

  public void addAttraction(String name, String workingHours, int cost) {
    Attraction attraction = new Attraction(name, workingHours, cost);
    attractions.add(attraction);
  }

  public void addAttraction(Attraction attraction) {
    attractions.add(attraction);
  }

  public List<Attraction> getAttractions() {
    return attractions;
  }

  static class Attraction {
    private final String name;
    private final String workingHours;
    private final int cost;

    public Attraction(String name, String workingHours, int cost) {
      this.name = name;
      this.workingHours = workingHours;
      this.cost = cost;
    }

    public String getName() {
      return name;
    }

    public String getWorkingHours() {
      return workingHours;
    }

    public int getCost() {
      return cost;
    }

    @Override
    public String toString() {
      return "Attraction{" +
              "name='" + name + '\'' +
              ", workingHours='" + workingHours + '\'' +
              ", cost=" + cost +
              '}';
    }
  }
}
