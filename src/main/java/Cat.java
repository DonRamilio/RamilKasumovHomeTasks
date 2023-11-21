public class Cat extends Animal {
  private static int count = 0;

  public Cat(String name) {
    super(name);
    count++;
  }

  public static int getCount() {
    return count;
  }

  @Override
  public void run(int distance) {
    if (distance <= 200) {
      super.run(distance);
    } else {
      System.out.println("Собака не может пробежать более 200м.");
    }
  }

  @Override
  public void swim(int distance) {
    System.out.println("Кошка не умеет плавать.");
  }
}
