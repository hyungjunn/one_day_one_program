package DAY_013.Quiz;

public class Quiz {

    int x;
    int y;
    int z;

    int mid(int x, int y, int z) {
        int midValue = 0;
        if (y <= x && x <= z || z <= x && x <= y) {
            midValue = x;
        }
        if (x <= y && y <= z || z <= y && y <= x) {
            midValue = y;
        }
        if (x <= z && z <= y || y <= z && z <= x) {
            midValue = z;
        }
        return midValue;
    }
}

