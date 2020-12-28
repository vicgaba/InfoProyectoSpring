package com.informatorio.proyecto.models;

import javax.persistence.*;
import java.util.Date;

@Entity //con esta anotación decimos que es un modelo de una tabla
@Table(name = "user") //aca definimos el nombre de la tabla
public class UsuarioModel {

    @Id //le indicamos que este es el id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //que se autogenera y que es incrementable
    @Column(unique = true, nullable = false) //es único y no puede ser nulo
    private Integer id;

    private String nombre;
    private String apellido;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private Date fechaCreacion;
    private String ciudad;
    private String provincia;
    private String pais;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaCreacon() {
        return fechaCreacion;
    }

    public void setFechaCreacon(Date fechaCreacon) {
        this.fechaCreacion = fechaCreacon;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
