package Controller.lista;

import java.util.Scanner;
import model.Aluno;

public class ListaDinamicaAluno {

    private NoAluno inicio;
    private NoAluno fim;

    public ListaDinamicaAluno() {
        this.inicio = null;
        this.fim = null;
    }

    private void inserePrimeiroElemento(Aluno valor) {
        NoAluno aux = new NoAluno(valor); // auxi eh a posi��o de mem�ria do primeiro elemento
        this.inicio = aux;
        this.fim = aux;
    }

    private void insereInicio(Aluno valor) {
        NoAluno aux = new NoAluno(valor);
        aux.setProximo(inicio);
        this.inicio = aux;
    }

    private void insereFinal(Aluno valor) {
        NoAluno aux = new NoAluno(valor);
        this.fim.setProximo(aux);
        this.fim = aux;
    }

    private void insereMeio(Aluno valor, int pos) {
        NoAluno aux = this.inicio;
        for (int i = 1; i < pos; i++) {
            aux = aux.getProximo();
        }
        NoAluno novo = new NoAluno(valor);
        novo.setProximo(aux.getProximo());
        aux.setProximo(novo);
    }

    public boolean insere(Aluno valor) {
        if (ehVazia()) {
            inserePrimeiroElemento(valor);
            return true;
        } else {
            insereFinal(valor);
            return true;
        }
    }

    public boolean insere(Aluno valor, int pos) {
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
        NoAluno aux = this.inicio;
        Rec(aux);
    }

    private void Rec(NoAluno temp) {
        if (temp != null) {
            System.out.println(temp.getValor().getAluno());
            Rec(temp.getProximo());
        } else {
        }
    }

    public void imprimir() {
        if (ehVazia()) {
            System.out.println("Lista vazia");
        } else {
            NoAluno aux = this.inicio;
            while (aux != null) {
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
        }
    }

    public Aluno getElemento(int pos) {
        if (!posValida(pos)) {
            return null;
        } else {
            NoAluno aux = this.inicio;
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
        NoAluno aux = this.inicio;
        while (aux != null) {
            tamanho++;
            aux = aux.getProximo();
        }
        return tamanho;
    }

    // Metodo usado na main para criacao de Aluno
    public Aluno criaAluno() {
        Scanner input = new Scanner(System.in);
        Aluno al = new Aluno();

        System.out.print("Insira o ID do Aluno: ");
        al.setId(Integer.parseInt(input.nextLine()));

        System.out.print("Insira o NOME do Aluno: ");
        al.setNome(input.nextLine());

        System.out.print("Insira a NOTA1: ");
        al.boletim.setNota1(Integer.parseInt(input.nextLine()));

        System.out.print("Insira a NOTA2: ");
        al.boletim.setNota2(Integer.parseInt(input.nextLine()));

        System.out.print("Insira a NOTA3: ");
        al.boletim.setNota3(Integer.parseInt(input.nextLine()));
        return al;
    }

}
