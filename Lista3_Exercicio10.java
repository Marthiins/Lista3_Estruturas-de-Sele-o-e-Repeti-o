//Faça um programa que leia um número n e mostre na tela os n
//primeiros números primos.



import java.util.Scanner;

 

/**
 *
 * @author Paulo Sérgio Martins
 */
public class Lista3_Exercicio10 {
    
   

       public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
	int n1, n2=0, x, y=0, z, contador=0;
        
        System.out.println("Digite um numero para mostrar os primeiros numeros primos: ");
        n1 = leia.nextInt();
        System.out.printf("Os primeiros %s numeros primos foram: \n", n1);
        do {
            y = y+1;
            for (x = 1;x <= y;x = x+1) {
                n2 = 0;
                for (z = 1;z <= x;z = z+1) {
                    if (x % z == 0) {
                        n2 = n2+1;
                    }
                }
            }
            if (n2 == 2) {
                System.out.println(x-1);
                contador = contador+1;
            }
                    }while (n1 != contador);
    }
    
}
