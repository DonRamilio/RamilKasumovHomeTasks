public class Dog extends Animal {
  private static int count = 0;

  public Dog(String name) {
    super(name);
    count++;
  }

  public static int getCount() {
    return count;
  }

  @Override
  public void run(int distance) {
    if (distance <= 500) {
      super.run(distance);
    } else {
      System.out.println("Собака не может пробежать более 500м.");
    }
  }

  @Override
  public void swim(int distance) {
    if (distance <= 10) {
      super.swim(distance);
    } else {
      System.out.println("Собака не может проплыть более 10м.");
    }
  }
}
