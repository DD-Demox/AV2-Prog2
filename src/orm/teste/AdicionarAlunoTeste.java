package orm.teste;

import orm.action.AdicionarAluno;
import orm.model.Aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AdicionarAlunoTeste {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        AdicionarAluno adicionarAluno;

        System.out.println("Digite o nome");
        String nome = scanner.nextLine();
        System.out.println("Digite o email");
        String email = scanner.nextLine();
        System.out.println("Digite o cpf");
        String cpf = scanner.nextLine();
        System.out.println("Digite o data de nascimento");
        String dataNascimento = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse(dataNascimento);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("Digite a naturalidade");
        String naturalidade = scanner.nextLine();
        System.out.println("Digite o endereço");
        String endereco = scanner.nextLine();

        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setEmail(email);
        aluno.setEndereco(endereco);
        aluno.setNaturalidade(naturalidade);
        aluno.setDataNascimento(calendar);

        adicionarAluno = new AdicionarAluno(aluno);
        adicionarAluno.adicionarAluno();


    }
}
