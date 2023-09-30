package bo.edu.ucb.GrudBackend.dto;

public class Login {
    //Declaramos dos campos privados usuarname y password
    private String username;
    private String password;
    //Creacion de Constructor vacio
    public Login() {

    }
    //Creacion de construnctor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //Constuccion de Getters y Setters

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

    @Override
    public String toString() {
        return "Login{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getUsername() + '\'' +
                '}';
    }
}
