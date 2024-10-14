/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orangTK;

import java.util.Scanner;
import java.util.ArrayList;
import mainTK.CRUDTK;

final public class Guru extends Orang implements CRUDTK{
    final private int idGuru;
    private String mataPelajaran;
    
    public static ArrayList<Guru> daftarGuru = new ArrayList<>();
    
    public static Scanner scanner = new Scanner(System.in);
    
    public Guru(String nama, int umur, String jenisKelamin, int idGuru, String mataPelajaran){
        super(nama, umur, jenisKelamin);
        this.idGuru= idGuru;
        this.mataPelajaran = mataPelajaran;
    }
    
    @Override
    public void tambahData() {
        System.out.print("Masukkan nama guru: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur guru: ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan jenis kelamin guru: ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Masukkan ID guru: ");
        int idGuru = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan mata pelajaran yang diajar: ");
        String mataPelajaran = scanner.nextLine();
       
        Guru guru = new Guru(nama, umur, jenisKelamin, idGuru, mataPelajaran);
        daftarGuru.add(guru);
        System.out.println("Guru " + nama + " berhasil ditambahkan.");
    }

    @Override
    public void tampilkanData() {
        if (daftarGuru.isEmpty()){
            System.out.println("Tidak ada data guru yang tersedia.");
        return;
        }
        for (Guru guru : daftarGuru) {
            System.out.println("ID Guru: " + guru.getIdGuru() + 
                               ", Nama: " + guru.getNama() + 
                               ", Umur: " + guru.getUmur() + 
                               ", Mata Pelajaran: " + guru.getMataPelajaran());
        }
    }
    
    @Override
    public void ubahData() {
        System.out.print("Cari id guru: ");
        int idGuru = scanner.nextInt();
        scanner.nextLine();
        for (Guru guru : daftarGuru) {
            if (guru.getIdGuru() == idGuru) {
                System.out.print("Masukkan nama baru: ");
                String nama = scanner.nextLine();
                guru.setNama(nama);
                System.out.print("Masukkan umur baru: ");
                int umur = scanner.nextInt();
                scanner.nextLine();
                guru.setUmur(umur);
                System.out.print("Masukkan jenis kelamin baru: ");
                String jenisKelamin = scanner.nextLine();
                guru.setJenisKelamin(jenisKelamin);
                System.out.print("Masukkan mata pelajaran baru: ");
                String mataPelajaran = scanner.nextLine();
                guru.setMataPelajaran(mataPelajaran);
                System.out.println("Data guru dengan ID " + guru.getIdGuru() + " berhasil diubah.");
                return;
            }
        }
        System.out.println("Guru dengan ID " + this.getIdGuru() + " tidak ditemukan.");
    }

    @Override
    public void hapusData() {
        System.out.print("Masukkan ID guru yang ingin dihapus: ");
        int idGuru = scanner.nextInt();
        scanner.nextLine();
        for (Guru guru : daftarGuru) {
            if (guru.getIdGuru() == idGuru){
                daftarGuru.remove(guru);
                System.out.println("Guru dengan ID " + idGuru + " berhasil dihapus.");
                break;
            }
        }
    }
    
    public int getIdGuru() {
        return idGuru;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }
    
    
}
