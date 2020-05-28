/*
 Faça um programa algoritmo para exibir a tabuada de 0 a 9.
 */

/**
 *
 * @author Paulo Sérgio Martins
 */
public class Lista3_Exercicio2 {
    
 public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Tabuada do número:"+i);
            
            for (int j = 0; j < 11; j++) {
                
                System.out.println(i + "X" + j+"="+(j*i));
            }   
        }
    }
}

