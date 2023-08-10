package DAY_007;

public class ReferenceParamEx {
    public static void main(String[] args) { // main 매서드가 스택에 호출됨.
        Data d = new Data(); // Data클래스 타입의 참조변수 d를 선언한다.
        // 스택에 참조변수 d를 위한 공간이 마련된다.
        // 연산자 new에 의해 Data클래스의 인스턴스가 메모리의 빈 공간에 생성된다.
        // 주소가 0 x 100인 곳에 생성되었다고 가정하자.
        // 이 때 멤버변수는 각 자료형에 해당되는 기본값으로 초기화가 된다.
        // 여기서는 int이기 때문에 0으로 자동초기화가 된다.
        // 그 다음에 대입 연산자(=)에 의해서 생성된 객체 주솟값이 참조변수 d에 저장된다.
        // 이제 참조변수 d를 통해 Data인스턴스에 접근할 수 있다.
        d.x = 10; // 참조변수 d에 저장된 주소에 있는 인스턴스의 멤버변수 x에 10을 저장한다.
        System.out.println("main() : x = " + d.x); // 10

        change(d); // change메서드가 호출된다.
        System.out.println("After change(d)"); // 제거됨
        System.out.println("main() : x = " + d.x); // 1000
    }

    static void change(Data d) { // 참조변수 d의 값이 매개변수d에 복사됨.
        d.x = 1000; // change메서드안에서의 참조변수 d에 저장된 주소에 잇는 인스턴스의 멤버변수 x에 1000을 저장한다.
        System.out.println("change() : x = " + d.x); // 1000
    }
}
