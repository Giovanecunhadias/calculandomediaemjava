/*
 * O exercício aqui proposto tem como base o que foi ensinado nas aulas até o momento e você tem plena capacidade de fazer, não deixe de praticar porque somente com a prática você aprenderá de verdade e se sentirá mais seguro. Vamos lá!



    No projeto Exercicios criado anteriormente:



    1 - Crie a classe  Exercicio002. Esta classe deve pedir para o usuário entrar com quatro valores através da console;



    2 - Tire a média dos valores e se o resultado for maior ou igual a 7.0 informe no console "Parabéns! Você aprovado com média:  X", caso contrário informe "Você foi reprovado com média: X", onde X é o valor da média;



    Obs.: A fórmula para calcular a média é:



    media = (nota1 + nota2 + nota3 + nota4) / 4




 */
import java.util.Scanner;
public class calcularmedia {
    public static void main(String[] args) {
        System.out.print("Digite a 1° nota: ");
        Scanner input = new Scanner(System.in);
        double nota1 = input.nextDouble();
        System.out.print("Digite a 2° nota: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite a 3° nota: ");
        double nota3 = input.nextDouble();
        System.out.print("Digite a 4° nota: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;

        /*Estrutura de condição */

        if(media >= 7.0){
            System.out.println("Aprovado!!!!!!");
        }
        else{
            System.out.println("Reprovado!!!!!!");
        }

    }
    
}