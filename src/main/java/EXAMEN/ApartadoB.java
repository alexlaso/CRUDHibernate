package EXAMEN;

import entity.Estadisticas;
import entity.Jugadores;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ApartadoB {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Jugadores jugadores = new Jugadores();
            jugadores.setProcedencia("Españita");
            jugadores.setCodigo(1234);
            jugadores.setPosicion("F");
            jugadores.setPeso(69);
            jugadores.setAltura("2-10");
            jugadores.setNombre("Pancho");
            jugadores.setNombreEquipo("Mavericks");


            Estadisticas estadisticas = new Estadisticas();
            estadisticas.setCodigoJugador(1234);
            estadisticas.setTemporada("05/06");
            estadisticas.setPuntosPorPartido(7.0);
            estadisticas.setRebotesPorPartido(5.0);
            estadisticas.setTaponesPorPartido(0.0);
            estadisticas.setAsistenciasPorPartido(0.0);



            Jugadores jugadoresDos = new Jugadores();
            jugadores.setProcedencia("Españita");
            jugadores.setCodigo(1235);
            jugadores.setPosicion("F");
            jugadores.setPeso(69);
            jugadores.setAltura("2-10");
            jugadores.setNombre("Halfonso");
            jugadores.setNombreEquipo("Mavericks");


            Estadisticas estadisticasDos = new Estadisticas();
            estadisticas.setCodigoJugador(1235);
            estadisticas.setTemporada("05/06");
            estadisticas.setPuntosPorPartido(7.0);
            estadisticas.setRebotesPorPartido(5.0);
            estadisticas.setTaponesPorPartido(0.0);
            estadisticas.setAsistenciasPorPartido(0.0);



            Jugadores jugadoresTres = new Jugadores();
            jugadores.setProcedencia("Españita");
            jugadores.setCodigo(1234);
            jugadores.setPosicion("F");
            jugadores.setPeso(69);
            jugadores.setAltura("2-10");
            jugadores.setNombre("MisterDed");
            jugadores.setNombreEquipo("Mavericks");


            Estadisticas estadisticasTres = new Estadisticas();
            estadisticas.setCodigoJugador(1236);
            estadisticas.setTemporada("05/06");
            estadisticas.setPuntosPorPartido(7.0);
            estadisticas.setRebotesPorPartido(5.0);
            estadisticas.setTaponesPorPartido(0.0);
            estadisticas.setAsistenciasPorPartido(0.0);

            entityManager.persist(jugadores);
            entityManager.persist(estadisticas);
            transaction.commit();

            entityManager.persist(jugadoresDos);
            entityManager.persist(estadisticasDos);
            transaction.commit();

            entityManager.persist(jugadoresTres);
            entityManager.persist(estadisticasTres);
            transaction.commit();
        }finally {
            if(transaction.isActive()){
                transaction.rollback();
            }
    }
    }
}