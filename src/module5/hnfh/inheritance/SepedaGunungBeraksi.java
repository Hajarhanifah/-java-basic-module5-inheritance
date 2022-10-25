/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module5.hnfh.inheritance;

/**
 *
 * @author hajarhanifah
 */
public class SepedaGunungBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SepedaGunung sepedaGunung = new SepedaGunung();
        sepedaGunung.setGir(3);

        System.out.println(sepedaGunung.getGir());
        sepedaGunung.setSadel(1);
        System.out.println(sepedaGunung.getSadel());
    }

}
