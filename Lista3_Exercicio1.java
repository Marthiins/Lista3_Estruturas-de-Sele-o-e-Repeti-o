
//Escreva um algoritmo que lê 15 valores reais, encontra o maior e
//o menor deles e mostra o resultado.



import java.util.Scanner;

/**
 *
 * @author Paulo Sérgio Martins
 */

public class Lista3_Exercicio1 {
     

 public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x; int n1, result1, result2;
	
        System.out.println("Digite 15 números e veja qual foi o maior e o menor digitado: ");
        result1 = 0; result2 = 0;
        for (x = 1;x <= 15;x = x+1){
            n1 = leia.nextInt();    
            if (x == 1) {
                result1 = n1;
                result2 = n1;
                        }    
            if (n1 < result1) {
                result1 = n1;
                        }
            if (n1 > result2) {
                result2 = n1;
            }
                        }
        System.out.println("o maior número foi: "+ result2);
        System.out.println("o menor número foi: "+ result1);
    }
    
}
