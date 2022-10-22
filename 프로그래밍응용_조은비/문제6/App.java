package 응용문제;

import java.util.Scanner;

abstract class Calculator {
    protected int a, b;
    protected void input() { // 두 정수를 입력받는 메서드
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 2개를 입력하세요>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }
    public void run() { // 두 정수를 입력받아 계산하고 결과를 출력하는 메서드
        input();
        int res = calc();
        System.out.println("계산된 값은 " + res);
    }
    abstract protected int calc(); // 추상 메소드
}

// 이 곳에 Addr와 Subtracter 클래스를 입력하시요
class Adder extends Calculator {

    @Override
    protected int calc() {
        return a + b;
    }
}

class Subtracter extends Calculator {

    @Override
    protected int calc() {
        return a - b;
    }
}


public class App {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter sub = new Subtracter();

        adder.run();
        sub.run();
    }
}