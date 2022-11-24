/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpembading3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Contohpembading3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,disc,total;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Masukan harga barang 1 = ");
        a = scan.nextInt();
        System.out.print ("Masukan harga barang 2 = ");
        b = scan.nextInt();
        System.out.print ("Masukan harga barang 3 = ");
        c = scan.nextInt();
        
        total = a+b+c;
        
        if (total >= 250000)
                {
                    disc = total-total*15/100;
        System.out.println ("total diskon belanjaan 15%="+disc);
                }
        else
        {
        System.out.println ("total belanjaan tanpa diskon="+total);
        }
    }
    
}
