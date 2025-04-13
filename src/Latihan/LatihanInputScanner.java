package Latihan;

import java.util.Scanner;

public class LatihanInputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Menghitung Luas Permukaan Limas Segi Empat ===");
        // Deklarasi variabel
        double sisi_a = 0.0, sisi_b = 0.0, tinggi_segitiga_a = 0.0, tinggi_segitiga_b = 0.0;
        double Luas_alas, Luas_segitiga_a, Luas_segitiga_b, Luas_permukaan;

        // Input dari pengguna
        System.out.print("Input sisi a: ");
        sisi_a = input.nextDouble();

        System.out.print("Input sisi b: ");
        sisi_b = input.nextDouble();

        System.out.print("Input tinggi segitiga a: ");
        tinggi_segitiga_a = input.nextDouble();

        System.out.print("Input tinggi segitiga b: ");
        tinggi_segitiga_b = input.nextDouble();
        
        // Hitung Luas_alas
        Luas_alas = sisi_a * sisi_b;

        // Hitung Luas_segitiga_a
        Luas_segitiga_a = 0.5 * sisi_a * tinggi_segitiga_a;

        // Hitung Luas_segitiga_b
        Luas_segitiga_b = 0.5 * sisi_b * tinggi_segitiga_b;

        // Hitung Luas_permukaan
        Luas_permukaan = Luas_alas + 2 * Luas_segitiga_a + 2 * Luas_segitiga_b;

        // Tampilkan hasil
        System.out.println("Luas permukaan limas segi empat adalah: " + Luas_permukaan);     
    }    
}