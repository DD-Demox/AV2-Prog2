package orm.action;

import orm.model.Aluno;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverAluno {
    private Aluno aluno;

    public RemoverAluno(){
    }

    public boolean removerAluno(Long id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alunos");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        this.aluno = entityManager.find(Aluno.class,id);
        if(this.aluno == null){
            return false;
        }
        entityManager.remove(this.aluno);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return true;

    }
}
