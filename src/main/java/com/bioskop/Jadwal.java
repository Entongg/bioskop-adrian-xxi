package com.bioskop;

public class Jadwal {
    private String jamTayang;
    private double faktorHarga;

    public Jadwal(String jamTayang, double faktorHarga) {
        this.jamTayang = jamTayang;
        this.faktorHarga = faktorHarga;
    }

    public String getJamTayang() { return jamTayang; }
    public double getFaktorHarga() { return faktorHarga; }

    public String getInfoJadwal() {
        return String.format("%-15s | Harga x%.1f", jamTayang, faktorHarga);
    }
}
