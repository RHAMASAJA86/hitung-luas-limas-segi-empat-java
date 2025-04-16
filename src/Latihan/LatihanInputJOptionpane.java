package Latihan;

import javax.swing.JOptionPane;

public class LatihanInputJOptionpane {
    public static void main(String[] args) {  
        // Deklarasi variabel
        double sisi_A = 0.0, sisi_B = 0.0, tinggi_segitiga_A = 0.0, tinggi_segitiga_B = 0.0;
        double Luas_alas, Luas_segitiga_A, Luas_segitiga_B, Luas_permukaan;

        // Input dari pengguna menggunakan JOptionPane
        sisi_A = Double.parseDouble(JOptionPane.showInputDialog("Input sisi A: "));
        sisi_B = Double.parseDouble(JOptionPane.showInputDialog("Input sisi B: "));
        tinggi_segitiga_A = Double.parseDouble(JOptionPane.showInputDialog("Input tinggi segitiga A: "));
        tinggi_segitiga_B = Double.parseDouble(JOptionPane.showInputDialog("Input tinggi segitiga B: "));
        
        // Hitung Luas_alas
        Luas_alas = sisi_A * sisi_B;
        
        // Hitung Luas_segitiga_a
        Luas_segitiga_A = 0.5 * sisi_A * tinggi_segitiga_A;
        
        // Hitung Luas_segitiga_b
        Luas_segitiga_B = 0.5 * sisi_B * tinggi_segitiga_B;

        // Hitung Luas_permukaan
        Luas_permukaan = Luas_alas + 2 * Luas_segitiga_A + 2 * Luas_segitiga_B;

        // Tampilkan hasil menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, "Luas permukaan limas segi empat adalah: " + Luas_permukaan);   
    }    
}
