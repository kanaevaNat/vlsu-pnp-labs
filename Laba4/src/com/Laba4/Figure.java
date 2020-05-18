package com.Laba4;
public class Figure {
    private int a;
    private int b;
    private int c;
    private int v;

    public Figure( int v, int a, int b, int c) {
        this.v = v;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getV() {
        return v;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return "("+a + "," + b + "," + c+") - "+v;
    }
}

