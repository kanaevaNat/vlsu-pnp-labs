package com.Laba6;
public class Main {
    private static AbstractNode generateFirst() {
        return new IsclNode(
                new IsclNode(new SimpleNode(true),new NegNode(new SimpleNode(false))),
                new NegNode(new SimpleNode(true)));
    }
    private static AbstractNode generateSecond() {
        return new NegNode(
                new IsclNode(new NegNode(new SimpleNode(true)),new NegNode(new SimpleNode(false))));
    }
    public static void main(String[] args) {
        AbstractNode first = generateFirst();
        AbstractNode second = generateSecond();
        System.out.println("The first expression is: " + first + "\tValue is: " + first.calculate());
        System.out.println("The second expression is: " + second + "\t\t\tValue is: " + second.calculate());
    }
}
