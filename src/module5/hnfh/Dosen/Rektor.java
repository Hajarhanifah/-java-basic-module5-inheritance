/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.Dosen;

/**
 *
 * @author hajarhanifah
 */
public class Rektor extends Dosen {
    
    private int tahunMulai;
    private int jabatanKe;
    
    public Rektor(String nama, String nik, String jurusan, int tahun, int jabatan) {
        super(nama, nik, jurusan); // memanggil variabel yang mengacu pada dosen (super class)
        
        tahunMulai = tahun;
        jabatanKe = jabatan;
        
    }
    
    // View Informasi Rektor
    public void viewRektor(){
        super.viewDosen(); // panggil method superclass
        System.out.println("Tahun Mulai Jabatan : "+tahunMulai);
        System.out.println("Jabatan Rektor Ke-"+jabatanKe);
    }
}
