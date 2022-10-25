/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.Dosen;

/**
 *
 * @author hajarhanifah
 */
public class Main {
    
    public static void main(String[] args){
        Rektor rektor = new Rektor("Tablo", "001", "Informatika", 2006, 2);
        Dekan dekan = new Dekan("Mithra", "003", "Teknik Kimia","TI");
        Kalab kalab = new Kalab("Tukutz", "005","Teknik Industri","KSC");
        
        // contoh pemanggilan method setiap subclass dan superclassnya
   
        rektor.viewRektor();
        dekan.viewDekan();
        kalab.viewKalab();
    }
    
    
}
