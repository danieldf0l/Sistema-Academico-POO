package model;

//Classe agregada ah Aluno, onde, todo aluno tem um boletim
public class Boletim {

    private double nota1, nota2, nota3;

    public Boletim() {

    }

    public Boletim(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calculaMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    //Retorna true/false do aluno mediante chamado do metodo anterior, seria interessante ter como parametro qual e o minimo de aprovacao da instituicao
    public boolean testeAprovacao() {
        return this.calculaMedia() > 5;
    }

    //Retorna a situação do aluno. maneira de leitura do teste: (teste condicao) ? "Caso verdadeiro" : "Caso falso";
    //O método "testeAprovacao" já poderia retornar a String de Aprovado ou Reprovado, so nao quis mudar isso depois
    public String StringAprovacao() {
        return this.testeAprovacao() ? "APROVADO" : "REPROVADO ";
    }
}
