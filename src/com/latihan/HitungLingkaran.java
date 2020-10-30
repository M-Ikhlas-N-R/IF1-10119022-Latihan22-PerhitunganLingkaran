package com.latihan;

import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Perhitungan Lingkaran Latihan 22
 *
 */

public class HitungLingkaran {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private static DecimalFormat df0 = new DecimalFormat("#");

    public static void main(String[] args) {
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // deklarasi variabel
        double  diameter = 0,
                Pi = 3.14159265359,
                jariJari,
                luas,
                keliling;

        boolean isNumber = false;

        while (!isNumber) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            if (keyboard.hasNextInt()) {
                diameter = keyboard.nextInt();
                isNumber = true;

            } else if (!keyboard.hasNextInt()) {
                System.out.println("Nilai Diameter Tidak Sesuai");
                keyboard.next();
            }
            System.out.println();
        }

        jariJari = diameter / 2;
        luas = Pi * (jariJari * jariJari);
        keliling = 2 * Pi * jariJari;

        System.out.println("======Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + df0.format(jariJari) + " cm");
        System.out.println("Luas Lingkaran = " + df2.format(luas) + " cm");
        System.out.println("Keliling Lingkaran = " + df2.format(keliling) + " cm");

    }
}
