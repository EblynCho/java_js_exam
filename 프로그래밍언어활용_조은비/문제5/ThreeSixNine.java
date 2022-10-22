package 문제5;

import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};


        while (true) {
            System.out.print("영어 단어를 입력하세요 >> ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.next();

            if (word.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }

            int index = -1;
            for (int i = 0; i < eng.length; i++) {
                if (word.equals(eng[i])) {
                    index = i;
//                    System.out.println(kor[i]);
                }
            }
            if (index > -1) {
                System.out.println(kor[index]);
            }
            else {
                System.out.println("그런 영어 단어가 없습니다.");
            }
        }
    }
}
