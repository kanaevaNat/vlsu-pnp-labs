package com.Laba4;
import java.util.Scanner;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    private Figure read(Scanner sc) {
        System.out.println("Please enter a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int v = a*b*c;
        return new Figure(v, a, b, c);
    }
    private void run() {
        List list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter N");
        int n = sc.nextInt();
        for (int i = 0;i<n;i++) {
            list.add(read(sc));
        }
        sort(list);
    }
    private void sort(List list) {
        Collections.sort(list, new VComparator());
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}

