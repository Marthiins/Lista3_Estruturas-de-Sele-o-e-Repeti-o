//Faça um programa que leia vários conjuntos de três valores reais
//e mostre para cada conjunto: sua soma, seu produto e sua média. O
//programa para quando um conjunto não entrar com seus valores em
//ordem crescente.



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
public class Lista3_Exercicio6 {
   public static void main(String[] args) {

        Scanner lista3 = new Scanner(System.in);

        double valor1, valor2, valor3, soma, produto, media;

        System.out.println("Informe o 1º valor:");
        valor1 = lista3.nextDouble();
        System.out.println("Informe o 2º valor:");
        valor2 = lista3.nextDouble();
        System.out.println("Informe o 3º valor:");
        valor3 = lista3.nextDouble();

        while ((valor1 < valor2) && (valor2 < valor3) && (valor1 < valor3)) {
            soma = (valor1 + valor2 + valor3);
            produto = (valor1 * valor2 * valor3);
            media = (valor1 + valor2 + valor3) / 3;

            System.out.println("A soma:" + soma);
            System.out.println("o produto:" + produto);
            System.out.println("A média:" + media);

            System.out.println("Informe o 1º valor:");
            valor1 = lista3.nextDouble();
            System.out.println("Informe o 2º valor:");
            valor2 = lista3.nextDouble();
            System.out.println("Informe o 3º valor:");
            valor3 = lista3.nextDouble();

        }
    }

}
 

