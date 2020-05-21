package com.Laba6;
public class IsclNode implements AbstractNode{
    private final AbstractNode left;
    private final AbstractNode right;
    public IsclNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public boolean calculate() {
        return (left.calculate() ^ right.calculate());
    }
    public String toString() {
        return "(" + left + ") ^ (" + right + ")";
    }
}

