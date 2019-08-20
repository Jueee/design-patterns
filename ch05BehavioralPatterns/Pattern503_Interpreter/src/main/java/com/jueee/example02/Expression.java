package com.jueee.example02;

public abstract class Expression {
    /**
     * 以环境为准，本方法解释给定的任何一个表达式
     * @param ctx
     * @return
     */
    public abstract boolean interpret(Context ctx);

    /**
     * 校验两个表达式在结构上是否相同
     */
    public abstract boolean equals(Object obj);

    /**
     * 返回表达式的hashCode
     */
    public abstract int hashCode();

    /**
     * 将表达式转换成字符串
     */
    public abstract String toString();
}
