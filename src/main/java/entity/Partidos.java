package entity;

import jakarta.persistence.*;

@Entity
public class Partidos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Codigo")
    private int codigo;
    @Basic
    @Column(name = "EquipoLocal")
    private String equipoLocal;
    @Basic
    @Column(name = "EquipoVisitante")
    private String equipoVisitante;
    @Basic
    @Column(name = "PuntosLocal")
    private Integer puntosLocal;
    @Basic
    @Column(name = "PuntosVisitante")
    private Integer puntosVisitante;
    @Basic
    @Column(name = "Temporada")
    private String temporada;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Integer getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(Integer puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public Integer getPuntosVisitante() {
        return puntosVisitante;
    }

    public void setPuntosVisitante(Integer puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
}
