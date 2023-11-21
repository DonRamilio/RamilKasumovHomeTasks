class Main {
  public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
  }

  static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
  }

  public static void checkSumSign() {
    int a = 10, b = 15;
    int c = a + b;
    if (c >= 0) {
      System.out.println("Сумма положительная");
    } else {
      System.out.println("Сумма отрицательная");
    }
  }

  static void printColor() {
    int value = 99;
    if (value <= 0) {
      System.out.println("Красный");
    } else if (value > 0 && value <= 100) {
      System.out.println("Желтый");
    } else {
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