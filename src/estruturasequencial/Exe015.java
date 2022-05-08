
package estruturasequencial;
import java.util.Scanner;

public class Exe015 {
    public static void main(String args[]){
        int horaMensal;
        float salarioHora, salario;
        int impostoDeRenda = 11, inss = 8, sindicato = 5;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu Salário-Hora: ");
        salarioHora = sc.nextFloat();
        System.out.print("Informe as horas trabalhadas no mês: ");
        horaMensal = sc.nextInt();

        salario = salarioHora * horaMensal;
        
        float primeiroDesconto = ((salario * impostoDeRenda) / 100);
        float segundoDesconto = ((salario * inss) / 100);
        float terceiroDesconto = ((salario * sindicato) / 100);
        
        double salarioLiquido = (salario - (primeiroDesconto + segundoDesconto + terceiroDesconto));
        
        System.out.format("Salário Bruto:R$ %.2f\nIR(%d):R$ %.2f\nINSS(%d):R$ %.2f\nSindicato(%d):R$ %.2f\nSalário Liquido:R$ %.2f\n", salario, impostoDeRenda, primeiroDesconto, inss, segundoDesconto, sindicato, terceiroDesconto, salarioLiquido);


       
    }
}
