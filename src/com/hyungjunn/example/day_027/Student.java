package com.hyungjunn.example.day_027;

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName(){return name;}
    int getBan(){return ban;}
    int getTotalScore(){return totalScore;}

    // 총점 내림차순을 기본 정렬로 한다.
    public int compareTo(Student student) {
        return student.totalScore - this.totalScore;
    }
}
