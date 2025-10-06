package com.bioskop;

public class Pemesanan {
    private String namaPelanggan;
    private Film film;
    private Jadwal jadwal;
    private int jumlahTiket;
    private static final double DISKON = 0.1; // Diskon 10% untuk >3 tiket

    public Pemesanan(String namaPelanggan, Film film, Jadwal jadwal, int jumlahTiket) {
        this.namaPelanggan = namaPelanggan;
        this.film = film;
        this.jadwal = jadwal;
        this.jumlahTiket = jumlahTiket;
    }

    public double hitungTotalBayar() {
        double total = film.getHargaDasar() * jadwal.getFaktorHarga() * jumlahTiket;
        if (jumlahTiket > 3) {
            total -= total * DISKON;
        }
        return total;
    }

    public String getDetailPemesanan() {
        return """
        =========================================
        =           DETAIL PEMESANAN            =
        =========================================
        Nama Pelanggan : %s
        Film           : %s
        Jadwal Tayang  : %s
        Jumlah Tiket   : %d
        Total Bayar    : Rp %, .0f
        """.formatted(namaPelanggan, film.getJudul(), jadwal.getJamTayang(), jumlahTiket, hitungTotalBayar());
    }
        public String getNamaPelanggan() { return namaPelanggan; }
        public Film getFilm() { return film; }
        public Jadwal getJadwal() { return jadwal; }
        public int getJumlahTiket() { return jumlahTiket; }
}
