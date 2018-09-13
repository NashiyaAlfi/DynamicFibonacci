/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ONE
 */
public class Tugas1 {
    public  static void main(String[] args){ 
        System.out.println("Nashiya Alfi Ramadhani/XRPL5/29");
    int uang = 421300;
    int pecahan[] = new int[] {5000,2000,1000,500,100};
    int jumlah;
    
    for(int i = 0; i < pecahan.length; i++){
    if (uang >= pecahan [i]){
        jumlah = uang / pecahan[i];
        uang = uang % pecahan[i];
        System.out.println("Pecahan" +pecahan [i]+"sebanyak "+jumlah+" keping");
    }
}
}


        
    }
