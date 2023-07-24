package PracticeTasks;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Yıl Giriniz");
        year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + "-bir artik yildir");
        } else {
            System.out.println(year + "-bir artik yil degildir");
        }


    }
}
