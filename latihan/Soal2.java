package latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        //Buatlah ssebuah program yang mencari nilai maksimum dari 3 bilanga
        int[] bilangan = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Masukan Bilangan ke - " + i + " : ");
            bilangan[i] = input.nextInt();
        }

        int largestNum = bilangan[0];
        for (int i = 1; i < bilangan.length; i++) {
            if (largestNum < bilangan[1]) {
                largestNum = bilangan[i];
            }
        }
        System.out.println(largestNum);

    }

}