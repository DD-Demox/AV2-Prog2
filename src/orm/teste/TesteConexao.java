package orm.teste;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteConexao {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alunos");
        entityManagerFactory.close();
    }
}
