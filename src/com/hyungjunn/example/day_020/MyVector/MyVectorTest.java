package com.hyungjunn.example.day_020.MyVector;

class MyVectorTest {
    public static void main(String[] args) {
        MyVector myVector = new MyVector();
        myVector.add(1);
        myVector.add(2);
        myVector.add(3);
        myVector.add(4);
        myVector.add(5);
        myVector.add("Ja");
        myVector.add("va");
        myVector.add("의");
        myVector.add("정");
        myVector.add("석");

        System.out.println(myVector);
        System.out.println(myVector.indexOf(1));
        myVector.remove(3);
        System.out.println(myVector);
    }
}
