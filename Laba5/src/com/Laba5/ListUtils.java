package com.Laba5;

import java.text.NumberFormat;
import java.text.ParsePosition;

public class ListUtils {
    public static ListElement insert(ListElement first, String value) {
        if (first == null) {
            return new ListElement(value);
        } else {
            ListElement p = first;
            while (p.getNext() != null) p = p.getNext();
            p.setNext(new ListElement(value));
            return first;
        }
    }
    static ListElement p = null;
    static String v = "";
    public static ListElement filter(ListElement first) {
        if (first != null) {
            v = first.getValue();
            if (isNumeric(v)) p = insert(p, v);
            filter(first.getNext());
        }
        return p;
    }

    public static String reduce(ListElement first) {
        String sum = "";
        while (first != null) {
            sum += first.getValue();
            first = first.getNext();
        }
        return sum;
    }
    public static boolean isNumeric(String str)
    {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }
}

