package 문제6;

import java.util.Scanner;

public class Phone {
    private String name, tel;
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName() { return name; }
    public String getTel() { return tel; }

    public static void main(String[] args) {
        System.out.print("이름과 전화번호 입력 >> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String tel = scanner.next();
        Phone phone1 = new Phone(name, tel);

        System.out.print("이름과 전화번호 입력 >> ");
        scanner = new Scanner(System.in);
        name = scanner.next();
        tel = scanner.next();
        Phone phone2 = new Phone(name, tel);

        System.out.println(phone1.getName() + "의 번호 " + phone1.getTel());
        System.out.println(phone2.getName() + "의 번호 " + phone2.getTel());
    }
}
