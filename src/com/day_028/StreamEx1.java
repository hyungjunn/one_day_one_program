package com.day_028;

import java.util.Comparator;
import java.util.stream.Stream;

class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("임형준", 1, 100),
                new Student("유리", 7, 100),
                new Student("제시카", 5, 150),
                new Student("티파니", 1, 150),
                new Student("서현", 2, 150),
                new Student("윤아", 3, 200),
                new Student("써니", 2, 200),
                new Student("효크", 5, 200),
                new Student("태연", 4, 300),
                new Student("수영", 3, 400),
                new Student("장원영", 2, 100),
                new Student("유진", 9, 200),
                new Student("김태희", 10, 400),
                new Student("전지현", 3, 200),
                new Student("한가인", 2, 500),
                new Student("이효리", 7, 1000),
                new Student("혜린", 9, 300)
        );

        studentStream.sorted(Comparator.comparing(Student::getTotalScore)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}
