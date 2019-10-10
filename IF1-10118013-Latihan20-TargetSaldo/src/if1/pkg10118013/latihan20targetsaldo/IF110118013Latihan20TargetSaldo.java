/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan20targetsaldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menghitung Saldo Target
 */
public class IF110118013Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float saldoAwal = 3500000, bunga = (float) 0.08, saldoTarget = 6000000, saldoAkhir=saldoAwal;
        int bulan = 8;
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        for (int i = 1; i<=12; i++){
            saldoAkhir = saldoAwal * bunga;
            saldoAwal += saldoAkhir;
            if(saldoAwal <= 6500000){
                System.out.println("Saldo di bulan ke-" + i + kursIndonesia.format(saldoAwal));
            }
        }
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
