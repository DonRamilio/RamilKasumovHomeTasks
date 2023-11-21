package task2;

public class Circle extends Figure {
  private double radius;

  public Circle(double radius, String borderColor, String fillColor) {
    super(borderColor, fillColor);
    this.radius = radius;
    this.area = this.calculateArea();
    this.perimeter = this.calculatePerimeter();
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * this.radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            ", borderColor='" + borderColor + '\'' +
            ", fillColor='" + fillColor + '\'' +
            ", area=" + area +
            ", perimeter=" + perimeter +
            '}';
  }
}
