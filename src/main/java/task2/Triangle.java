package task2;

public class Triangle extends Figure {
  private final double firstSideLength;
  private final double secondSideLength;
  private final double thirdSideLength;

  public Triangle(double firstSideLength, double secondSideLength, double thirdSideLength, String borderColor, String fillColor) {
    super(borderColor, fillColor);
    this.firstSideLength = firstSideLength;
    this.secondSideLength = secondSideLength;
    this.thirdSideLength = thirdSideLength;
    this.area = this.calculateArea();
    this.perimeter = this.calculatePerimeter();
  }

  @Override
  public double calculateArea() {
    double halfPerimeter = calculatePerimeter() / 2;
    return Math.sqrt(halfPerimeter
            * (halfPerimeter - this.firstSideLength)
            * (halfPerimeter - this.secondSideLength)
            * (halfPerimeter - this.thirdSideLength));
  }

  @Override
  public double calculatePerimeter() {
    return this.firstSideLength + this.secondSideLength + this.thirdSideLength;
  }

  @Override
  public String toString() {
    return "Triangle{" +
            "firstSideLength=" + firstSideLength +
            ", secondSideLength=" + secondSideLength +
            ", thirdSideLength=" + thirdSideLength +
            ", borderColor='" + borderColor + '\'' +
            ", fillColor='" + fillColor + '\'' +
            ", area=" + area +
            ", perimeter=" + perimeter +
            '}';
  }
}
