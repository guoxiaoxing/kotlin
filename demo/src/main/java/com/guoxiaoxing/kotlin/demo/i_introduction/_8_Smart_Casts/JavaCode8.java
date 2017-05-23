package com.guoxiaoxing.kotlin.demo.i_introduction._8_Smart_Casts;

import com.guoxiaoxing.kotlin.demo.util.JavaCode;

public class JavaCode8 extends JavaCode {
    public int eval(Expr expr) {
        if (expr instanceof Num) {
            return ((Num) expr).getValue();
        }
        if (expr instanceof Sum) {
            Sum sum = (Sum) expr;
            return eval(sum.getLeft()) + eval(sum.getRight());
        }
        throw new IllegalArgumentException("Unknown expression");
    }
}
