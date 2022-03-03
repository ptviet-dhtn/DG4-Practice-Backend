package vong_lap_while;
import java.util.Scanner;
public class test_vong_while {
    public static void main(String[] args){
        int x, tong = 0;
        Scanner a= new Scanner(System.in);

        while(tong < 100){
            System.out.println("Nhập số bất kì: ");
            x = a.nextInt();
            tong = tong + x;
            System.out.println("Tổng hiện tại: " + tong);
        }
        System.out.println("Tổng các số đã nhập là: " + tong);
    }
}
