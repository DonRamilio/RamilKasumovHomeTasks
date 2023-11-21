public class Plate {
  private int foodAmount = 0;

  public void putFood(int amount) {
    if (amount > 0) {
      this.foodAmount += amount;
    }
  }

  public void eatFood(int amount) {
    if (amount > 0) {
      this.foodAmount = Math.max(0, this.foodAmount - amount);
    }
  }

  public int getFoodAmount() {
    return this.foodAmount;
  }
}
