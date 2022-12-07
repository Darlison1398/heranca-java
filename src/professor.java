public class professor extends Pessoa{
    private int numMatricula;
    private String disciplinas;
    private float salario;

    public void empregado(){
        System.out.println(this.getNome() + ", É funcionário público.");
    }

    public void receberAumento(float aumento){
        this.salario += aumento;
        System.out.println(this.getNome() + ", recebeu um aumento de "+ this.salario);
    }

    public  void materias(){
        String[] disc = {"Português", ", Matemática," + " Ciências"};
        return;
    }

    public professor(){
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
