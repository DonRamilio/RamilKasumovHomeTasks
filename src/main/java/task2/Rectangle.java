package task2;

public class Rectangle extends Figure {
  private final double firstSide;
  private final double secondSide;

  public Rectangle(double firstSide, double secondSide, String borderColor, String fillColor) {
    super(borderColor, fillColor);
    this.firstSide = firstSide;
    this.secondSide = secondSide;
    this.area = this.calculateArea();
    this.perimeter = this.calculatePerimeter();
  }

  @Override
  public double calculateArea() {
    return this.firstSide * this.secondSide;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * (this.firstSide + this.secondSide);
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "firstSide=" + firstSide +
            ", secondSide=" + secondSide +
            ", borderColor='" + borderColor + '\'' +
            ", fillColor='" + fillColor + '\'' +
            ", area=" + area +
            ", perimeter=" + perimeter +
            '}';
  }
}
