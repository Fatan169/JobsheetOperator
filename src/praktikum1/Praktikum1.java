/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author asus
 */
public class Praktikum1 {
   private static String Darah;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // membuat variabel
        String nama, alamat, hobby, TTL;
        int usia;
        char goldar;
        double tinggi;
        
        // mengisi variabel
        nama = "Fatan Virgian Nova";
        alamat = "Planet Neptunus";
        hobby = "Nolep";
        TTL = "Madiun, 28 Agustus 2003";
        usia = 15;
        tinggi = 167;
        goldar O = null;
        
        //mencetak ke layar isi variabel
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("hobby: " + hobby);
        System.out.println("TTL: " + TTL);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("tinggi: " + tinggi + " cm");
        System.out.println("darah: "+ "O" );
    }
    
}
