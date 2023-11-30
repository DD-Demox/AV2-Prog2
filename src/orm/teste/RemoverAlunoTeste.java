package orm.teste;

import orm.action.BuscarAluno;
import orm.action.RemoverAluno;
import orm.model.Aluno;

import java.util.Scanner;

public class RemoverAlunoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o id");
        long id = Long.parseLong(scanner.nextLine());
        RemoverAluno removerAluno = new RemoverAluno();
        if(removerAluno.removerAluno(id) == true){
            System.out.println("Aluno removido");
        }else {
            System.out.println("Aluno nao encontrado");
        }


    }
}
