package latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        //buatlah sebuah program yang mencari nilai maksimum dari 2 bilangan
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama");
        int a = input.nextInt();

        System.out.println("Masukkan angka kedua");
        int b = input.nextInt();

        if(a > b){
            System.out.println("Angka kedua adalah angka maksimum");
            System.exit(0);
        }

    }
}
