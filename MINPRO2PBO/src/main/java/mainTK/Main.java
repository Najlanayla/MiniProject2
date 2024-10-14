/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mainTK;

import orangTK.Guru;
import orangTK.Siswa;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilihan;
        Guru guru = new Guru("Ney", 19, "Perempuan", 2311, "Bahasa Inggris");
        Siswa siswa = new Siswa ("Alya", 5, "Perempuan", 2308, "A1");
        
        while (true) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println(" 1. Guru");
            System.out.println(" 2. Siswa");
            System.out.println(" 0. Keluar");
            System.out.print(" Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            if (pilihan == 1) {
                while (true) {
                    System.out.println("\n=== Menu Data Guru ===");
                    System.out.println(" 1. Buat data guru");
                    System.out.println(" 2. Lihat data guru");
                    System.out.println(" 3. Ubah data guru");
                    System.out.println(" 4. Hapus data guru");
                    System.out.println(" 0. Keluar");
                    System.out.print(" Pilih: ");
                    pilihan = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (pilihan == 1) {
                        guru.tambahData();
                    } else if (pilihan == 2) {
                        guru.tampilkanData();
                    } else if (pilihan == 3) {
                        guru.ubahData();
                    } else if (pilihan == 4) {
                        guru.hapusData();
                    } else if (pilihan == 0) {
                        break;
                    }
                }
            } else if (pilihan == 2) {
                while (true) {
                    System.out.println("\n=== Menu Data Siswa ===");
                    System.out.println(" 1. Buat data siswa");
                    System.out.println(" 2. Lihat data siswa");
                    System.out.println(" 3. Ubah data siswa");
                    System.out.println(" 4. Hapus data siswa");
                    System.out.println(" 0. Keluar");
                    System.out.print(" Pilih: ");
                    pilihan = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (pilihan == 1) {
                        siswa.tambahData();
                    } else if (pilihan == 2) {
                        siswa.tampilkanData();
                    } else if (pilihan == 3) {
                        siswa.ubahData();
                    } else if (pilihan == 4) {
                        siswa.hapusData();
                    } else if (pilihan == 0) {
                        break;
                    }
                }
            } else if (pilihan == 0) {
                System.out.println("\nTerima kasih telah menggunakan sistem manajemen TK. Sampai Jumpa!");
                break;
            }
        }
    }
}
