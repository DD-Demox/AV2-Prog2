package orm.teste;

import orm.action.AtualizarAluno;
import orm.action.BuscarAluno;
import orm.model.Aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AtualizarAlunoTeste {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        BuscarAluno buscarAluno = new BuscarAluno();
        Aluno aluno;

        System.out.println("Digite o id");
        long id = Long.parseLong(scanner.nextLine());
        aluno = buscarAluno.buscarAluno(id);
        System.out.println("Digite o nome");
        String nome = scanner.nextLine();
        System.out.println("Digite o email");
        String email = scanner.nextLine();
        System.out.println("Digite o cpf");
        String cpf = scanner.nextLine();
        System.out.println("Digite o data de nascimento");
        String dataNascimento = scanner.nextLine();
        Calendar calendar = null;
        if(!dataNascimento.isEmpty()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date date = sdf.parse(dataNascimento);
            calendar = Calendar.getInstance();
            calendar.setTime(date);
        }

        System.out.println("Digite a naturalidade");
        String naturalidade = scanner.nextLine();
        System.out.println("Digite o endereço");
        String endereco = scanner.nextLine();

        aluno.setId(id);
        if(!nome.isEmpty()){
            aluno.setNome(nome);
        }
        if(!cpf.isEmpty()){
            aluno.setCpf(cpf);
        }
        if(!email.isEmpty()){
            aluno.setEmail(email);
        }
        if(!endereco.isEmpty()){
            aluno.setEndereco(endereco);
        }
        if(!naturalidade.isEmpty()){
            aluno.setNaturalidade(naturalidade);
        }
        if (calendar != null){
            aluno.setDataNascimento(calendar);
        }


        AtualizarAluno atualizarAluno = new AtualizarAluno(aluno);


    }
}
