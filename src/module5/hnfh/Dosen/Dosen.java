/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.Dosen;

/**
 *
 * @author hajarhanifah
 */
public class Dosen {
    
    protected String nama;
    protected String nik;
    protected String jurusan;
    
    //Constructor

    public Dosen(String nama, String nik, String jurusan) {
        this.nama = nama;
        this.nik = nik;
        this.jurusan = jurusan;
    }
    
    //Menampilkan Informasi
    
    public void viewDosen(){
        System.out.println("Nama : "+nama);
        System.out.println("NIK : "+nik);
        System.out.println("Jurusan : "+jurusan);
    }
    
    
}
