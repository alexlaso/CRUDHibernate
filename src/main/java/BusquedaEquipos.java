import entity.Equipos;
import entity.Estadisticas;
import entity.Jugadores;
import jakarta.persistence.*;

import java.util.List;
import java.util.Scanner;

public class BusquedaEquipos {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction= entityManager.getTransaction();


        //String busqueda="SELECT e.nombre, i.codigo, AVG(p.puntosLocal, p.puntosVisitante)  FROM Jugadores i, Equipos e, Partidos p WHERE ";

//        String busqueda="SELECT e FROM Equipos e";
//        Query query= entityManager.createQuery(busqueda);
//        List<Equipos> listaEquipos= query.getResultList();
//
//        for (Equipos e: listaEquipos){
//            System.out.println(e.getNombre());
//            String nombre= e.getNombre();
//            String busqueda2="SELECT j FROM Jugadores j WHERE j.nombreEquipo='"+nombre+"'";
//            Query query2= entityManager.createQuery(busqueda2);
//            List<Jugadores> listaJugadores= query.getResultList();
//                for (Jugadores d: listaJugadores){
//                    System.out.println(d.getNombre());
//                    int codigo= d.getCodigo();
//                    String busqueda3="SELECT AVG(e.puntosPorPartido) FROM Estadisticas e WHERE e.codigoJugador='"+codigo+"'";
//                    Query query3= entityManager.createQuery(busqueda3);
//
//                }
//
//        }

        String busqueda="SELECT e FROM Equipos e";
        Query query= entityManager.createQuery(busqueda);
        List<Equipos> listaEquipos= query.getResultList();

        for (Equipos e: listaEquipos){
            System.out.println(e.getNombre());
            String busqueda2="SELECT j FROM Jugadores j WHERE j.nombreEquipo=:nombre";
            Query query2= entityManager.createQuery(busqueda2);
            query2.setParameter("nombre", e.getNombre());
            List<Jugadores> listaJugadores= query.getResultList();
//            for (Jugadores d: listaJugadores){
//                System.out.println(d.getNombre());
//                int codigo= d.getCodigo();
//                String busqueda3="SELECT AVG(e.puntosPorPartido) FROM Estadisticas e WHERE e.codigoJugador='"+codigo+"'";
//                Query query3= entityManager.createQuery(busqueda3);
//
//            }

        }


        entityManager.close();
        entityManagerFactory.close();
    }
}
