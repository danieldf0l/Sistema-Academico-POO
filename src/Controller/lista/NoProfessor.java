package Controller.lista;

import model.Professor;

public class NoProfessor {
    private Professor valor;
    private NoProfessor proximo;

    public NoProfessor(Professor valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Professor getValor() {
        return valor;
    }

    public void setValorProfessor(Professor valor) {
        this.valor = valor;
    }

    public NoProfessor getProximo() {
        return proximo;
    }

    public void setProximo(NoProfessor proximo) {
        this.proximo = proximo;
    }
}
