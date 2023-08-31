package DAY_024.FruitBox;

class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
        Box<Grape> grapeBox = new Box<Grape>();
        // Box<Grape> grapeBox1 = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // OK. void add(Fruit item)

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        // appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만을 담을 수 있음
        toyBox.add(new Toy());

        toyBox.add(new Toy());
        toyBox.add(new Toy());
        toyBox.add(new Toy());

        for (int i = 0; i < 5; i++) {
            toyBox.add(new Toy());
        }

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}
