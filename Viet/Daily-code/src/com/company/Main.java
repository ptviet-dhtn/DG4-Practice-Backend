package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

public class Main  {

    public static void main (String... args) throws FileNotFoundException {
	/* Hello world
        System.out.println("Hello Viet");
    */
    //Các kiểu dữ liệu:
        //kiểu số có 2 dạng là số nguyên(int, byte , short, long) và số thực có chứa dấu phẩy( gồm float và double)
            //ví dụ:
             int A = 100000;
             System.out.println(A);

             byte B = 120;
             System.out.println(B);

             short C = 32000;
             System.out.println(C);

             long D = 17L;
             System.out.println(D);

            //Ví dụ kiểu số thập phân:
             float E = 5.75f;
             System.out.println(E);

             double F = 16.02d;
             System.out.println(F);

        //kiểu booleans:
        boolean Viet = true;
        boolean Nam = false;
        System.out.println(Viet);
        System.out.println(Nam);

        //Kiểu ký tự:
        char kytu = 'A';
        System.out.println(kytu);

        //Kiểu chuỗi:
        String tentoi = "Viet";
        System.out.println(tentoi);

        //ép kiểu:
        float a = 5.5f;
        float b = 10.8f;
        int d = (int) ((int) a + b);
        System.out.println(d); // => d = 15

    //Câu điều kiện:
        //IF-ELSE:
        int canhA = 3, canhB = 4, canhC = 5;
        if( canhA == 3 && canhB == 4 && canhC == 5)
        {
            System.out.println("Đây là 3 cạnh của 1 tam giác vuông");
        }

    // input từ file:

        int I, J, K;
        Scanner sc = new Scanner(new File("input.txt"));
        System.out.print("Nhập I: ");
        I = sc.nextInt();
        J = sc.nextInt();
        K = sc.nextInt();
        System.out.println("I = "+I);
        System.out.println("J = "+J);
        System.out.println("K = "+K);
    }
}
