package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LatihanInputBufferedReader {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Deklarasi variabel
        double sisi_A = 0.0, sisi_B = 0.0, tinggi_segitiga_A = 0.0, tinggi_segitiga_B = 0.0;
        double Luas_alas, Luas_segitiga_A, Luas_segitiga_B, Luas_permukaan;

        try {
            System.out.println("=== Menghitung Luas Permukaan Limas Segi Empat ===");
            // Input dari pengguna
            System.out.print("Input sisi A: ");
            sisi_A = Double.parseDouble(input.readLine());

            System.out.print("Input sisi B: ");
            sisi_B = Double.parseDouble(input.readLine());

            System.out.print("Input tinggi segitiga A: ");
            tinggi_segitiga_A = Double.parseDouble(input.readLine());

            System.out.print("Input tinggi segitiga B: ");
            tinggi_segitiga_B = Double.parseDouble(input.readLine());    
        } catch (IOException e) {
        System.out.println("Error");
        }
        // Hitung Luas_alas
        Luas_alas = sisi_A * sisi_B;

        // Hitung Luas_segitiga_a
        Luas_segitiga_A = 0.5 * sisi_A * tinggi_segitiga_A;

        // Hitung Luas_segitiga_b
        Luas_segitiga_B = 0.5 * sisi_B * tinggi_segitiga_B;

        // Hitung Luas_permukaan
        Luas_permukaan = Luas_alas + 2 * Luas_segitiga_A + 2 * Luas_segitiga_B;

        // Tampilkan hasil
        System.out.println("Luas permukaan limas segi empat adalah: " + Luas_permukaan);
    }  
}