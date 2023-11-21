class Main {
  public static void main(String[] args) {
    Cat firstCat = new Cat("Snowball");
    Cat secondCat = new Cat("Paw");
    Dog dog = new Dog("Scratchy");

    firstCat.run(500);
    firstCat.swim(100);
    dog.run(120);

    Animal.printCreatedCount();
    Cat.printCreatedCount();
    Dog.printCreatedCount();

    Cat[] cats = new Cat[]{firstCat, secondCat};
    Plate plate = new Plate();
    plate.putFood(50);
    for (Cat currentCat : cats) {
      firstCat.eat(plate, 30);
    }
    firstCat.printFullnessInfo();
    secondCat.printFullnessInfo();

  }
}