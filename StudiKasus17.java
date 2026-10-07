package jobsheet7;

import java.util.Scanner;

public class StudiKasus17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        int hargaPerCup = 18000;

        System.out.print("Input Jumlah Cup    : ");
        jumlahCup = input.nextInt();

        System.out.print("Input Uang Bayar    : ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if(totalHarga >= 100000){
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }

        System.out.println("Total Harga     : Rp " + totalHarga);
        System.out.println("Diskon          : Rp " + diskon);
        System.out.println("Total Bayar     : Rp " + totalBayar);

        if(uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian       : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Not enough money, short by Rp " + kurang);
        }
        input.close();
    }
}
