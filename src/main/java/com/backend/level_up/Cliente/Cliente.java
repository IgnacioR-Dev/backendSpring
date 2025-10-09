package com.backend.level_up.Cliente;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id_cliente;

    @Column
    private String nombre;
    
    @Column
    private String apellido;

    @Column
    private String correo;

    @Column
    private String contraseña;

    private String telefono;

    private String direccion;

    @Column
    @JsonProperty("id_comuna")
    private String id_comuna; // futura FK a otra tabla, por el momento se definió como String para prueba en la comunicacion con la BD.

    @Column
    @JsonProperty("fecha_nacimiento")
    private LocalDate fecha_nacimiento;

  
    public Cliente() {}

    public Cliente(Long id_cliente, String nombre,String apellido, String correo, String contraseña,
                    String telefono, String direccion, String id_comuna, LocalDate fecha_nacimiento) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id_comuna = id_comuna;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
    @JsonProperty("id_cliente")
    public Long getIdCliente() {
        return id_cliente;
    }

    @JsonProperty("id_cliente")
    public void setIdCliente(Long id_cliente) {
        this.id_cliente = id_cliente;
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
        this.apellido =apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @JsonProperty("id_comuna")
    public String getIdComuna() {
        return id_comuna;
    }

    @JsonProperty("id_comuna")
    public void setIdComuna(String id_comuna) {
        this.id_comuna = id_comuna;
    }

    @JsonProperty("fecha_nacimiento")
    public LocalDate getFechaNacimiento() {
        return fecha_nacimiento;
    }

    @JsonProperty("fecha_nacimiento")
    public void setFechaNacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
