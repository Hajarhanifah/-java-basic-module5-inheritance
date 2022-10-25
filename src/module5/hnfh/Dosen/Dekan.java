/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.Dosen;

/**
 *
 * @author hajarhanifah
 */
public class Dekan extends Dosen{
    
    private String fakultas;
    
    public Dekan(String nama, String nik, String jurusan, String fakultas) {
        super(nama, nik, jurusan);
        
        this.fakultas = fakultas;
    }
    
    //Tampilkan informasi Dekan
    public void viewDekan(){
        super.viewDosen(); // panggil method superclassnya
        System.out.println("Fakultas :  "+fakultas);
    }
    
}
