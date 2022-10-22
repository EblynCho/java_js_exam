package 문제1;

import java.util.Scanner;

public class BuildingHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 층인지 입력하세요 >> ");
        int floor = scanner.nextInt();
        int height = 5 * floor;
        System.out.println(height + "m 입니다.");
    }
}
