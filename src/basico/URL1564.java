/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class URL1564 {

    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner leia = new Scanner(new FileReader("d:/URL1187.txt"));

        while (leia.hasNext()) {

            int n = Integer.parseInt(leia.nextLine());
            
            if(n < 1){
                System.out.println("vai ter copa!");
            }else{
                System.out.println("vai ter duas!");
            }
            
            
        }
        leia.close();
    }

}
