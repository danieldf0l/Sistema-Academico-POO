package model;
//Super-Classe de Professor e Aluno
public class Pessoa {
    protected int id;
    protected String nome; //Atributos Protected para serem visíveis apenas aos filhos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
