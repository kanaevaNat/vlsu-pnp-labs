package com.Laba5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int N = sc.nextInt();
        System.out.println("Enter the elements themselves");
        ListElement first = null;
        for (int i = 0; i < N; i++) {
            String value = sc.next();
            first = ListUtils.insert(first, value);
        }
        String result = ListUtils.reduce(ListUtils.filter(first));
        System.out.println(result);
    }
}
