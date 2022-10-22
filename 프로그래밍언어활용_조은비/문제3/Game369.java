package 문제3;

import java.util.Scanner;

public class Game369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("1 ~ 99 사이의 정수를 입력하세요 >> ");
            int num = scanner.nextInt();

            int num1 = num / 10;
            int num2 = num % 10;

            if (num == 0) {
                System.out.println("종료합니다");
                break;
            }
            if (num1 == 0) {
                if (num2 % 3 == 0) {
                    System.out.println("박수짝");
                }
                else {
                    System.out.println("박수없음");
                }
            }

            else {
                if ((num1 % 3 == 0) && (num2 % 3 == 0)) {
                    if (num2 == 0) {
                        System.out.println("박수짝");
                    }
                    else {
                        System.out.println("박수짝짝");
                    }
                } else if ((num1 % 3 == 0) || (num2 % 3 == 0)) {
                    if (num2 == 0) {
                        System.out.println("박수없음");
                    }
                    else {
                        System.out.println("박수짝");
                    }
                } else {
                    System.out.println("박수없음");
                }
            }
        }
    }
}
