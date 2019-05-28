package ir.mmkh.aptest;

import java.io.Serializable;
import java.util.ArrayList;

public class ToSerialize implements Serializable {

    private String a;
    private int b;
    transient private int c;
    private static int d;

    private String test;

    public ToSerialize(){
        test = "2";
    }

    public void changeTest(){
        test = "1";
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static void setD(int d) {
        ToSerialize.d = d;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getC() {
        return c;
    }

    public int getB() {
        return b;
    }
}
