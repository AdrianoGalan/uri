/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1134 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int alcool = 0, gasolina = 0, diesel = 0, op;
        
        do{
           
            op = Integer.parseInt(entrada.readLine());
            
            switch(op){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    break;
                    
            }
           
        }while(op != 4);
        
        System.out.println("Alcool: "+ alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Diesel: "+ diesel);
    }
    
}
