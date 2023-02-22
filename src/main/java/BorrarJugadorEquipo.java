import entity.Equipos;
import entity.Jugadores;
import jakarta.persistence.*;

public class BorrarJugadorEquipo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction= entityManager.getTransaction();

        try{
            transaction.begin();
            Jugadores jugador621= entityManager.find(Jugadores.class,621);
            entityManager.remove(jugador621);

            Equipos equipoRoyals= entityManager.find(Equipos.class,"Royals");
            entityManager.remove(equipoRoyals);

            transaction.commit();
        }finally {
            if(transaction.isActive()){
                transaction.rollback();
            }


        entityManager.close();
        entityManagerFactory.close();
        }
    }
}
