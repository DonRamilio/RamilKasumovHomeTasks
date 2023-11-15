
class Main {
  public static void main(String[] args) {
    printThreeWords();
    System.out.println("The sum is " + (isSumPositive(5, -6)? "positive" : "negative"));
    printColor();
    compareNumbers();
  }

  static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
  }

  static boolean isSumPositive(int a, int b) {
    return a + b >= 0;
  }

  static void printColor() {
    int value = 99;
    if (value <= 0) {
      System.out.println("Красный");
    }
    if (value <= 100) {
      System.out.println("Желтый");
    }
    if (value > 100) {
      System.out.println("Зеленый");
    }

  }

  static void compareNumbers() {
    int a = 6;
    int b = 7;
    if (a >= b) {
      System.out.println("a >= b");
    } else {
      System.out.println("a < b");
    }
  }
}