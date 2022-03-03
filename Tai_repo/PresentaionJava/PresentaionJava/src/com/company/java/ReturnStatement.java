package com.company.java;

public class ReturnStatement {
    public int CompareNum()
    {
        int x = 3;
        int y = 8;
        System.out.println("x = " + x + y  +"= + y");
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String args[])
    {
        ReturnStatement obj = new ReturnStatement();
        int result = obj.CompareNum();
        System.out.println("The greater number among x and y is: " + result);
    }
}
