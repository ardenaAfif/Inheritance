package com.mycompany.ardena;

/**
 *
 * @author ARDE
 */
public class SegitigaSmSisi extends BangunDatar{
    float alaz;
    
    @Override
    float keliling(){
        float keliling = alaz * 3;
        System.out.println("Keliling Segitiga Sama Sisi: " + keliling);
        return keliling;
    }
    
}
