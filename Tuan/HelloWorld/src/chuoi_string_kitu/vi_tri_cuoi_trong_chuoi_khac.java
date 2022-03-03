package chuoi_string_kitu;

public class vi_tri_cuoi_trong_chuoi_khac {
    public static void main(String[] args) {
        int result;
        String string1 = "Happy new year and new year and new year!";
        String string2 = "new year!";

        result = string1.lastIndexOf(string2);
        System.out.println("Vị trí cuối cùng xuất hiện chuỗi " + string2 +
                " trong chuỗi " + string1 + " = " + result);
    }
}
