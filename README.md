# MiniProject2

# Profile
Nama : Najla Nayla Putri

NIM : 2309116050 - A2

Tema : Sistem Manajemen Taman Kanak-Kanak

# Deskripsi Proyek 
Sistem Manajemen TK adalah aplikasi sederhana yang dirancang untuk mengelola data guru dan siswa di sebuah Taman Kanak-Kanak (TK). Aplikasi ini memungkinkan pengguna untuk menambah, menghapus, dan melihat daftar guru serta siswa dengan menggunakan bahasa pemrograman Java. Dengan fitur CRUD (Create, Read, Update, Delete), sistem ini memberikan solusi yang efisien dalam pengelolaan data sekolah.

# Ketentuan Mini Project
1. Penerapan ketentuan MiniProject 1
1. Inheritance 
2. Encapsulation (getter dan setter)
3. Abstraction
4. Interface 
5. Final keyword 

## Inheritance 
1. Class orang sebagai Parent Class
   ![image](https://github.com/user-attachments/assets/1ca1b6e9-e270-4769-b96e-d96cf540f12f)
   Class orang bertindak sebagai parent class atau superclass yang mendefinisikan atribut dan perilaku umum yang dimiliki oleh setiap individu yang merupakan “orang”. Atribut umum yang terdapat disini ialah nama, umur, dan jenis kelamin.

2. Class Guru sebagai Child Class dari Class Orang
   ![image](https://github.com/user-attachments/assets/61368a77-7a77-49ae-9b84-fec70adbdd60)
   Class guru adalah child class dari class orang yang mewarisi semua atribut dan metode dari kelas parent nya yaitu class orang, namun juga menambahkan atribut dan metode khusus yang hanya dimiliki oleh objek bertipe guru. Atribut yang ditambahkan pada class ini ialah idGuru dan mata Pelajaran yang diajar guru tersebut.

3. Class Siswa sebagai child class dari class Orang
   ![image](https://github.com/user-attachments/assets/498cbac2-d2f1-499e-9805-800763b9df03)
   Class siswa juga merupakah child class dari class Orang yang mewarisi atribut dan metode umum dari kelas parent. Namun, seperti Class guru, Class ini memiliki atribut dan metode tambahan yang spesifik untuk objek siswa. Atribut yang ditambahkan pada class ini ialah idSiswa dan nama kelas dari siswa.

## Encapsulation (Getter & Setter)
* Getter: Digunakan untuk mengambil atau mengakses nilai dari atribut privat dalam sebuah kelas. Hal ini penting dalam prinsip encapsulation, di mana data (atribut) kelas tidak dapat diakses langsung dari luar kelas tersebut, melainkan harus melalui metode getter.
* Setter: Digunakan untuk menetapkan atau mengubah nilai atribut privat dari luar kelas. Dengan menggunakan setter, kita dapat mengontrol perubahan pada data, termasuk menambahkan validasi jika diperlukan sebelum atribut diubah.

1. Getter & Setter pada Class Guru
   ![image](https://github.com/user-attachments/assets/833e7403-29d7-4d14-8fc7-1906e5e742ff)
   - Metode getter disini digunakan untuk mendapatkan nilai dari atribut idGuru dan atribut mataPelajaran, yang dimana idGuru merupakan integer yang digunakan sebagai pengenal unik bagi setiap objek Guru dan mataPelajaran yang berisi informasi tentang mata Pelajaran yang diajar oleh guru. 
   - Metode setter disini digunakan untuk mengubah atau menetapkan nilai baru ke atribut mataPelajaran. 

3. Getter & Setter pada Class Siswa
   ![image](https://github.com/user-attachments/assets/fe270538-57bc-49f0-a2d4-1adf3ec42d7e)
   - Metode getter disini digunakan untuk mendapatkan nilai dari atribut idSiswa dan atribut namaKelas, yang dimana idSiswa merupakan integer yang digunakan sebagai pengenal unik bagi setiap objek Siswa dan namaKelas yang berisi informasi tentang nama kelas siswa.
   - Metode setter disini digunakan untuk mengubah atau menetapkan nilai baru ke atribut namaKelas. 

## Abstraction
  ![image](https://github.com/user-attachments/assets/19aae4f6-d282-41e2-a834-83547be51ff5)
  
Class Orang dideklarasikan sebagai kelas abstrak. Kelas abstrak adalah kelas yang tidak bisa di-instansiasi (dibuat objeknya) secara langsung. 

## Interface 
![image](https://github.com/user-attachments/assets/7f5fed4b-7a19-46e4-ac08-7c17a7d86076)

Interface adalah sebuah kontrak yang mendefinisikan metode-metode yang harus diimplementasikan oleh kelas yang mengimplementasikan interface tersebut. Interface ini digunakan untuk mendefinisikan serangkaian tindakan yang umum dan harus disediakan oleh kelas yang berbeda, tetapi dengan implementasi yang mungkin berbeda-beda. Dalam konteks ini, CRUDTK digunakan untuk Class guru dan Class siswa yang menangani operasi CRUD (Create, Read, Update, Delete) pada data.

## Final Keyword
![image](https://github.com/user-attachments/assets/d6411296-1e67-4b73-9eda-d314151ad8ec)
  - Final public class guru; menandakan bahwa Class guru tidak dapat diwariskan lebih lanjut atau tidak bisa membuat kelas lain yang merupakan turunan Class guru. 
  - Final private int Int idGuru; menunjukkan bahwa nilai idGuru hanya dapat diatur satu kali. Setelah diatur, nilai tersebut tidak dapat diubah lagi.

# Output Program
## Menu Utama
![image](https://github.com/user-attachments/assets/65adadaf-8808-4c4c-ad18-d3d972138cb1)

Pada menu utama terdapat 3 pilihan yaitu Menu untuk Guru, Siswa, dan keluar.

## Menu Guru
![image](https://github.com/user-attachments/assets/bc4e7107-516a-4bae-8094-4ac834ed53d5)

Pada menu data guru ini, ada 5 pilihan yang dimana ini merupakan CRUD yang diterapkan pada menu ini. Yaitu, buat data guru, lihat, ubah, serta hapus data guru. Dan yang terakhir ialah pilihan untuk keluar.

### Buat Data Guru
![image](https://github.com/user-attachments/assets/b44f77ce-7ad9-4de8-93a6-97ae4f3d25ec)

Jika Pilihan 1, kita akan menginputkan nama guru, umur, jenis kelamin, idguru, serta mata Pelajaran yang diajar guru tersebut. Lalu jika sudah, program akan menampilkan output “Guru berhasil ditambahkan”.

### Lihat Data Guru
![image](https://github.com/user-attachments/assets/16533889-b6af-4edc-b26c-9bf0b55d65b8)

Jika pilihan 2, program akan menampilkan menu lihat data guru yang berisi data-data yang sudah berhasil disimpan sebelumnya. 

### Ubah Data Guru
![image](https://github.com/user-attachments/assets/bfdf77fe-d757-4d43-91e9-5e59ed06575f)

Jika Pilihan 3, kita akan menginputkan idGuru terlebih dahulu lalu nama guru baru, umur, jenis kelamin, idguru, serta mata Pelajaran yang diajar guru tersebut. Lalu jika sudah, program akan menampilkan output “Data guru dengan ID … berhasil diubah”.

### Hapus Data Guru
![image](https://github.com/user-attachments/assets/2c6a6638-ec87-4755-8158-57fe9b1270c2)

Jika pilihan 4, akan menginputkan Id guru yang ingin dihapus. Lalu jika sudah, program akan menampilkan output “Guru dengan ID … berhasil dihapus”.

## Menu Siswa
![image](https://github.com/user-attachments/assets/98becaae-1e2f-4575-8771-53bb393b2241)

Pada menu data siswa ini, ada 5 pilihan yang dimana ini merupakan CRUD yang diterapkan pada menu ini. Yaitu, buat data siswa, lihat, ubah, serta hapus data siswa. Dan yang terakhir ialah pilihan untuk keluar.

### Buat Data Siswa
![image](https://github.com/user-attachments/assets/3ca206db-c336-4574-990e-bcc542e109b1)

Jika Pilihan 1, kita akan menginputkan nama siswa, umur, jenis kelamin, idSiswa, serta nama kelas siswa tersebut. Lalu jika sudah, program akan menampilkan output “Siswa  berhasil ditambahkan”.

### Lihat Data Siswa
![image](https://github.com/user-attachments/assets/63ba382f-e9d3-4e8e-83e5-bc21d25249b3)

Jika pilihan 2, program akan menampilkan menu lihat data siswa yang berisi data-data yang sudah berhasil disimpan sebelumnya. 

### Ubah Data Siswa
![image](https://github.com/user-attachments/assets/3157c294-1005-4b88-8570-55d3c0aa3d3c)

Jika Pilihan 3, kita akan menginputkan idSiswa terlebih dahulu lalu nama siswa baru, umur, jenis kelamin, idSiswa, serta nama kelas siswa tersebut. Lalu jika sudah, program akan menampilkan output “Data Siswa dengan ID … berhasil diubah”.

### Hapus Data Siswa
![image](https://github.com/user-attachments/assets/407fceac-2b70-4410-8d34-4dc725af83e0)

Jika pilihan 4, akan menginputkan Id siswa yang ingin dihapus. Lalu jika sudah, program akan menampilkan output “Siswa dengan ID … berhasil dihapus”.

## Menu Keluar 
![image](https://github.com/user-attachments/assets/052272a3-c09a-4ca9-818d-50cc9917ba5a)

Ketika memilih untuk keluar, program akan menampilkan output “Terima kasih telah menggunakan sistem manajemen TK. Sampai Jumpa!”.









