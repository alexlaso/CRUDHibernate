package EXAMEN;

import entity.Equipos;
import entity.Partidos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ApartadoC {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();

            Equipos equipos = new Equipos();
            equipos.setNombre("Tullidos");
            equipos.setCiudad("Hollywood");
            equipos.setConferencia("East");
            equipos.setDivision("Central");

            entityManager.persist(equipos);

            transaction.commit();
        }finally{
            if(transaction.isActive()){
                transaction.rollback();
            }
        }

        try{
            transaction.begin();

            Partidos partidos = new Partidos();
            partidos.setTemporada("05/06");
            partidos.setCodigo(100000);
            partidos.setEquipoLocal("Tullidos");
            partidos.setEquipoVisitante("Mavericks");
            partidos.setPuntosLocal(1230);
            partidos.setPuntosVisitante(12);

            Partidos partidosDos = new Partidos();
            partidosDos.setTemporada("05/06");
            partidosDos.setCodigo(200000);
            partidosDos.setEquipoLocal("Cavaliers");
            partidosDos.setEquipoVisitante("Tullidos");
            partidosDos.setPuntosLocal(2);
            partidosDos.setPuntosVisitante(12000);

            entityManager.persist(partidos);
            entityManager.persist(partidosDos);

            transaction.commit();
        }finally{
            if(transaction.isActive()){
                transaction.rollback();
            }
        }

        try{
            transaction.begin();

            Partidos local = entityManager.find(Partidos.class,100000);
            entityManager.remove(local);

            Partidos visitante = entityManager.find(Partidos.class,200000);
            entityManager.remove(visitante);

            Equipos tullidos = entityManager.find(Equipos.class,"Tullidos");
            entityManager.remove(tullidos);

            transaction.commit();
        }finally {
            if(transaction.isActive()){
                transaction.rollback();
            }
        }


        entityManager.close();
        entityManagerFactory.close();
    }
}
