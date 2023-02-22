import entity.Estadisticas;
import entity.Jugadores;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertarEstadisticas {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction= entityManager.getTransaction();

        try{
            transaction.begin();
            Estadisticas estadisticas= new Estadisticas();
            estadisticas.setCodigoJugador(2077);
            estadisticas.setTemporada("05/06");
            estadisticas.setPuntosPorPartido(7.0);
            estadisticas.setRebotesPorPartido(5.0);
            estadisticas.setTaponesPorPartido(0.0);
            estadisticas.setAsistenciasPorPartido(0.0);

            Estadisticas estadisticas2= new Estadisticas();
            estadisticas2.setCodigoJugador(2077);
            estadisticas2.setTemporada("06/07");
            estadisticas2.setPuntosPorPartido(10.0);
            estadisticas2.setRebotesPorPartido(0.0);
            estadisticas2.setTaponesPorPartido(3.0);
            estadisticas2.setAsistenciasPorPartido(0.0);

            entityManager.persist(estadisticas);
            entityManager.persist(estadisticas2);
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
