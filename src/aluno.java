public class aluno extends Pessoa{
    private int numMatricula;
    private String curso;

    public void bolsista(){
        System.out.println(this.getNome() + " é bolsista");
    }

    public aluno(){
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String apresentar(){
        return "\nCurso: "+curso;
    }
}
