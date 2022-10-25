/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.Dosen;

/**
 *
 * @author hajarhanifah
 */
public class Kalab extends Dosen {

    private String labolatorium;

    public Kalab(String nama, String nik, String jurusan, String lab) {
        super(nama, nik, jurusan);

        labolatorium = lab;
    }

    // Tampilkan Informasi
    public void viewKalab() {
        super.viewDosen(); // panggil method superlass
        System.out.println("Labolatorium : " + labolatorium);
    }

}
