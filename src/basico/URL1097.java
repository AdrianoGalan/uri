/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

public class URL1097 {
    
    public static void main(String[] args) {

        int i = 1, j = 7, id = 0;

        while (i <= 9) {

            System.out.println("I=" + i + " " + "J=" + j);
            id++;
            j--;

            if (id == 3) {
                id = 0;
                j = j + 5;
                i = i + 2;
            }

        }
    }
    
}
