package BASICS;

import java.util.Scanner;

public class PerfecrtSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i * i <= a; i++) {
            if (b == i * i) {
                System.out.println(b);
                break;
            }
        }
    }
}

