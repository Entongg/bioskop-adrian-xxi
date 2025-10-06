# Bioskop Adrian XXI - Sistem Pemesanan Tiket Bioskop

Bioskop Adrian XXI adalah aplikasi pemesanan tiket bioskop berbasis console yang dikembangkan menggunakan Java. Aplikasi ini memungkinkan pengguna untuk melihat daftar film, memesan tiket, dan melihat riwayat pemesanan dengan antarmuka yang user-friendly.

## ✨ Fitur

- 📺 **Lihat Daftar Film** - Menampilkan film yang sedang tayang beserta harga
- 🎫 **Pesan Tiket** - Proses pemesanan tiket dengan pilihan film, jadwal, dan jumlah
- 📊 **Rekap Pemesanan** - Melihat semua transaksi yang telah dilakukan
- 💰 **Sistem Diskon** - Diskon 10% untuk pembelian lebih dari 3 tiket
- ⏰ **Variasi Harga** - Harga berbeda berdasarkan jam tayang (Siang, Sore, Malam)
- 🔄 **Menu Interaktif** - Navigasi yang mudah dengan sistem menu berulang


## 🏗️ Diagram Class

### Struktur Class:

**BioskopApp** (Main Class)
- Mengelola: `Film[] daftarFilm`
- Mengelola: `Jadwal[] daftarJadwal`  
- Mengelola: `ArrayList<Pemesanan> riwayatPemesanan`
- Methods: `main()`, sistem menu

**Film** Class
- Attributes: 
  - `String judul`
  - `String genre` 
  - `double hargaDasar`
- Methods:
  - `getJudul()`, `getGenre()`, `getHargaDasar()`
  - `getInfoFilm()`

**Jadwal** Class  
- Attributes:
  - `String jamTayang`
  - `double faktorHarga`
- Methods:
  - `getJamTayang()`, `getFaktorHarga()`
  - `getInfoJadwal()`

**Pemesanan** Class
- Attributes:
  - `String namaPelanggan`
  - `Film film` (Composition)
  - `Jadwal jadwal` (Composition)
  - `int jumlahTiket`
  - `static final double DISKON = 0.1`
- Methods:
  - `hitungTotalBayar()`
  - `getDetailPemesanan()`
  - Getter methods

### Relasi Antar Class:
- **BioskopApp** memiliki **Film** dan **Jadwal** (Association)
- **Pemesanan** terdiri dari **Film** dan **Jadwal** (Composition)  
- **BioskopApp** mengumpulkan **Pemesanan** (Aggregation)

## 📊 Contoh Output

### 1. Menu Utama
![Menu Utama](https://imgur.com/a/iGbTDLc)

### 2. Daftar Film

DAFTAR FILM YANG SEDANG TAYANG

No  | Judul          | Genre      | Harga
1   | Venom 3        | Action     | Rp 50,000
2   | Inside Out 2   | Animation  | Rp 45,000
3   | Conjuring 4    | Horror     | Rp 55,000


### 3. Proses Pemesanan

Masukkan nama Anda: Adrian

Pilih Film:
1. Venom 3 | Action | Rp 50,000
2. Inside Out 2 | Animation | Rp 45,000
3. Conjuring 4 | Horror | Rp 55,000

Nomor film: 2

Pilih Jadwal Tayang:
1. 12:00 (Siang)  | Harga x1.0
2. 15:30 (Sore)   | Harga x1.1
3. 19:00 (Malam)  | Harga x1.2

Nomor jadwal: 3
Masukkan jumlah tiket: 4

PEMESANAN BERHASIL!

### 4. Detail Pemesanan
DETAIL PEMESANAN

Nama Pelanggan  : Adrian
Film            : Inside Out 2
Jadwal Tayang   : 19:00 (Malam)
Jumlah Tiket    : 4
Total Bayar     : Rp 194,400

### 5. Rekap Semua Pemesanan
                          REKAP PESANAN
No  | Nama    | Film         | Jadwal        | Jumlah | Total
1   | Adrian  | Inside Out 2 | 19:00 (Malam) | 4      | Rp 194,400
2   | Sarah   | Venom 3      | 15:30 (Sore)  | 2      | Rp 110,000
3   | Budi    | Conjuring 4  | 12:00 (Siang) | 1      | Rp 55,000

Total Pemesanan : 3


## 🚀 Cara Menjalankan

```bash
# Compile
javac src/main/java/com/bioskop/*.java

# Run
java -cp src/main/java com.bioskop.BioskopApp
