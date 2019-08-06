/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Asus
 */
public class daftarharga {
     private int hargabuku, jumlahbuku;
    
   daftarharga (int hargabuku, int jumlahbuku) {
        this.hargabuku=hargabuku;
        this.jumlahbuku=jumlahbuku;
        
    }
    public int gethargabuku(){
        return hargabuku;
        
    }
    public int getjumlahbuku(){
        return jumlahbuku;
    }
    
}
