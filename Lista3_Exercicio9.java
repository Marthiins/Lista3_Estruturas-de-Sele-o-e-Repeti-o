//Faça um programa que leia um número n e imprima se ele é primo ou
//não. (um número primo tem apenas 2 divisores: 1 e ele mesmo! O
//número 1 não é primo!!!)



import java.util.Scanner;



/**
 *
 * @author Paulo Sérgio Martins
 */
public class Lista3_Exercicio9 {
    
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
	int n1, x, contador=0;
        
        System.out.println("Digite um número para saber se ele é primo ou não: ");
        n1 = leia.nextInt();
        for (x = 1;x <= n1;x = x+1) {
            if (n1 % x == 0) {
                contador = contador+1;
            }
        }
        if (contador == 2) {
            System.out.println("seu numero é primo");
        }else{
            System.out.println("seu numero não é primo");
        }
    }
    
}


