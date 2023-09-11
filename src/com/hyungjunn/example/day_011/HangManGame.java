package com.hyungjunn.example.day_011;

import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {

        System.out.println("Welcome to Hangman!");

        String[] arr = {"java", "kotlin", "rust", "scala"};

        String secret = arr[(int) (Math.random() * arr.length)]; // 목록에서 무작위 단어를 비밀 단어로 선택

        // 비밀 단어의 각 글자에 대해 빈 자리 표시를 표시합니다.
        char[] letters = new char[secret.length()];

        System.out.println("Guess the secret word :");

        for (int i = 0; i < secret.length(); i++) {
            letters[i] = '_';
        }


        while (true) {
            boolean isGameFinished = true;
            for (int i = 0; i < secret.length(); i++) {
                if (letters[i] == '_') {
                    isGameFinished = false;
                }
                System.out.print(letters[i]);
            }

            if (isGameFinished) {
                System.out.println();
                System.out.println("맞췄습니다!!!!");
                break;
            }

            System.out.println();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Guess a letter : ");

            char word = scanner.nextLine().charAt(0);

            for (int i = 0; i < secret.length(); i++) {
                if (word == secret.charAt(i)) {
                    letters[i] = word;
                }
            }
        }
    }
}
/**
 * 구현 단계:
 * <p>
 * 1. 비밀 단어의 목록을 작성합니다.
 * 2. 목록에서 무작위 단어를 비밀 단어로 선택합니다.
 * 3. 비밀 단어의 각 글자에 대해 빈 자리 표시를 표시합니다.
 * 4. 플레이어에게 글자를 추측하도록 허용합니다.
 * 5. 추측한 글자가 비밀 단어에 있는지 확인합니다.
 * - 맞다면, 정확히 추측한 글자를 자리 표시에 표시합니다.
 * - 아니라면, 행맨 그림의 일부를 표시하고 횟수를 하나 감소합니다.
 * 6. 단어 전체를 맞추거나 횟수를 모두 소진할 때까지 단계 4와 5를 반복합니다.
 * 7. 결과(승리 또는 패배)와 비밀 단어를 표시합니다.
 */