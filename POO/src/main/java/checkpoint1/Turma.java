package checkpoint1;

import java.util.TreeMap;

public class Turma {
    private String nome;
    private Professor professor;
    private TreeMap<Integer, Aluno> alunos;
    private Turno turno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public TreeMap<Integer, Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(TreeMap<Integer, Aluno> alunos) {
        this.alunos = alunos;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
