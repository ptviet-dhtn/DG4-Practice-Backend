package vong_lap_while;
import java.util.Scanner;
public class TinhTongCacSoNguyen {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner a = new Scanner(System.in);

        while(sum<100){
            System.out.println("Nhập số bất kì: ");
            number = a.nextInt();
            sum += number;
            System.out.println("Tổng hiện tại: " + sum);
        }
        System.out.println("Tổng các số nguyên vừa nhập: " + sum);
    }
}
