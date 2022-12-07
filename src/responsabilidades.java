public class responsabilidades extends Pessoa {
    private String estudar;
    private String votar;
    private String Trabalhar;

    public responsabilidades(){
    }

    public String obrigado(){
        if (getIdade() >= 4 && getIdade() < 18){
            System.out.println("Obrigado a estudar");
        } else if (getIdade() >= 18) {
            System.out.println("Estudo faultativo");

        }

        return null;
    }

    public String getEstudar() {
        return estudar;
    }

    public void setEstudar(String estudar) {
        this.estudar = estudar;
        if (getIdade() >= 4){
            System.out.println("é obrigado a estudar");
        } else if (getIdade() >= 16) {
            System.out.println("Estudo facultativo");

        }
    }

    public String getVotar() {
        return votar;
    }

    public void setVotar(String votar) {
        if (getIdade() >= 16 && getIdade() <= 18){
            System.out.println("Voto facultativo");
        } else if (getIdade() > 18) {
            System.out.println("Voto obrigatório");
        }
        this.votar = votar;
    }

    public String getTrabalhar() {
        return Trabalhar;
    }

    public void setTrabalhar(String trabalhar) {
        Trabalhar = trabalhar;
    }
    public String apresentar(){
        return "Estudar: " + estudar + "\nVotar: "+ votar;
    }
}
