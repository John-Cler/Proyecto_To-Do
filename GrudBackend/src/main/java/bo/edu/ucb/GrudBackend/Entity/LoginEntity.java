package bo.edu.ucb.GrudBackend.Entity;

import jakarta.persistence.*;

@Entity // Esta anotación marca la clase como una entidad de base de datos.
@Table(name = "login") //Esta anotación especifica el nombre de la tabla de base de datos a la que se asignará esta entidad
//comienzo de la clase LoginEntity
public class LoginEntity {
    @Id //Esta anotación marca el campo id como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Esta anotación indica que el valor del campo id se generará automáticamente
    @Column(unique = true,nullable = false)//Esta anotación especifica que el campo id en la base de datos

    //Declaracion de variables
    private Long id;
    private String username;
    private String password;
    //Constructor vacio
    public LoginEntity() {
    }
    //Constructor declarado
    public LoginEntity(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    //Creacion de Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
