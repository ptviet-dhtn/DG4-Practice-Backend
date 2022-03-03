package cau_truc_ifelse;
import java.util.Scanner;
public class test_cau_truc_ifelse {
    public static void main(String[] args){
        int a ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập số :");
        a = scanner.nextInt();
        if(a==0)
        {
            System.out.println("Số vừa nhập không chẳn không lẻ");
        }
        if(a %2== 0 && a!=0){
           System.out.println("Số vừa nhập là số chẳn");
        }
        else if(a!=0)
        {
            System.out.println("Số vừa nhập là số lẻ");
        }
    }
}
