package chuoi_string_kitu;
import java.util.Scanner;
public class test_chuoi {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count=0;
        Scanner scanner= new Scanner(System.in);

        do{
            System.out.println("Mời bạn nhập chuỗi bất kì: ");
            chuoi = scanner.nextLine();
        }while(chuoi.length() > 80);

        System.out.println("Nhập vào kí tự cần đếm số lần xuât hiện");
        kyTu = scanner.next().charAt(0);

        for(int i=0;i<chuoi.length();i++)
        {
            if(kyTu == chuoi.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
