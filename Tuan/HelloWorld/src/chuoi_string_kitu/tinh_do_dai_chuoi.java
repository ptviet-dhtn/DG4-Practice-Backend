package chuoi_string_kitu;
import java.util.Scanner;
public class tinh_do_dai_chuoi {
    public static void main(String[] args){
        String chuoi;
        int dodai;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kì từ bàn phím : ");
        chuoi = scanner.nextLine();

        //Tính độ dài chuỗi
        dodai = chuoi.length();
        System.out.println("Chuỗi " + chuoi + " có độ dài = " + dodai);
    }
}
