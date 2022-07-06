package com.mycompany.ardena;

/**
 *
 * @author ARDE
 */
public class Main {
    public static void main(String[] args) {
        
//        Objek Bangun Datar
        BangunDatar bangunDatar = new BangunDatar();
        
//        Objek Persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 10;
        
//        Objek Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 24;
        
//        Objek Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 5;
        
//        Objek Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 18;
        segitiga.tinggi = 9;
        SegitigaSmSisi SegSmSisi = new SegitigaSmSisi();
        SegSmSisi.alaz = 10;
        SegitigaSmKaki SegSmKaki = new SegitigaSmKaki();
        SegSmKaki.alas = 20;
        SegSmKaki.tinggi = 10;


        
//        Panggil Method Luas dan Keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        segitiga.luas();
        SegSmSisi.keliling();
        SegSmKaki.keliling();
        
        
    }
}
