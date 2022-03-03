package com.hau.javatest;

public class Casio {
    // Gia tri key qua tinh toan
    private int result;

    public Casio(int defaultResult) {
        // Thiet lap gia tri mac dinh
        this.result = defaultResult;
    }

    /**
     * Ham cong them so nguyen vao bien result
     *
     * @param int input
     */
    public void cong(int input) {
        this.result += input;
    }

    /**
     * Ham lay ket qua sau khi tinh toan
     *
     * @return int
     */
    public int getResult() {
        return this.result;
    }
}
