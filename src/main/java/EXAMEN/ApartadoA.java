package EXAMEN;

import entity.Equipos;
import entity.Jugadores;
import entity.Partidos;
import jakarta.persistence.*;

import java.util.List;

public class ApartadoA {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        String busqueda = "SELECT j FROM Jugadores j WHERE j.nombreEquipo='Mavericks'";
        Query query= entityManager.createQuery(busqueda);
        List<Jugadores> resultado = query.getResultList();
        System.out.println("Jugadores");
        for (Jugadores j : resultado){
            System.out.println("Nombre: " + j.getNombre()+" Código: " + j.getCodigo()+" Procedencia: " + j.getProcedencia() +" Altura: " + j.getAltura()+" Peso: " + j.getPeso()+" Posicion: " + j.getPosicion() + " EQUIPO: " + j.getNombreEquipo());
        }


        String busquedaDos = "SELECT p FROM Partidos p WHERE p.equipoLocal='Mavericks' OR p.equipoVisitante='Mavericks'";
        Query queryDos = entityManager.createQuery(busquedaDos);
        System.out.println("Partidos");
        List<Partidos> resultadoDos = queryDos.getResultList();
        for (Partidos p : resultadoDos){
            System.out.println("Equipo local: "+p.getEquipoLocal()+" Equipo visitante: "+p.getEquipoVisitante()+" Puntos local: "+p.getPuntosLocal() +" Puntos visitante: "+p.getPuntosVisitante()+" Temporada: "+p.getTemporada());
        }

        entityManager.close();
        entityManagerFactory.close();
        }
    }