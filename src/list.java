
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;

public class list {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        aluno al1 = new aluno();
        professor pro = new professor();
        responsabilidades res = new responsabilidades();

        pro.setDisciplinas("Matemática, Português, História");

        String cadastrarProfessor;


        al1.setNome(JOptionPane.showInputDialog("Nome do Aluno"));
        al1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do Aluno")));
        al1.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Cpf do aluno")));
        al1.setCurso(JOptionPane.showInputDialog("Seu curso"));
        al1.bolsista();
        /*p1.votoObrigatorio();*/

        pro.setNome(JOptionPane.showInputDialog("Nome do Professor"));
        pro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do Professor")));
        pro.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Cpf do Professor")));
        pro.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Aumento do professor")));
        pro.materias();

        System.out.println("ALUNO"+ al1.mostrar());
        System.out.println(al1.apresentar()+ "\n");

        System.out.println("PROFESSOR"+ pro.mostrar());
        pro.empregado();
        System.out.println(pro.getDisciplinas());
        pro.receberAumento(0f);

    }
}
