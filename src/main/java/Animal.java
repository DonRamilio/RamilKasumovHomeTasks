public class Animal {
  private static int count = 0;
  private final String name;

  public Animal(String name) {
    this.name = name;
    Animal.count++;
  }

  public static void printCreatedCount() {
    System.out.println("Создано животных: " + count);
  }

  public void run(int distance) {
    System.out.printf("%s пробежал %d метров.\n", this.name, distance);
  }

  public void swim(int distance) {
    System.out.printf("%s проплыл %d метров.\n", this.name, distance);
  }
}
