package task1;

public class Cat extends Animal {
  private static int count = 0;
  private boolean isFull = false;

  public Cat(String name) {
    super(name);
    count++;
  }

  public static void printCreatedCount() {
    System.out.println("Создано котов: " + count);
  }

  @Override
  public void run(int distance) {
    if (distance <= 200) {
      super.run(distance);
    } else {
      System.out.println("Кошкэ не может пробежать более 200м.");
    }
  }

  @Override
  public void swim(int distance) {
    System.out.println("Кошка не умеет плавать.");
  }

  public void eat(Plate plate, int amount) {
    if (amount <= plate.getFoodAmount()) {
      plate.eatFood(amount);
      this.isFull = true;
    }
  }

  public void printFullnessInfo() {
    String readableFullness = this.isFull ? "сыт" : "голоден";
    System.out.println("Сытость кота " + this.name + ": " + readableFullness);
  }
}
