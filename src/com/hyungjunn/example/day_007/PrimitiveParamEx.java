package com.hyungjunn.example.day_007;



class PrimitiveParamEx {
    public static void main(String[] args) { // main매서드가 스택에 호출된다.
        Data d = new Data(); // Data 타입의 참조 변수 d를 선언하고 스택에 참조 변수 d를 위한 공간이 마련된다.
        // 연산자 new에 의해 Data클래스의 인스턴스가 메모리의 빈 공간에 생성된다.
        // 주소가 0 x 100 인곳에 생성되었다고 가정하자.
        // 이 때 멤버변수는 각 자료형에 해당되는 기본값으로 초기화된다.
        // 여기서는 int이므로 0으로 자동초기화된다.
        // 그 다음에 대입연산자(=)에 의해서 생성된 객체의 주솟값이 참조변수 d에 저장된다.
        // 이제 참조변수 d를 통해 Data인스턴스에 접근가능하다.
        d.x = 10; // 참조변수 d에 저장된 주소에 있는 인스턴스의 멤버변수 x에 10을 저장한다.
        System.out.println("main() : x = " + d.x); // d.x = 10

        change(d.x); // change 메서드가 호출되고 멤버변수 x가 chage메서드의 매개변수로 복사된다.
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x); // 10
    }

    static void change(int x) { // d가 가리키는 x의 값이 매개변수 x에 복사됨.
        x = 1000; // change메서드에서 x를 1000으로 변경
        System.out.println("change() : x = " + x); // 1000
    }
    // change메서드가 종료되면서 매개변수 x는 스택에서 제거된다.
}