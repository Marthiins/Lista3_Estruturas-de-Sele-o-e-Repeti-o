
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
public class Lista3_Exercicio7 {
      public static void main(String[] args) {
        // TODO code application logic here

        Scanner Nota = new Scanner(System.in);
        double mediaF, contaMedia = 0, mediaTurma, mediaMaior = 0, menorMedia = 0;
        int contador = 0;
        System.out.println("Programa encerra quando digitar um valor negativo");
        System.out.println("Informe a média final do aluno:");
        mediaF = Nota.nextDouble();
        mediaMaior = mediaF;
        menorMedia = mediaF;
        while (mediaF > 0) {
            contador = contador + 1;
            contaMedia = (mediaF + contaMedia);
            if (mediaMaior < mediaF) {
                mediaMaior = mediaF;
            } else if (menorMedia > mediaF) {
                menorMedia = mediaF;
            }
            System.out.println("Informe a média final do aluno:");

            mediaF = Nota.nextDouble();

        }
        mediaTurma = contaMedia / contador;
        System.out.println("Maior:" + mediaMaior);
        System.out.println("Menor:" + menorMedia);
        System.out.println("Media geral:" + mediaTurma);

    }

}

