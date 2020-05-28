
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo Sérgio Martins
 */
public class Lista3_Exercicio3 {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1; float n2, result, result2;
	
        n2 = 0; result2 = 0;
        for (n1 = 1;n1 <= 99;n1 = n1+2) {
            n2 = n2+1;
            result = n1/n2;
            result2 = result+result2;
            System.out.printf("%s / %s = %s = %s\n", n1, n2, result, result2);
                    }
    }
    
}


