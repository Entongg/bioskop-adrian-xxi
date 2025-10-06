package com.bioskop;

public class Film {
    private String judul;
    private String genre;
    private double hargaDasar;

    public Film(String judul, String genre, double hargaDasar) {
        this.judul = judul;
        this.genre = genre;
        this.hargaDasar = hargaDasar;
    }

    public String getJudul() { return judul; }
    public String getGenre() { return genre; }
    public double getHargaDasar() { return hargaDasar; }

    public String getInfoFilm() {
        return String.format("%-20s | %-10s | Rp %, .0f", judul, genre, hargaDasar);
    }
}
