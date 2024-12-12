import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
 String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] hargaBuku = {350000, 450000, 500000, 95000};

        /*  Menampilkan daftar buku */
        System.out.println("Daftar Buku:");
        for (int i = 0; i < namaBuku.length; i++) {
            System.out.println((i + 1) + ". " + namaBuku[i] + " " + hargaBuku[i]); 
        }

        /*  Memasukkan pilihan buku*/
        char inputLagi;
        do {
            System.out.print("Masukkan pilihan buku [1/2/3/4]: ");
            int pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                hargaBelanja.add(hargaBuku[pilihan - 1]);
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.print("Input lagi (Y/N)?: ");
            inputLagi = scanner.next().charAt(0);
        } while (inputLagi == 'Y' || inputLagi == 'y');

        /* Menghitung total harga dan voucher belanja*/
        int totalHarga = hitungTotalHarga(hargaBelanja); 
        int totalVoucher = hitungVoucher(totalHarga);

        /* Menampilkan hasil*/
        System.out.println("Total voucher belanja = " + totalVoucher); 
        System.out.println("Total yang harus dibayar = " + totalHarga); 
    }
    /* Prosedur untuk menghitung total harga*/
    public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
        int total = 0;
        for (int harga : hargaBelanja) {
            total += harga;
        }
        return total;
/*Prosedur untuk menghitung voucher belanja*/
public static int hitungVoucher(int totalHarga) {
    if (totalHarga < 200000) {
        return 0;
    } else if (totalHarga >= 200000 && totalHarga <= 500000) {
        return 50000;
    } else if (totalHarga > 500000 && totalHarga <= 750000) {
        return 100000;
    } else if (totalHarga > 750000 && totalHarga <= 1000000) {
        return 150000;
    } else {
        return 200000;
             } 
        } 
    }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
