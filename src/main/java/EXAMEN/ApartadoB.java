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

            Jugadores jugadoresDos = new Jugadores();
            jugadoresDos.setProcedencia("Españita");
            jugadoresDos.setCodigo(1235);
            jugadoresDos.setPosicion("F");
            jugadoresDos.setPeso(69);
            jugadoresDos.setAltura("2-10");
            jugadoresDos.setNombre("Halfonso");
            jugadoresDos.setNombreEquipo("Mavericks");

            Jugadores jugadoresTres = new Jugadores();
            jugadoresTres.setProcedencia("Españita");
            jugadoresTres.setCodigo(1236);
            jugadoresTres.setPosicion("F");
            jugadoresTres.setPeso(69);
            jugadoresTres.setAltura("2-10");
            jugadoresTres.setNombre("MisterDed");
            jugadoresTres.setNombreEquipo("Mavericks");

            entityManager.persist(jugadores);
            entityManager.persist(jugadoresDos);
            entityManager.persist(jugadoresTres);

            transaction.commit();
        }finally {
            if(transaction.isActive()){
                transaction.rollback();
            }
    }
        try{
            transaction.begin();

            Estadisticas estadisticas = new Estadisticas();
            estadisticas.setCodigoJugador(1234);
            estadisticas.setTemporada("05/06");
            estadisticas.setPuntosPorPartido(7.0);
            estadisticas.setRebotesPorPartido(5.0);
            estadisticas.setTaponesPorPartido(0.0);
            estadisticas.setAsistenciasPorPartido(0.0);

            Estadisticas estadisticasDos = new Estadisticas();
            estadisticasDos.setCodigoJugador(1235);
            estadisticasDos.setTemporada("05/06");
            estadisticasDos.setPuntosPorPartido(7.0);
            estadisticasDos.setRebotesPorPartido(5.0);
            estadisticasDos.setTaponesPorPartido(0.0);
            estadisticasDos.setAsistenciasPorPartido(0.0);

            Estadisticas estadisticasTres = new Estadisticas();
            estadisticasTres.setCodigoJugador(1236);
            estadisticasTres.setTemporada("05/06");
            estadisticasTres.setPuntosPorPartido(7.0);
            estadisticasTres.setRebotesPorPartido(5.0);
            estadisticasTres.setTaponesPorPartido(0.0);
            estadisticasTres.setAsistenciasPorPartido(0.0);

            entityManager.persist(estadisticas);
            entityManager.persist(estadisticasDos);
            entityManager.persist(estadisticasTres);

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