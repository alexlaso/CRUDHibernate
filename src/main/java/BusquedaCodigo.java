import entity.Estadisticas;
import entity.Jugadores;
import jakarta.persistence.*;

import java.util.List;
import java.util.Scanner;

public class BusquedaCodigo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction= entityManager.getTransaction();
        Scanner sc= new Scanner(System.in);
        int codigo;

        System.out.println("Introduzca el código del jugador a buscar: ");
        codigo= sc.nextInt();

        String busqueda="SELECT e FROM  Jugadores e WHERE e.codigo="+codigo;
        String busqueda2="SELECT e FROM Estadisticas e WHERE e.codigoJugador="+codigo;

        Query query= entityManager.createQuery(busqueda);
        Query query2= entityManager.createQuery(busqueda2);
        List<Jugadores> listaJugador=query.getResultList();
        List<Estadisticas> listaEstadisticas=query2.getResultList();


        for(Jugadores e: listaJugador){
            System.out.println("Codigo Jugador: "+e.getCodigo());
            System.out.println("Nombre: "+e.getNombre());
            System.out.println("Equipo: "+e.getNombreEquipo());
            for (Estadisticas i: listaEstadisticas){
                System.out.print(i.getTemporada()+"     ");
                System.out.print(i.getPuntosPorPartido()+"     ");
                System.out.print(i.getAsistenciasPorPartido()+"     ");
                System.out.print(i.getTaponesPorPartido()+"     ");
                System.out.print(i.getRebotesPorPartido()+"     ");
                System.out.println("");
            }

        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
