package com.mycompany.ardena;

/**
 *
 * @author ARDE
 */
public class SegitigaSmKaki extends BangunDatar {
    float alas, tinggi;
    float miring;
    
    @Override
    float keliling(){
        miring = ((alas * alas) + (tinggi * tinggi));
        float keliling = (2 * miring) + alas;
        System.out.println("Keliling Segitiga Sama Kaki: " + keliling);
        return keliling;
    }
}
