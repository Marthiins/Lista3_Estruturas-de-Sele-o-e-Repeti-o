/*
 Escreva um algoritmo que gera números entre 1000 e 1999 e mostra
aqueles que divididos por 11 dão resto 5.
 */
/**
 *
 * @author Paulo Sérgio Martins
 */
public class Lista3_Exercicio4 {
    
       public static void main(String[] args) {
       
        for (int i = 1000; i < 2000; i++) {
            if (i % 11==5) {
                System.out.println("Números que tem o resto 5 é:" +i);
            }
        }
    }
    
}
