/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.overloadingbilangan;

/**
 *
 * @author hajarhanifah
 */
public class Main {
    
    public static void main(String[] args) {
        
        int nilai1 = 10, nilai2 = 15;
        double double1 = 10.5, double2 = 15.8;
        
        Penjumlahan penjumlahan = new Penjumlahan();
        System.out.println(nilai1 + " + " + nilai2 + " = " + penjumlahan.jumlahBilangan(nilai1, nilai2));
        System.out.println(double1 + " + " + double2 + " = " + 
                penjumlahan.jumlahBilanganReal(double1, double2));
        
    }
    
}
