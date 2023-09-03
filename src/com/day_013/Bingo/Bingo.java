package com.day_013.Bingo;

public class Bingo {
    int bingoCount(int[][] bingo) {

        int horizontal = 0; // 가로 줄
        int vertical = 0; // 세로 줄
        int diagonal1 = 0; // 대각선1 줄
        int diagonal2 = 0; // 대각선2 줄

        // 1. 가로줄 세기
        int sum = 0;
        for (int i = 0; i <= 4 ; i++) {
            for (int j = 0; j <= 4; j++) {
                sum += bingo[i][j];
                if (sum == 5) {
                    horizontal++;
                }
            }
            sum = 0;
        }
        // 2. 세로줄 세기
        for (int i = 0; i <= 4 ; i++) {
            for (int j = 0; j <= 4; j++) {
                sum += bingo[j][i];
                if (sum == 5) {
                    vertical++;
                }
            }
            sum = 0;
        }
        // 3. 대각선1 세기
        if (bingo[0][0] + bingo[1][1] + bingo[2][2] + bingo[3][3] + bingo[4][4] == 5) {
            diagonal1++;
        }

        // 4. 대각선2 세기
        if (bingo[0][4] + bingo[1][3] + bingo[2][2] + bingo[3][1] + bingo[4][0] == 5) {
            diagonal2++;
        }
        int bingoCount = 0; // 전체 빙고 카운트
        bingoCount = horizontal + vertical + diagonal1 + diagonal2;

        return bingoCount;
    }

    public static void main(String[] args) {
        Bingo b = new Bingo();
        int[][] bingo = {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(b.bingoCount(bingo));
    }
}



//        if (bingo[0][0] + bingo[0][1] + bingo[0][2] + bingo[0][3] + bingo[0][4] == 5) {
//            horizontal++;
//        }
//        if (bingo[1][0] + bingo[1][1] + bingo[1][2] + bingo[1][3] + bingo[1][4] == 5) {
//            horizontal++;
//        }
//        if (bingo[2][0] + bingo[2][1] + bingo[2][2] + bingo[2][3] + bingo[2][4] == 5) {
//            horizontal++;
//        }
//        if (bingo[3][0] + bingo[3][1] + bingo[3][2] + bingo[3][3] + bingo[3][4] == 5) {
//            horizontal++;
//        }
//        if (bingo[4][0] + bingo[4][1] + bingo[4][2] + bingo[4][3] + bingo[4][4] == 5) {
//            horizontal++;
//        }
