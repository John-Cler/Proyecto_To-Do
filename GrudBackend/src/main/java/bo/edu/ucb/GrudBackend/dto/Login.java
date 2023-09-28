package bo.edu.ucb.GrudBackend.dto;

public class Login {
    //Declaramos dos campos privados usuarname y password
    private String user;
    private String password;
    //Creacion de Constructor vacio
    public Login() {

    }
    //Creacion de construnctor
    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }
    //Constuccion de Getters y Setters

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
                "user='" + getUser() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }
}
