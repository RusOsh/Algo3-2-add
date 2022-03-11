package com.rus;

import java.util.Scanner;



    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите начальный диапазон : ");
            int start = scanner.nextInt();
            if (start <= 0) {
                start = 1;
            }
            System.out.println("Введите конечный диапазон : ");
            int end = scanner.nextInt();
            for (int i = start; i < end; i++) {
                if (isPerfect(i)) System.out.println(i);
            }
            System.out.println("O(S + E )");
        }

        private static boolean isPerfect(int i) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum += j;
            }
            return (sum == i);
        }

    }

