
package estruturasequencial;

import java.util.Scanner;

public class Exe004 {
    public static void main(String args[]){
        float nota1, nota2, nota3, nota4, media;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.print("Segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.print("Terceira nota: ");
        nota3 = sc.nextFloat();
        System.out.print("Quarta nota: ");
        nota4 = sc.nextFloat();
        
        media = ((nota1 + nota2 + nota3 + nota4) / 4);
        
        System.out.format("Média: %.1f ponto(s)\n", media);
    }
}
