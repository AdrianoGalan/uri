/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

public class URL1096 {

    public static void main(String[] args) {

        int i = 1, j = 7;

        while (i <= 9) {

            System.out.println("I=" + i + " " + "J=" + j);

            j--;

            if (j == 4) {
                j = 7;
                i = i + 2;
            }

        }
    }

}
