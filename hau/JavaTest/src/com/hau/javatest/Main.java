package com.hau.javatest;

import com.hau.javatest.models.User;

public class Main {
    public static void main(String[] args) {
        // Casio casio = new Casio(0);
        // casio.cong(10);
        // casio.cong(2);
        // Bai toan la 0+10+2 => 10+2 = 12
        // System.out.print("Ket Qua La: " + casio.getResult());

        User user = new User();

        // su dung setter de thay doi gia tri cua bien name
        user.setName("Nguyen Van A");

        // su dung getter de lay gia tri cua bien name
        System.out.print(user.getName());
    }
}
