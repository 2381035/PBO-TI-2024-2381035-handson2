package binaryoperator;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nomot hari (1 - 7) : ");
        int nomorHari = input.nextInt();

        String namaHari = "";

        switch (nomorHari){
            case 1:
                namaHari = "Minggu";
            case 2:
                namaHari = "Senin";
            case 3:
                namaHari = "Selasa";
            case 4:
                namaHari = "Rabu";
            case 5:
                namaHari = "Kamis";
            case 6:
                namaHari = "Jumat";
            case 7:
                namaHari= "Sabtu";
                break;
            default:
                System.out.println("Masukkan nomor hari diantara 1 - 7");
                System.exit(0);
        }

        System.out.println("Hari : " + namaHari);

        input.close();
    }
}
