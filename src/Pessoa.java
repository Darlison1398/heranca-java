public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;

    public Pessoa(){
    }

    /*public void votoObrigatorio(){
        getIdade();

        if (getIdade() > 18)
            System.out.println("Voto obrigatório");
        if (getIdade() < 18)
            System.out.println("Voto facultativo");
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if(idade >= 18){
            System.out.println("Maior de Idade. Voto Obrigatório");
        }else{
            System.out.println("Menor de idade. Não vota ou o vot é facultativo");
        }
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String mostrar(){
        return "\nNome: " + nome + "\nIdade: "+ idade + "\nCpf: "+ cpf;
    }
}
