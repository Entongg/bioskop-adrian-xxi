Bioskop Adrian XXI - Sistem Pemesanan Tiket Bioskop
    Bioskop Adrian XXI adalah aplikasi pemesanan tiket bioskop berbasis console yang dikembangkan menggunakan Java. 
Aplikasi ini memungkinkan pengguna untuk melihat daftar film, memesan tiket, dan melihat riwayat pemesanan dengan antarmuka yang user-friendly.

Fitur
📺 Lihat Daftar Film - Menampilkan film yang sedang tayang beserta harga
🎫 Pesan Tiket - Proses pemesanan tiket dengan pilihan film, jadwal, dan jumlah
📊 Rekap Pemesanan - Melihat semua transaksi yang telah dilakukan
💰 Sistem Diskon - Diskon 10% untuk pembelian lebih dari 3 tiket
⏰ Variasi Harga - Harga berbeda berdasarkan jam tayang (Siang, Sore, Malam)
🔄 Menu Interaktif - Navigasi yang mudah dengan sistem menu berulang

Diagram Class
BioskopApp (Main Class)
│
├── Manages: Film[] daftarFilm
├── Manages: Jadwal[] daftarJadwal  
├── Manages: ArrayList<Pemesanan> riwayatPemesanan
└── Methods: main(), menu system
    │
    ├── Film
    │   ├── judul: String
    │   ├── genre: String
    │   ├── hargaDasar: double
    │   ├── getJudul(), getGenre(), getHargaDasar()
    │   └── getInfoFilm(): String
    │
    ├── Jadwal
    │   ├── jamTayang: String
    │   ├── faktorHarga: double
    │   ├── getJamTayang(), getFaktorHarga()
    │   └── getInfoJadwal(): String
    │
    └── Pemesanan
        ├── namaPelanggan: String
        ├── film: Film           // Composition
        ├── jadwal: Jadwal       // Composition
        ├── jumlahTiket: int
        ├── DISKON: double = 0.1
        ├── hitungTotalBayar(): double
        ├── getDetailPemesanan(): String
        └── getter methods

Contoh Penggunaan Fitur Utama
1. Melihat Daftar Film
    ===========================================================
                    DAFTAR FILM YANG SEDANG TAYANG
    ===========================================================
    No   | Judul                | Genre     | Harga    
    -----------------------------------------------------------
    1    | Venom 3              | Action    | Rp 50,000
    2    | Inside Out 2         | Animation | Rp 45,000
    3    | Conjuring 4          | Horror    | Rp 55,000

2. Memesan Tiket
    Masukkan nama Anda: Adrian

    Pilih Film:
    1. Venom 3               | Action    | Rp 50,000
    2. Inside Out 2          | Animation | Rp 45,000
    3. Conjuring 4           | Horror    | Rp 55,000
    Nomor film: 2

    Pilih Jadwal Tayang:
    1. 12:00 (Siang)    | Harga x1.0
    2. 15:30 (Sore)     | Harga x1.1
    3. 19:00 (Malam)    | Harga x1.2
    Nomor jadwal: 3

    Masukkan jumlah tiket: 4

    PEMESANAN BERHASIL!
    =========================================
    =           DETAIL PEMESANAN            =
    =========================================
    Nama Pelanggan : Adrian
    Film           : Inside Out 2
    Jadwal Tayang  : 19:00 (Malam)
    Jumlah Tiket   : 4
    Total Bayar    : Rp 194,400

3. Melihat Rekap Pemesanan
    ================================================================================
                                    REKAP PEMESANAN
    ================================================================================
    No | Nama           | Film           | Jadwal         | Jumlah | Total     
    --------------------------------------------------------------------------------
    1  | Adrian         | Inside Out 2   | 19:00 (Malam)  | 4      | Rp 194,400
    --------------------------------------------------------------------------------
    Total Pemesanan : 1
    ================================================================================

Petunjuk Cara Menjalankan Program
Prasyarat:
- Java Development Kit (JDK) 8 atau lebih tinggi
- Text editor atau IDE (VS Code, IntelliJ IDEA, Eclipse, dll.)

Langkah-langkah:
1. Buat struktur folder project:
    Tiket_Bioskop/
    │
    ├── src/
    │   └── main/
    │       └── java/
    │           └── com/
    │               └── bioskop/
    │                   ├── BioskopApp.java      # Main class
    │                   ├── Film.java            # Class untuk data film
    │                   ├── Jadwal.java          # Class untuk jadwal tayang
    │                   └── Pemesanan.java       # Class untuk transaksi
    │
    ├── README.md
    └── pom.xml                                  # Maven configuration

    - src/main/java/com/bioskop/BioskopApp.java - Class utama yang menjalankan aplikasi
    - src/main/java/com/bioskop/Film.java - Class yang merepresentasikan data film
    - src/main/java/com/bioskop/Jadwal.java - Class yang mengatur jadwal tayang dan faktor harga
    - src/main/java/com/bioskop/Pemesanan.java - Class untuk menangani transaksi pemesanan
    - pom.xml - File konfigurasi Maven untuk dependencies dan build settings
    - README.md - Dokumentasi project (file ini)

2. Compile semua file Java:
   javac com/bioskop/*.java

3. Jalankan program:
   java com.bioskop.BioskopApp