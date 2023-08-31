package DAY_020.MyVector;

import org.junit.jupiter.api.Test;
import static DAY_020.MyVector.MyVector.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyVectorTest1 {

    @Test
    public void Test() {
        MyVector v = new MyVector();
        for (int i = 1; i <= 10_000_000_00; i++) {
            v.add(i);
        }
        assertTrue((10_000_000_00)==(v.size()));
        // assertThat((v.size()).equalsTo(10_000_000_000L));
    }

    @Test
    void Test1() {
        MyVector myVector = new MyVector();

        assertTrue(myVector.isEmpty() == true);
    }
}