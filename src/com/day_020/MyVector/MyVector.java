package com.day_020.MyVector;

import java.util.Arrays;

class MyVector {
    Object[] objArr;

    private int capacity;

    private int size;

    MyVector() {
        this(16);
    }

    public MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("유효하지 않은 값입니다. : " + capacity);
        }
        this.capacity = capacity;
        objArr = new Object[this.capacity];
    }

    // 객체배열에 저장된 객체의 개수를 저장하기 위한 인스턴스 변수 size를 추가하고, 이 변수의 값을 반환하는 size()
    public int size() {
        return this.size;
    }

    // 배열 objArr의 길이를 반환하는 capacity()
    public int capacity() {
        return capacity;
    }

    // 객체배열이 비었는지 확인하는 boolean isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }

    // 객체배열 objArr에 객체를 추가하는 메서드 void add(Object obj)
    public void add(Object obj) {
        objArr[size++] = obj;
    }

    // 객체 배열 objArr에 저장된 객체를 반환하는 Object get(index)
    Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return objArr[index];
    }

    // 문자열 반환 오버라이딩
    @Override
    public String toString() {
        return "MyVector{" +
                "objArr=" + Arrays.toString(objArr) +
                '}';
    }

    // 객체 배열 objArr에서 지정된 객체가 저장되어 있는 위치(index)를 반환하는 int indexOf(Object obj)
    public int indexOf(Object obj) {
        for (int index = 0; index < size; index++) {
            if (obj.equals(objArr[index]) && objArr[index] != null) {
                return index;
            }
        }
        return -1;
//        if (index == null) {
//            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
//        }
    }

    // 객체배열 objArr에서 지정된 객체를 삭제하는 boolean remove(Object obj)를 작성(indexof()를 이용)
    public boolean remove(Object obj) {
        // null값을 지정 객체 자리에 넣어 삭제
        objArr[indexOf(obj)] = null;
        // 객체의 자리가 맨끝이 아닐때
        if (indexOf(obj) != size - 1 && indexOf(obj) != -1 ) {
            for (int i = indexOf(obj); i < size - 1; i++) {
                objArr[i] = objArr[i + 1];
            }
        }
        // 마지막 자리에 null
        objArr[size - 1] = null;
        // size 1줄어든다
        size--;
        // true 반환
        return true;
    }
}
