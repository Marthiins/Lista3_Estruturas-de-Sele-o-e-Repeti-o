
// Faça um programa que leia vários inteiros positivos e mostre, no
//final, a soma dos números pares e a soma dos números ímpares. O programa para quando entrar um número maior que 1000.
 
import java.util.Scanner;


/**
 *
 * @author Paulo Sèrgio Martins
 */
public class Lista3_Exercicio5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lista3=new Scanner(System.in);
        
        System.out.println("digite um numero maior que 1000 para encerrar ");
        int numero = lista3.nextInt();
        int somaPar=0,somaImpar=0;
        while (numero<=1000) {            
            double resto=numero%2;
            if (resto==0) {
                somaPar=somaPar+numero;
              
            }else{
            somaImpar=somaImpar+numero;
             
        }
                System.out.println("digite um numero maior a 1000 para encerrar ");
         numero = lista3.nextInt();
        }
        
        System.out.println("a soma total dos numeros pares é :"+somaPar);
        System.out.println("a soma total dos numeros impares é :"+somaImpar);
        
    }
    
}


