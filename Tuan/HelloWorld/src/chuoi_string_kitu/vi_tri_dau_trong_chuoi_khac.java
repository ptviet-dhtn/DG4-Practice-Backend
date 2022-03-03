package chuoi_string_kitu;

public class vi_tri_dau_trong_chuoi_khac {
    public static void main(String[] args) {
        int result;
        String string1 = "Happy new year! and new year!";
        String string2 = "new year!";

        result = string1.indexOf(string2);
        System.out.println("Vị trí đầu tiên xuất hiện chuỗi " + string2 +
                " trong chuỗi " + string1 + " = " + result);
    }
}
