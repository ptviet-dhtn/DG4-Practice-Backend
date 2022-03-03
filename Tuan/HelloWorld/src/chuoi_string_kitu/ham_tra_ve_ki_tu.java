package chuoi_string_kitu;
import java.util.Scanner;
public class ham_tra_ve_ki_tu {
    public static void main(String[] args){
        String Chuoi;
        int dodai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi kí tự bất kì trên bàn phím: ");
        Chuoi = scanner.nextLine();
        dodai = Chuoi.length();
        System.out.println("Chuỗi " + Chuoi +" có độ dài " + dodai + " kí tự");
        System.out.println("Nhập số thứ tự của chuỗi ");
        int s;
        String chu;
        s = scanner.nextInt();
        char character = Chuoi.charAt(s);
        System.out.println("kí tự thứ "+ s+" là : " + character);
    }
}
