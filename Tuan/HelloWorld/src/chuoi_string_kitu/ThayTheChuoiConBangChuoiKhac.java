package chuoi_string_kitu;

public class ThayTheChuoiConBangChuoiKhac {
    public static void main(String[] args){
        String string1 = new String("Happy new year!");

        // ký tự thay thế 'l' không có trong chuỗi string1
        System.out.println(string1.replace('n', 'o'));

        // thay thế ký tự 'y' trong string1 thành 'r'
        System.out.println("Chuỗi sau khi thay thế là " + string1.replace('p', 'T'));
    }
}
