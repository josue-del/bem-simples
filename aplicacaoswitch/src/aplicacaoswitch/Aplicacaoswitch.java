package aplicacaoswitch;

import java.util.Scanner;

/**
 * @author josue Esse algoritmo mostra uma mensagem de boas vindas Hello World e
 * uma estrutura Escolha caso "switch"
 */
public class Aplicacaoswitch {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int semana;
        String dia;
        System.out.println("Hello World for Git/GitHub");
        System.out.print("Informe um número de 1 até 7: ");
        semana = sc.nextInt();

        switch (semana) {
            case 1:
                dia = "Segunda-feira";
                break;
            case 2:
                dia = "Terça-feira";
                break;
            case 3:
                dia = "Quarta-feira";
                break;
            case 4:
                dia = "Quinta-feira";
                break;
            case 5:
                dia = "Sexta-feira";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia da semana não existe.";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
