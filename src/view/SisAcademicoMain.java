package view;

import Controller.lista.ListaDinamicaAluno;
import Controller.lista.ListaDinamicaProfessor;
import java.util.Scanner;

public class SisAcademicoMain {

    public static void main(String[] args) {
        ListaDinamicaProfessor ldf = new ListaDinamicaProfessor();
        ListaDinamicaAluno lda = new ListaDinamicaAluno();
        Scanner input = new Scanner(System.in);
        //Loop infinito. Unico metodo de encerrar eh escolhendo a opcao 0
        while (true) {
            System.out.println("\n" + "|_________SISTEMA ACAD�MICO_________|" + "\n"
                    + "[0] Para SAIR/IMPRIMIR" + "\n"
                    + "[1] Para inserir dados de ALUNOS" + "\n"
                    + "[2] Para inserir dados de PROFESSORES" + "\n"
                    + "|___________________________________|" + "\n"
                    + "DIGITE A OP��O DESEJADA: ");
            int opc = input.nextInt();
            switch (opc) {
                case 0 -> {
                    System.out.println("Encerrando programa...");
                    lda.imprimirRec();
                    ldf.imprimirRec();
                    System.exit(0);
                }
                case 1 -> {
                    lda.insere(lda.criaAluno());
                }
                case 2 -> {
                    ldf.insere(ldf.criaProfessor());
                }
                case 3 -> {
                    lda.imprimirRec();
                    ldf.imprimirRec();
                }
                default ->
                    System.out.println("Op��o inv�lida. Por favor, tente novamente com uma das op��es v�lidas" + "\n");
            }
        }
    }
}
