package 응용문제;

import java.util.ArrayList;
import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F) >> ");
        String ArrayList[] = new String[5];
        for (int i = 0; i < ArrayList.length; i++) {
            ArrayList[i] = scanner.next();
//            System.out.println(ArrayList[i]);
        }

        double score = 0.0;
        for (int i = 0; i < ArrayList.length; i++) {
            if (ArrayList[i].equals("A")) {
                score = 5.0;
            } else if (ArrayList[i].equals("B")) {
                score = 4.0;
            } else if (ArrayList[i].equals("C")) {
                score = 3.0;
            } else if (ArrayList[i].equals("D")) {
                score = 2.0;
            } else if (ArrayList[i].equals("F")) {
                score = 1.0;
            }
            System.out.print(score + " ");
        }

    }
}
