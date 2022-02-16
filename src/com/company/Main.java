package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tutar, kdvliTutar, kdvTutar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ücret Tutarını giriniz : ");
        tutar = scanner.nextDouble();
        double kdvDegeri = tutar > 1000 ? 1.08 : 1.18;
        kdvliTutar = tutar * kdvDegeri;
        kdvTutar = kdvliTutar - tutar;

        System.out.println("KDV'siz fiyat = " + tutar);
        System.out.println("KDV'li fiyat = " + kdvliTutar);
        System.out.println("KDV Tutari = " + kdvTutar);
        
    }
}
