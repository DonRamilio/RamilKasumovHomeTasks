package task2;

public abstract class Figure implements Colourable, IFigure {
  protected String borderColor;
  protected String fillColor;
  protected double area;
  protected double perimeter;

  public Figure(String borderColor, String fillColor) {
    this.borderColor = borderColor;
    this.fillColor = fillColor;
  }

  @Override
  public String getFillColor() {
    return this.fillColor;
  }

  @Override
  public void setFillColor(String color) {
    this.fillColor = color;
  }

  @Override
  public String getBorderColor() {
    return this.borderColor;
  }

  @Override
  public void setBorderColor(String color) {
    this.borderColor = color;
  }

  public abstract double calculatePerimeter();
}
