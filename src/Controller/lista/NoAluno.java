package Controller.lista;

import model.Aluno;

public class NoAluno {

    private Aluno valor;
    private NoAluno proximo;

    public NoAluno(Aluno valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Aluno getValor() {
        return valor;
    }

    public void setValor(Aluno valor) {
        this.valor = valor;
    }

    public NoAluno getProximo() {
        return proximo;
    }

    public void setProximo(NoAluno proximo) {
        this.proximo = proximo;
    }
}
