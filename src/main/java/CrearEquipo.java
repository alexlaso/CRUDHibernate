import entity.Equipos;
import entity.Estadisticas;
import entity.Jugadores;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CrearEquipo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction= entityManager.getTransaction();

        try{
            transaction.begin();
            Equipos equipo= new Equipos();
            equipo.setNombre("Royals");
            equipo.setCiudad("London");
            equipo.setConferencia("East");
            equipo.setDivision("Atlantic");

            Jugadores jugador= new Jugadores();
            jugador.setCodigo(618);
            jugador.setNombre("James Joyce");
            jugador.setProcedencia("London");
            jugador.setAltura("5-10");
            jugador.setPeso(270);
            jugador.setPosicion("C-F");
            jugador.setNombreEquipo("Royals");

            Jugadores jugador2= new Jugadores();
            jugador2.setCodigo(619);
            jugador2.setNombre("Thomas Hugh");
            jugador2.setProcedencia("Liverpool");
            jugador2.setAltura("6-5");
            jugador2.setPeso(280);
            jugador2.setPosicion("F");
            jugador2.setNombreEquipo("Royals");

            Jugadores jugador3= new Jugadores();
            jugador3.setCodigo(620);
            jugador3.setNombre("Elias Casillas");
            jugador3.setProcedencia("Oviedo");
            jugador3.setAltura("7-0");
            jugador3.setPeso(300);
            jugador3.setPosicion("G");
            jugador3.setNombreEquipo("Royals");

            Jugadores jugador4= new Jugadores();
            jugador4.setCodigo(621);
            jugador4.setNombre("Ronald Weaver");
            jugador4.setProcedencia("Manchester");
            jugador4.setAltura("6-9");
            jugador4.setPeso(280);
            jugador4.setPosicion("C");
            jugador4.setNombreEquipo("Royals");

            entityManager.persist(equipo);
            entityManager.persist(jugador);
            entityManager.persist(jugador2);
            entityManager.persist(jugador3);
            entityManager.persist(jugador4);
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
