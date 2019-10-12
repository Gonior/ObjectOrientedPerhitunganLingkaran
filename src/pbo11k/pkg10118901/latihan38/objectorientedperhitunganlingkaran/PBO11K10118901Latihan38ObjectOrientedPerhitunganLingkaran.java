/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan38.objectorientedperhitunganlingkaran;
import java.util.Scanner;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Menghitung luas, keliling, dan jari jari linkaran dengan validasi angka menggunakan konsep object oriented
 */
public class PBO11K10118901Latihan38ObjectOrientedPerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        float n = 0;
        
        System.out.println("==========Perhitungan Lingkaran==========");
    
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
        try {
        n = input.nextFloat();
        } catch (Exception e) {
            System.out.println("Nilai diameter tidak sesuai");
            input.next();
        }
        } while( n <= 0);
        l.hasilHitung(n);
    }
    
}
