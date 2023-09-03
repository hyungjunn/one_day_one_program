package com.day_022;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        if (str1 == str2) {
            System.out.println("str1 == str2 ? : " + (str1 == str2));
        } else {
            System.out.println("str1 == str2 > : " + (str1 == str2));
        }
        // Java에서 문자열 리터럴은 컴파일 시에 클래스 파일에 저장된다.
        // 이 때 같은 내용의 문자열 리터럴은 한번만 저장된다.
        // 왜? 문자열 리터럴도 문자열 인스턴스이고 immutable하기 때문에 불변이다.
        // 해당 클래스 파일이 클래스 로더에 올라갈 때 JVM에 있는 'constant pool'에 저장된다.
        // 이 때 "Java"와 같은 문자열 리터럴이 자동으로 생성되어 저장되는 것이다.

        String str3 = new String("Java");

        if (str1 == str3) {
            System.out.println("str1 == str3 ? : " + (str1 == str3));
        } else {
            System.out.println("str1 == str3 ? : " + (str1 == str3));
        }
        // new 연산자에 의해 메모리 할당이 일어나고 새로운 String인스턴스가 생긴다.
        // 따라서 new 연산자를 사용할 때 마다 새로운 String인스턴스가 생성되게 된다.

    }
}
