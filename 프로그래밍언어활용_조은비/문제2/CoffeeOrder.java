package 문제2;

import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("커피 주문하세요 >> ");
        String coffee = scanner.next();
        int qty = scanner.nextInt();
        int price;

        if (coffee.equals("에스프레소")) {
            price = 2000;
            System.out.println((qty * price) + "원 입니다.");
        } else if (coffee.equals("아메리카노")) {
            price = 2500;
            System.out.println((qty * price) + "원 입니다.");
        } else if (coffee.equals("카푸치노")) {
            price = 3000;
            System.out.println((qty * price) + "원 입니다.");
        } else if (coffee.equals("카페라떼")) {
            price = 3500;
            System.out.println((qty * price) + "원 입니다.");
        }


    }
}
