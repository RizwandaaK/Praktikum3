/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;
/**
 *
 * @author rizwa
 */
public class Kendaraan {
    
    static String brand = "Toyota";
    static String varian = "Avanza";
    static String jenis = "Minibus";
    static String warna = "Abu-Abu";
           
    static int cc = 1500;
    static int tahun = 2021;
    static int harga = 300;
    
        static void datakendaraan() {
            System.out.println("==== DATA KENDARAAN RODA EMPAT ====");
            System.out.println("Nama Brand Mobil    : "+brand);
            System.out.println("Varian Mobil        : "+varian);
            System.out.println("Jenis Mobil         : "+jenis);
            System.out.println("Warna               : "+warna);
            System.out.println("cc                  : "+cc+"cc");
            System.out.println("Tahun Perilisan     : "+tahun);
            System.out.println("Harga               : "+harga+" Juta");

                   
        }
}
