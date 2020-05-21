package com.Laba6;
public class NegNode implements AbstractNode {
    private final AbstractNode node;
    public NegNode(AbstractNode node) {
        this.node = node;
    }
    @Override
    public boolean calculate() {
        return !(node.calculate());
    }
    public String toString() {
        return "!(" + node + ")" ;
     }
}

