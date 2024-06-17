package Controller.lista;

import java.util.Scanner;
import model.Professor;

public class ListaDinamicaProfessor {

    private NoProfessor inicio;
    private NoProfessor fim;

    public ListaDinamicaProfessor() {
        this.inicio = null;
        this.fim = null;
    }

    private void inserePrimeiroElemento(Professor valor) {
        NoProfessor aux = new NoProfessor(valor); // auxi � a posi��o de mem�ria do primeiro elemento
        this.inicio = aux;
        this.fim = aux;
    }

    private void insereInicio(Professor valor) {
        NoProfessor aux = new NoProfessor(valor);
        aux.setProximo(inicio);
        this.inicio = aux;
    }

    private void insereFinal(Professor valor) {
        NoProfessor aux = new NoProfessor(valor);
        this.fim.setProximo(aux);
        this.fim = aux;
    }

    private void insereMeio(Professor valor, int pos) {
        NoProfessor aux = this.inicio;
        for (int i = 1; i < pos; i++) {
            aux = aux.getProximo();
        }
        NoProfessor novo = new NoProfessor(valor);
        novo.setProximo(aux.getProximo());
        aux.setProximo(novo);
    }

    public boolean insere(Professor valor) {
        if (ehVazia()) {
            inserePrimeiroElemento(valor);
            return true;
        } else {
            insereFinal(valor);
            return true;
        }
    }

    public boolean insere(Professor valor, int pos) {
        if (ehVazia() && pos == 0) {
            inserePrimeiroElemento(valor);
            return true;
        } else if (pos == 0) {
            insereInicio(valor);
            return true;
        } else if (pos == tamanho()) {
            insereFinal(valor);
            return true;
        } else if (posValida(pos)) {
            insereMeio(valor, pos);
            return true;
        } else {
            return false;
        }
    }

    public boolean posValida(int pos) {
        return ((pos >= 0) && (pos < tamanho()));
    }

    public void imprimirRec() {
        NoProfessor aux = this.inicio;
        Rec(aux);
    }

    private void Rec(NoProfessor temp) {
        if (temp != null) {
            System.out.println(temp.getValor().getProfessor());
            Rec(temp.getProximo());
        } else {
        }
    }

    public void imprimir() {
        if (ehVazia()) {
            System.out.println("Lista vazia");
        } else {
            NoProfessor aux = this.inicio;
            while (aux != null) {
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
        }
    }

    public Professor getElemento(int pos) {
        if (!posValida(pos)) {
            return null;
        } else {
            NoProfessor aux = this.inicio;
            for (int i = 1; i <= pos; i++) {
                aux = aux.getProximo();
            }
            return aux.getValor();
        }
    }

    public boolean ehVazia() {
        return ((this.inicio == null) && (this.fim == null));
    }

    public int tamanho() {
        int tamanho = 0;
        NoProfessor aux = this.inicio;
        while (aux != null) {
            tamanho++;
            aux = aux.getProximo();
        }
        return tamanho;
    }
    //Metodo usado na main para criacao de Professor
    public Professor criaProfessor() {
        Professor pr = new Professor();
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o ID do Professor: ");
        pr.setId(Integer.parseInt(input.nextLine()));

        System.out.print("Insira o NOME do Professor: ");
        pr.setNome(input.nextLine());

        System.out.print("Insira a MAT�RIA do Professor: ");
        pr.setMateria(input.nextLine());
        return pr;
    }
}