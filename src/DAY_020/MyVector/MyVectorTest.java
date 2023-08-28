package DAY_020.MyVector;

class MyVectorTest {
    public static void main(String[] args) {
        MyVector myVector = new MyVector();
        myVector.add(1);
        myVector.add(2);
        myVector.add(3);
        myVector.add(4);
        myVector.add(5);
        System.out.println(myVector);
        System.out.println(myVector.indexOf(1));
    }
}
