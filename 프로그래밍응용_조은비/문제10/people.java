package 응용문제;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class people {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("나라 이름, 인구 >> ");
            nations.put(scanner.next(), scanner.nextInt());
        }

        Set<String> keySet = nations.keySet();
        Iterator<String> keyIter = keySet.iterator();

        int max = 0;
        String maxPop = null;
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            int population = nations.get(key);
            if (max < population) {
                    max = population;
                    maxPop = key;
            }
        }
        System.out.println("제일 인구가 많은 나라는 (" + maxPop + ", " + nations.get(maxPop) + ")");
    }
}
