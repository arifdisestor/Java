/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * NAMA                 : Arif wiradinata
 * KELAS                : TI -1B
 * NIM                  : A2.1900022
 * Deskripsi Program    : Memasukan Nilai dari Keyboard
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
        
                
    }
    
}
