package 문제7;

import java.util.Scanner;

public class PhoneManager extends Phone {
    public PhoneManager(String name, String tel) {
        super(name, tel);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수 >> ");
        int pNum = scanner.nextInt();

        Phone list[] = new Phone[pNum];

        for (int i = 0; i < list.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
            list[i] = new Phone (scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("검색할 이름 >> ");
            String search = scanner.next();
            int index = -1;

            if (search.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            for (int i = 0; i < list.length; i++) {
                if (search.equals(list[i].getName())) {
                    index = i;
                }
            }

            if (index > -1) {
                System.out.println(list[index].getName() + "의 번호는 " + list[index].getTel() +" 입니다.");
            }
            else {
                System.out.println(search + " 은(는) 없습니다.");
            }
        }


    }
}
