/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan38.objectorientedperhitunganlingkaran;

/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Menghitung luas, keliling, dan jari jari linkaran dengan validasi angka menggunakan konsep object oriented
 */
public class Lingkaran {
    private final float PHI = (float) 3.1416;
    private float diameter;
    private float jariJari;
    
    private void getJariJari(float varDiameter) {
        jariJari = (float) (varDiameter / 2);
    }
    private float getLuas(float varJariJari) {
        return (float) PHI * varJariJari * varJariJari;
    }
    private float getKeliling(float varDiameter) {
        return (float) ((float) PHI * varDiameter);
    }
    
    private String getString(float varFloat) {
        return Float.toString(varFloat);
    }
    
    public void hasilHitung(float varDiameter) {
        diameter = varDiameter;
        getJariJari(diameter);
        System.out.println("");
        System.out.println("=======Hasil Perhitungan Lingkaran=======");
        System.out.println("Jari-jari lingkaran = "+jariJari+" cm");
        System.out.println("Luas Lingkaran = "+getString((float) getLuas(jariJari))+" cm");
        System.out.println("Keliling lingkaran = "+getString((float) getKeliling(diameter))+" cm");
        
    }
    
}
