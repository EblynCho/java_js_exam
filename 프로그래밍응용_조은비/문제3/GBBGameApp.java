package 응용문제;

import java.util.Scanner;

public class GBBGameApp {

    public static void main(String[] args) {
        System.out.println("가위, 바위, 보 게임을 시작합니다.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 하세요 >> ");
        String select = scanner.next();
        int rnd = (int) ((Math.random() * 3) + 1);
        if (rnd == 1) {
            System.out.println("컴퓨터 >> 가위");
        } else if (rnd == 2) {
            System.out.println("컴퓨터 >> 바위");
        } else if (rnd == 3) {
            System.out.println("컴퓨터 >> 보");
        }

        int player = 0;
        if (select.equals("가위")) {
            player = 1;
        } else if (select.equals("바위")) {
            player = 2;
        } else if (select.equals("보")) {
            player = 3;
        }

        if (Math.abs(rnd-player) == 2) {
            if ((rnd-player) > 0) {
                System.out.println("당신이 이겼습니다.");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
        else if (Math.abs(rnd-player) == 1) {
            if ((rnd-player) > 0) {
                System.out.println("컴퓨터가 이겼습니다.");
            } else {
                System.out.println("당신이 이겼습니다.");
            }
        }
        else if ((rnd-player) == 0) {
            System.out.println("무승부 입니다.");
        }

    }
}
