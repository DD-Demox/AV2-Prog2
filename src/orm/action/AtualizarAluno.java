package orm.action;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtualizarAluno {
    private Aluno aluno;

    public AtualizarAluno(Aluno aluno){
        this.aluno = aluno;
        this.atualizarAluno();

    }

    private void atualizarAluno(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alunos");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.merge(this.aluno);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();



    }
}
