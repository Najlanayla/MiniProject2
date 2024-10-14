/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orangTK;

import java.util.Scanner;
import java.util.ArrayList;
import mainTK.CRUDTK;

public class Siswa extends Orang implements CRUDTK{
    final private int idSiswa;
    private String namaKelas;
    
    public static ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    
    public static Scanner scanner = new Scanner(System.in);
    
    public Siswa(String nama, int umur, String jenisKelamin, int idSiswa, String namaKelas){
        super(nama, umur, jenisKelamin);
        this.idSiswa= idSiswa;
        this.namaKelas = namaKelas;
    }

    @Override
    public void tambahData() {
        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur siswa: ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan jenis kelamin siswa: ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Masukkan ID siswa: ");
        int idSiswa = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan nama kelas siswa: ");
        String namaKelas = scanner.nextLine();
        
        Siswa siswa = new Siswa(nama, umur, jenisKelamin, idSiswa, namaKelas);
        daftarSiswa.add(siswa);
        System.out.println("Siswa " + nama + " berhasil ditambahkan.");
    }

    @Override
    public void tampilkanData() {
        if (daftarSiswa.isEmpty()){
            System.out.println("Tidak ada data siswa yang tersedia.");
        return;
        }
        for (Siswa siswa : daftarSiswa) {
            System.out.println("ID Siswa: " + siswa.getIdSiswa() + 
                               ", Nama: " + siswa.getNama() + 
                               ", Umur: " + siswa.getUmur() + 
                               ", Nama Kelas: " + siswa.getNamaKelas());
        }
    }

    @Override
    public void ubahData() {
        System.out.print("Cari id siswa: ");
        int idSiswa = scanner.nextInt();
        scanner.nextLine();
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getIdSiswa() == idSiswa) {
                System.out.print("Masukkan nama baru: ");
                String nama = scanner.nextLine();
                siswa.setNama(nama);
                System.out.print("Masukkan umur baru: ");
                int umur = scanner.nextInt();
                scanner.nextLine();
                siswa.setUmur(umur);
                System.out.print("Masukkan jenis kelamin baru: ");
                String jenisKelamin = scanner.nextLine();
                siswa.setJenisKelamin(jenisKelamin);
                System.out.print("Masukkan nama kelas baru: ");
                String namaKelas = scanner.nextLine();
                siswa.setNamaKelas(namaKelas);
                System.out.println("Data siswa dengan ID " + siswa.getIdSiswa() + " berhasil diubah.");
                return;
            }
        }
        System.out.println("Siswa dengan ID " + this.getIdSiswa() + " tidak ditemukan.");
    }

    @Override
    public void hapusData() {
        System.out.print("Masukkan ID siswa yang ingin dihapus: ");
        int idSiswa = scanner.nextInt();
        scanner.nextLine();
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getIdSiswa() == idSiswa){
                daftarSiswa.remove(siswa);
                System.out.println("Siswa dengan ID " + idSiswa + " berhasil dihapus.");
                break;
            }
        }
    }
        
    public int getIdSiswa() {
        return idSiswa;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }


}
