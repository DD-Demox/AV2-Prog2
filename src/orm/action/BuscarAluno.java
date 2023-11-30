package orm.action;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscarAluno {
    public Aluno buscarAluno(long id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alunos");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Aluno aluno = entityManager.find(Aluno.class, id);
        entityManager.close();
        entityManagerFactory.close();
        return aluno;
    }
}
