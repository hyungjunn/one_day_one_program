package DAY_020;

import java.util.Arrays;

class MyVector {
    Object[] objArr = null;

    int capacity = 0;

    int size = 0;

    MyVector() {
        this(16);
    }

    public MyVector(int capacity) {
        this.capacity = capacity;
    }

    // 객체배열에 저장된 객체의 개수를 저장하기 위한 인스턴스 변수 size를 추가하고, 이 변수의 값을 반환하는 size()
    int size() {
        return this.size;
    }

    // 배열 objArr의 길이를 반환하는 capacity()
    int capacity() {
        return objArr.length;
    }

    // 객체배열이 비었는지 확인하는 boolean isEmpty()
    boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    // 객체배열 objArr에 객체를 추가하는 메서드 void add(Object obj)를 작성하시오.
    void add(Object obj) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            objArr[count] = obj;
            count++;
        }
    }

    // 객체 배열 objArr에 저장된 객체를 반환하는 Object get(index)를 작성
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

    // 객체 배열 objArr에서 지정된 객체가 저장되어 있는 위치(index)를 반환하는 int indexOf(Object obj)를 작성
    int indexOf(Object obj) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
//        }
//        if (obj == objArr[index]) {
//            return index;
//        }
//        if (obj.equals(objArr[int index])) {
//            return index;
//        }
        for (int index = 0; index < size; index++) {
            if (obj.equals(objArr[index])) {
                return index;
            }
        }
        return 0;
    }

    // 객체배열 objArr에서 지정된 객체를 삭제하는 boolean remove(Object obj)를 작성(indexof()를 이용)
    boolean remove(Object obj) {
        objArr[indexOf(obj)] = null;
        return true;
    }
}
