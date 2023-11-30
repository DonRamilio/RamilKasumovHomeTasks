package task2;

public interface IFigure {
  default double calculatePerimeter() {
    return 0;
  }

  default double calculateArea() {
    return 0;
  }
}
