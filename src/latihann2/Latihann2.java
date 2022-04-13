/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihann2;

import java.util.Scanner;

/**
 *
 * @author shandy
 */
public class Latihann2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
 
        System.out.println("masukan angka ");
        a = input.nextInt();
        if (a%2 == 0) {
            System.out.println("genap");

        } else {
            System.out.println("ganjil");
        }
    }

}
