package com.usuarios.UsuariosRest.models;
//prueba 12
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UsuarioModel {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name") // Cambiado de "firstName" a "first_name"
    private String firstName;

    @Column(name = "last_name")  // Cambiado de "lastName" a "last_name"
    private String lastName;

    @Column
    private String email;
}
