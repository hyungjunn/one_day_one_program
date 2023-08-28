package DAY_022;

import java.util.Arrays;

// 배열의 복사 완벽 분석
// 모든 과정 세세히 작성한다.
public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
        // 1. int배열 타입의 참조변수 arr이 선언되고 arr을 위한 공간이 생성된다.
        // 2. new 연산자에 의해 길이가 5인 int배열 인스턴스가 생성된다.
        // 2-1. 이 때, 이 인스턴스의 주소를 1X100이라고 가정한다.
        // 2-2. 각 요소에는 int타입의 기본값인 0이 초기화된다.
        // 3. (=)대입연산자에 의해 인스턴스의 주소가 참조변수 arr에 저장된다.
        // 4. int배열 타입의 참조변수 arr은 주소가 같은 인스턴스를 가리키게 된다.
        /**
         * 배열은 한 번 생성하면 그 길이를 변경할 수 없기 때문에
         * 더 많은 저장공간이 필요하다면 보다 큰 배열을 새로 만들고
         * 이전 배열로부터 그 내용을 복사해야 한다.
         */
        // 1. 길이가 두배인 새로운 배열 tmp를 생성한다.
        int[] tmp = new int[arr.length * 2];
        // 2. for문을 이용하여 배열 arr의 모든 요소에 저장된 값을 하나씩 배열 tmp에 복사한다.
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        // 3. 배열 arr의 주소가 tmp를 가리키도록 한다.(참조 변수의 값을 arr에 저장한다. 변수의 타입이 배열타입이라 결국 값이 주소다.)
        arr = tmp;

        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 0, 0, 0, 0, 0]
    }
}
