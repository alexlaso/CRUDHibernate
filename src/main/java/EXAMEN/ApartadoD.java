package EXAMEN;

import entity.Partidos;
import jakarta.persistence.*;

import java.util.List;

public class ApartadoD {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            for (int codigo = 1;codigo<=5;codigo++){
                String update="UPDATE Partidos p SET p.equipoLocal='Warriors', p.temporada='22/23' WHERE p.codigo="+codigo;
                Query query = entityManager.createQuery(update);
                query.executeUpdate();
            }
            transaction.commit();
        }finally{
            if(transaction.isActive()){
                transaction.rollback();
            }
        }


        entityManager.close();
        entityManagerFactory.close();
    }
}
