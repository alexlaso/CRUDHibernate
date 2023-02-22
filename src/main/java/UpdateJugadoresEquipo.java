import entity.Estadisticas;
import entity.Jugadores;
import jakarta.persistence.*;

import java.util.List;
import java.util.Scanner;

public class UpdateJugadoresEquipo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction= entityManager.getTransaction();

        String update="UPDATE Jugadores e SET e.nombreEquipo='Grizzlies' WHERE e.nombreEquipo='Warriors'";
        String update2="UPDATE Jugadores e SET e.nombreEquipo='Estudiantes' WHERE e.nombreEquipo='Grizzlies'";

        transaction.begin();
//        Query query= entityManager.createQuery(update);
//        query.executeUpdate();
        Query query2= entityManager.createQuery(update2);
        query2.executeUpdate();

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
