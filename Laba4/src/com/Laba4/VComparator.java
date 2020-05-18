package com.Laba4;
import java.util.Comparator;
public class VComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Figure p1 = (Figure) o1;
        Figure p2 = (Figure) o2;
        int res;
        if(p1.getV()> p2.getV())
            res = 1;
        else if(p1.getV()< p2.getV())
            res = -1;
        else
            res = 0;
        if (res != 0) return res;
        if(p1.getA()> p2.getA())
            res = 1;
        else if(p1.getA()< p2.getA())
            res = -1;
        else
            res = 0;
        if (res != 0) return res;
        if(p1.getB()> p2.getB())
            res = 1;
        else if(p1.getB()< p2.getB())
            res = -1;
        else
            res = 0;
        return res;
    }
}
