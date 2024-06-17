package model;
//Sub classe de Pessoa
public class Aluno extends Pessoa {

    public Boletim boletim; //Todo aluno tem um boletim, por ele q e acessado as notas e medias

    public Aluno() {
        super();
        this.boletim = new Boletim();
    }

    public Aluno(int id, String nome) {
        super();
        this.nome = nome;
        this.id = id;
        this.boletim = new Boletim();
    }

    public Aluno(int id, String nome, int nota1, int nota2, int nota3) {
        super();
        this.nome = nome;
        this.id = id;
        this.boletim = new Boletim(nota1, nota2, nota3);
    }

    public String getAluno() {
        return "|__________IMPRESS�O ALUNO__________|" + "\n"
                + "Id Aluno: " + "\t" + "\t" + this.getId() + "\n"
                + "Nome Aluno: " + "\t" + "\t" + this.getNome() + "\n"
                + "1� Nota: " + "\t" + "\t" + Double.toString(this.boletim.getNota1()) + "\n"
                + "2� Nota: " + "\t" + "\t" + Double.toString(this.boletim.getNota2()) + "\n"
                + "3� Nota: " + "\t" + "\t" + Double.toString(this.boletim.getNota3()) + "\n"
                + "M�dia Aluno: " + "\t" + "\t" + Double.toString(this.boletim.calculaMedia()) + "\n"
                + "Situa��o Aluno: " + "\t" + this.boletim.StringAprovacao() + "\n";
    }
}