package com.day_024.FruitBox;

class FruitBoxDemo {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        // FruitBox<Toy> toyBox = new Box<Toy>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // Box<Grape> grapeBox1 = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // OK. void add(Fruit item)
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        // appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만을 담을 수 있음
        grapeBox.add(new Grape());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
    }
}
