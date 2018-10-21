
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class main {
    public static void main (String[] args) {
        Scanner scn1 = new Scanner (System.in);
        Kubus kub = new Kubus();
        
        System.out.println("===Massa Jenis Kubus===");
        System.out.println("Sisi \t: ");
        kub.setmassa(scn1.nextInt());
        
        System.out.println("\n===Hasil perhitungan===");
        System.out.println("volume \t :"+kub.hitungvolume(kub.getsisi()));
        System.out.println("volume \t :"+kub.hitungmassajenis(kub.getmassa(), kub.hitungvolume(kub.getsisi())));
        
    }
    
}
