package entity;

import jakarta.persistence.*;

@Entity
@IdClass(EstadisticasPK.class)
public class Estadisticas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Temporada")
    private String temporada;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CodigoJugador")
    private int codigoJugador;
    @Basic
    @Column(name = "PuntosPorPartido")
    private Double puntosPorPartido;
    @Basic
    @Column(name = "AsistenciasPorPartido")
    private Double asistenciasPorPartido;
    @Basic
    @Column(name = "TaponesPorPartido")
    private Double taponesPorPartido;
    @Basic
    @Column(name = "RebotesPorPartido")
    private Double rebotesPorPartido;

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getCodigoJugador() {
        return codigoJugador;
    }

    public void setCodigoJugador(int codigoJugador) {
        this.codigoJugador = codigoJugador;
    }

    public Double getPuntosPorPartido() {
        return puntosPorPartido;
    }

    public void setPuntosPorPartido(Double puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public Double getAsistenciasPorPartido() {
        return asistenciasPorPartido;
    }

    public void setAsistenciasPorPartido(Double asistenciasPorPartido) {
        this.asistenciasPorPartido = asistenciasPorPartido;
    }

    public Double getTaponesPorPartido() {
        return taponesPorPartido;
    }

    public void setTaponesPorPartido(Double taponesPorPartido) {
        this.taponesPorPartido = taponesPorPartido;
    }

    public Double getRebotesPorPartido() {
        return rebotesPorPartido;
    }

    public void setRebotesPorPartido(Double rebotesPorPartido) {
        this.rebotesPorPartido = rebotesPorPartido;
    }
}
