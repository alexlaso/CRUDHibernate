package entity;

import jakarta.persistence.*;

@Entity
public class Equipos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "Ciudad")
    private String ciudad;
    @Basic
    @Column(name = "Conferencia")
    private String conferencia;
    @Basic
    @Column(name = "Division")
    private String division;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getConferencia() {
        return conferencia;
    }

    public void setConferencia(String conferencia) {
        this.conferencia = conferencia;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
