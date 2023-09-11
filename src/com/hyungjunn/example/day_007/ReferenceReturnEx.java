package com.hyungjunn.example.day_007;

public class ReferenceReturnEx {
    public static void main(String[] args) { // main메서드가 스택에 호출된다.
        Data d = new Data();
        // Data클래스 타입의 참조변수 d를 선언한다.
        // 메모리(스택)에 참조변수 d를 위한 공간이 마련된다.
        // new 연산자에 의해 Data클래스의 인스턴스가 메모리의 빈 공간(힙)에 생성된다.
        // 주소가 0 x 100인 곳에 생성되었다고 가정하자.
        // 이 때 멤버 변수는 각 자료형에 해당되는 기본값으로 초기화되기 때문에 0으로 초기화가 된다.
        // 그 다음에 대입연산자(=)에 의해 생성된 객체의 주소값이 참조변수 d에 저장된다.
        // 이제 참조변수 d를 통해 Data인스턴스에 접근할 수 있다.
        d.x = 10; // 참조변수 d에 저장된 주소에 있는 인스턴스의 멤버변수 x에 10d을 저장한다.

        Data d2 = copy(d); // 한편, 메인 메서드 위에 Data클래스 타입의 참조변수 d2가 생성된다.
        // 그리고 copy매서드가 호출된다.
        // (After)
        // 반환되고  참조변수 d2에 저장.
        // d2에 저장된 주소에 있는 인스턴스 멤버변수를 가리키게 된다.
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d) { // 참조변수 d가 매개변수 d에 복사된다.
        Data tmp = new Data();
        // tmp 참조변수가 새로 생성, 새로운 Data객체 생성.
        // 주솟값이 0 x 200인 곳에 생성되었다고 가정.
        tmp.x = d.x;
        // 참조변수 d에 저장된 주소에 있는 인스턴스의 멤버변수 x의 값이 tmp주소에 있는 멤버 변수 x에 저장.

        return tmp; // tmp로 반환. tmp에 저장된 주소 0 x 200을 반환
    }
}
