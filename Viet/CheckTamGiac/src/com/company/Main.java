package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh a: ");
        a = sc.nextInt();
        System.out.println("Nhập chiều dài cạnh b: ");
        b = sc.nextInt();
        System.out.println("Nhập chiều dài cạnh c: ");
        c = sc.nextInt();
    if(laTamGiac(a,b,c))
    {
        System.out.println("Đây là ba cạnh của 1 tam giác ");
        if(laTamGiacDeu(a,b,c))
        {
            System.out.println("Và là tam giác đều");
        }else
        {
            if(laTamGiacVuong(a,b,c))
            {
                System.out.println("Và là tam giác vuông ");
            }
            if(laTamGiacCan(a,b,c))
            {
                System.out.println("Và là tam giác cân ");
            }

        }
        }else
        {
            System.out.println("Không phải là 3 cạnh của 1 tam giác!!!");
        }

    }

    public static boolean laTamGiac(int a, int b, int c)
    {
        if((a+b) > c && (a+c) > b && (b+c) > a){
            return true;
        }else
            return false;

        }
    public static boolean laTamGiacCan(int a, int b, int c)
    {
        if(a == c || a == b || b == c)
        {
            return true;
        }
        else
            return false;
    }
    public static boolean laTamGiacDeu(int a, int b, int c)
    {

        if (a == b && a == c)
        {
            return true;
        }
        else
            return false;
    }
    public static boolean laTamGiacVuong( int a, int b , int c)
    {
        if( (a*a + b*b == c*c) || (b*b + c*c == a*a) || (a*a + c*c == b*b))
        {
            return true;

        }
        else
            return false;
    }
}