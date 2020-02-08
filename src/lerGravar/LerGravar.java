/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerGravar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
  BufferedReader entrada = new BufferedReader(new FileReader("d:/URL1187.txt"));

 */
public class LerGravar {
    
    public static void main(String[] args) {
        
        String grava = "";
        
        for (int i = 0; i < 1000; i++) {
            
           grava = grava + i + "\n" ;
        }
        grava = grava + "0";
        
        gravar(grava);
        
    }
    
    public static void gravar(String gravar) {

        BufferedWriter writer;

        try {
            writer = new BufferedWriter(new FileWriter("d:/URL1187.txt"));

     
            

                writer.write(gravar);
                writer.newLine();

            

            writer.close();

        } catch (IOException ex) {
           
            JOptionPane.showMessageDialog(null, "Erro ao gravar");
        
        }

    }
    
}
