package com.hau.testasync;

interface DemoSyncCallback {
    void callback();
}

class DemoSync {
    public void func1(DemoSyncCallback dsc) {
        System.out.println("Đang xử lý Task 1 ...");

        dsc.callback();
    }

    public void func2(DemoSyncCallback dsc) {
        System.out.println("Đang xử lý Task 2 ...");

        new Thread(() -> {
            try {
                Thread.sleep(3 * 1000); // 3 giay

                dsc.callback();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void func3(DemoSyncCallback dsc) {
        System.out.println("Đang xử lý Task 3 ...");

        dsc.callback();
    }
}

public class Main {
    public static void main(String[] args) {
        DemoSync ds = new DemoSync();

        // Xu ly task 1
        // Xu ly task 2 -> 3 giay
        // Xu ly task 3
        // Xong

        ds.func1(() -> {
            System.out.println("Xong Task 1!");

            ds.func2(() -> {
                System.out.println("Xong Task 2!");

                ds.func3(() -> {
                    System.out.println("Xong Task 3!");

                    System.out.println("Done!");
                });
            });
        });

    }
}
