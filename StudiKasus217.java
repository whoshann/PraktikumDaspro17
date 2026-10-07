package jobsheet7;

import java.util.Scanner;

class StudiKasus217 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String studentName, typeOfActivity;
        int numberOfDocument, winnerRank, pkmFundingStatus;

        System.out.print("Nama mahasiswa : ");
        studentName = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/OTHER) : ");
        typeOfActivity = input.nextLine().toUpperCase();

        System.out.print("Jumlah dokumen (0-4) : ");
        numberOfDocument = input.nextInt();

        // Competition (BELMAWA / BAKORMA / MANDIRI)
        if (typeOfActivity.equals("BELMAWA") || typeOfActivity.equals("BAKORMA") || typeOfActivity.equals("MANDIRI")) {
            System.out.print("Peringkat juara (1-3, jika tidak ada, masukkan 0) : ");
            winnerRank = input.nextInt();

            if (winnerRank >= 1 && winnerRank <= 3) {
                // Winner — check document completeness
                if (numberOfDocument == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - numberOfDocument)
                            + " dokumen). Dan penghargaan tidak diberikan.");
                }
            } else {
                // Not a winner (runner-up / participant)
                System.out.println("Status : Bukan pemenang (juara 1/2/3). " +
                        "Dana penghargaan tidak diberikan.");
            }

            // PKM
        } else if (typeOfActivity.equals("PKM")) {
            System.out.print("Status pendanaan PKM (1 = didanai, 0 = tidak didanai) : ");
            pkmFundingStatus = input.nextInt();

            if (pkmFundingStatus == 1) {
                // Funded — check document completeness
                if (numberOfDocument == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - numberOfDocument) +
                            " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : PKM tidak didanai. " +
                        "Dana penghargaan tidak diberikan.");
            }

            // Others (LAINNYA)
        } else {
            System.out.println("Status : Jenis kegiatan tidak memenuhi syarat. " +
                    "Dana penghargaan tidak diberikan.");
        }

        input.close();
    }
}