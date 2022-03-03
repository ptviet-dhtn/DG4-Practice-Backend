package vong_lap_do_while;
import java.util.Scanner;
public class TinhTongCacSoNguyen {
    public static void main(String[] args){
        int number, sum = 0;
        Scanner a= new Scanner(System.in);

        do{
           System.out.println("Nhập số bất kì: ");
           number = a.nextInt();
           sum += number;
        }while(sum<100);
        System.out.println("Tổng các số vừa nhập: " + sum);
    }
}
