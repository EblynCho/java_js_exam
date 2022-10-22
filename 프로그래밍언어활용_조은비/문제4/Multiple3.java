package 문제4;

import java.util.Scanner;

public class Multiple3 {
    public static void main(String[] args) {
        int arr[];
        arr = new int[10];
        System.out.print("정수 10개 입력 >> ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("3의 정수 >> ");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3) == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
