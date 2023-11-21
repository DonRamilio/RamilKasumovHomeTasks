class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("animal");
    Animal cat = new Cat("Snowball");
    Animal secondCat = new Cat("Paw");
    Animal dog = new Dog("Scratchy");

    cat.run(500);
    cat.swim(100);
    dog.run(120);

    Animal.printCreatedCount();
    Cat.printCreatedCount();
    Dog.printCreatedCount();
  }
}