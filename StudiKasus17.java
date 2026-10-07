package jobsheet7;

import java.util.Scanner;

public class StudiKasus17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        int hargaPerCup = 18000;

        System.out.println("Input Jumlah Cup    : ");
        jumlahCup = input.nextInt();

        System.out.println("Input Uang Bayar    : ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
    }
}
