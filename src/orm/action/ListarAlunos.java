package orm.action;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ListarAlunos {
    public List<Aluno> listarAlunos(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alunos");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select a from Aluno as a");

        List<Aluno> alunos = new ArrayList<>();
        alunos = query.getResultList();
        entityManager.close();
        entityManagerFactory.close();
        return alunos;
    }
    public List<Aluno> listarAlunos(String letraInicial){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alunos");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select a from Aluno as a where a.nome like :letraInicial");
        query.setParameter("letraInicial",letraInicial+"%");

        List<Aluno> alunos = new ArrayList<>();
        alunos = query.getResultList();
        entityManager.close();
        entityManagerFactory.close();
        return alunos;
    }
}
