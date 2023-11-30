package orm.teste;

import orm.action.ListarAlunos;
import orm.model.Aluno;

import java.util.List;

public class ListarAlunosTeste {
    public static void main(String[] args) {
        ListarAlunos listarAlunos = new ListarAlunos();
        List<Aluno> alunos = listarAlunos.listarAlunos("a");

        for (Aluno a:
             alunos) {
            System.out.println(a.getId());
            System.out.println(a.getNome());
            System.out.println(a.getEmail());
            System.out.println(a.getDataNascimento());
            System.out.println(a.getNaturalidade());
            System.out.println(a.getEndereco());
        }

    }
}
