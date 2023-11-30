package task2;

public class Main {

  /**
   * Задание 2:
   * Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
   * Задать для каждой фигуры цвет заливки и цвет границы.
   * Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
   * Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
   */
  public static void main(String[] args) {
    Figure triangle = new Triangle(3, 4.5, 5, "White", "Black");
    Figure circle = new Circle(5, "Red", "Yellow");
    Figure rectangle = new Rectangle(3, 5, "Blue", "Orange");
    rectangle.setFillColor("Mint");
    System.out.println(triangle);
    System.out.println(circle);
    System.out.println(rectangle);
  }
}
