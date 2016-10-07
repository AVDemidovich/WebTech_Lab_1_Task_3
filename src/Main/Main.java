package Main;

import java.util.Scanner;
import Handler.Handler;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = sc.nextInt();
        System.out.print("Введите b: ");
        int b = sc.nextInt();
        System.out.print("Введите шаг h: ");
        int h = sc.nextInt();
        System.out.println("X      tg(x)");
        while(a <= b){
            System.out.println(a + "      " + Handler.calculate(a));
            a+=h;
        }
    }
}
