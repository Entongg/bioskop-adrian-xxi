package com.bioskop;
import java.util.ArrayList;
import java.util.Scanner;

public class BioskopApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Film[] daftarFilm = {
            new Film("Venom 3", "Action", 50000),
            new Film("Inside Out 2", "Animation", 45000),
            new Film("Conjuring 4", "Horror", 55000)
        };

        Jadwal[] daftarJadwal = {
            new Jadwal("12:00 (Siang)", 1.0),
            new Jadwal("15:30 (Sore)", 1.1),
            new Jadwal("19:00 (Malam)", 1.2)
        };

        ArrayList<Pemesanan> riwayatPemesanan = new ArrayList<>();

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n=======================================");
            System.out.println(" SELAMAT DATANG DI BIOSKOP ADRIAN XXI");
            System.out.println("=======================================");
            System.out.println("1. Lihat Daftar Film");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Rekap Pemesanan");
            System.out.println("4. Keluar");
            System.out.println("=======================================");
            System.out.print("Pilih menu (1-4): ");
            String menu = input.nextLine();

            switch (menu) {
                case "1" -> {
                    System.out.println("\n===========================================================");
                    System.out.println("\t\tDAFTAR FILM YANG SEDANG TAYANG");
                    System.out.println("===========================================================");
                    System.out.printf("%-5s | %-20s | %-10s | %-10s\n", "No", "Judul", "Genre", "Harga");
                    System.out.println("-----------------------------------------------------------");
                    for (int i = 0; i < daftarFilm.length; i++) {
                        System.out.printf("%-5d | %-20s | %-10s | Rp %, .0f\n",
                                (i + 1),
                                daftarFilm[i].getJudul(),
                                daftarFilm[i].getGenre(),
                                daftarFilm[i].getHargaDasar());
                    }
                }
                case "2" -> {
                    try {
                        System.out.print("\nMasukkan nama Anda: ");
                        String nama = input.nextLine();

                        System.out.println("\nPilih Film:");
                        for (int i = 0; i < daftarFilm.length; i++) {
                            System.out.println((i + 1) + ". " + daftarFilm[i].getInfoFilm());
                        }
                        System.out.print("Nomor film: ");
                        int pilihanFilm = Integer.parseInt(input.nextLine());

                        System.out.println("\nPilih Jadwal Tayang:");
                        for (int i = 0; i < daftarJadwal.length; i++) {
                            System.out.println((i + 1) + ". " + daftarJadwal[i].getInfoJadwal());
                        }
                        System.out.print("Nomor jadwal: ");
                        int pilihanJadwal = Integer.parseInt(input.nextLine());

                        System.out.print("Masukkan jumlah tiket: ");
                        int jumlah = Integer.parseInt(input.nextLine());

                        if (pilihanFilm < 1 || pilihanFilm > daftarFilm.length ||
                            pilihanJadwal < 1 || pilihanJadwal > daftarJadwal.length) {
                            throw new Exception("Pilihan tidak valid!");
                        }

                        Pemesanan p = new Pemesanan(
                                nama,
                                daftarFilm[pilihanFilm - 1],
                                daftarJadwal[pilihanJadwal - 1],
                                jumlah
                        );
                        riwayatPemesanan.add(p);

                        System.out.println("\nPEMESANAN BERHASIL!");
                        System.out.println(p.getDetailPemesanan());

                    } catch (Exception e) {
                        System.out.println("Terjadi kesalahan " + e.getMessage());
                    }
                }
                case "3" -> {
                    System.out.println("\n=================================================================================");
                    System.out.println("\t\t\t\tREKAP PEMESANAN");
                    System.out.println("=================================================================================");

                    if (riwayatPemesanan.isEmpty()) {
                        System.out.println("Belum ada pemesanan yang tercatat.");
                    } else {
                        System.out.printf("%-3s | %-15s | %-15s | %-15s | %-7s | %-10s\n",
                                "No", "Nama", "Film", "Jadwal", "Jumlah", "Total");
                        System.out.println("---------------------------------------------------------------------------------");

                        int no = 1;
                        for (Pemesanan p : riwayatPemesanan) {
                            System.out.printf("%-3d | %-15s | %-15s | %-15s | %-7d | Rp %, .0f\n",
                                    no++,
                                    p.getNamaPelanggan(),
                                    p.getFilm().getJudul(),
                                    p.getJadwal().getJamTayang(),
                                    p.getJumlahTiket(),
                                    p.hitungTotalBayar());
                        }

                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Total Pemesanan : " + riwayatPemesanan.size());
                        System.out.println("=================================================================================");
                    }
                }
                case "4" -> {
                    jalan = false;
                    System.out.println("\nTerima kasih sudah menggunakan BIOSKOP ADRIAN XXI!");
                }
                default -> System.out.println("️Pilihan menu tidak valid!");
            }
        }

        input.close();
    }
}
