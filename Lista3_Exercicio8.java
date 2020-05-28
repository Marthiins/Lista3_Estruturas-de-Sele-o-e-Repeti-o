
import java.util.Scanner;

/*
 Faça um programa que leia um número n e mostre na tela os n
primeiros números pares e depois os n primeiros números ímpares.
 */

/**
 *
 * @author paulo Sérgio Martins
 */
public class Lista3_Exercicio8 {
 
    
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
	int n1, x;
        
        System.out.println("Digite um numero para verificar numeros pares e impares de acordo com o numero informado:");
        n1 = leia.nextInt();
        System.out.printf("os %s primeiros numeros pares:\n", n1);
        for (x = 1;x <= (n1*2);x = x+1) {
            if (x % 2 == 0) {
                System.out.println(x);
                        }
                    }
        System.out.printf("os %s primeiros numeros impares:\n", n1);
        for (x = 1;x <= (n1*2);x = x+1) {
            if (x % 2 == 1) {
                System.out.println(x);
            }
                    }
    }
    
}
 

