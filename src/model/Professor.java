package model;
//Sub-Classe de Pessoa
public class Professor extends Pessoa {

    private String materia;

    public Professor() {
        super();
    }

    public Professor(int id, String nome, String materia) {
        super();
        this.id = id;
        this.nome = nome;
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfessor() {
        return "|__________IMPRESS�O PROFE__________|" + "\n"
                + "Id Professor: " + "\t" + "\t" + this.getId() + "\n"
                + "Nome Professor: " + "\t" + this.getNome() + "\n"
                + "Materia Professor: " + "\t" + this.getMateria() + "\n";
    }
}
