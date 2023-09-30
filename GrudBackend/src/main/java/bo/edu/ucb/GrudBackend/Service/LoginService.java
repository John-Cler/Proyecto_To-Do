package bo.edu.ucb.GrudBackend.Service;

import bo.edu.ucb.GrudBackend.dto.Login;
import org.springframework.stereotype.Service;

@Service
public class LoginService{
    public boolean authenticate(Login login) {
        // Aquí implementa la lógica de autenticación
        // Por ejemplo, puedes verificar el usuario y la contraseña en una base de datos

        // Supongamos una autenticación básica de usuario "admin" y contraseña "password"
        String expectedUser = "admin";
        String expectedPassword = "password";

        return expectedUser.equals(login.getUsername()) && expectedPassword.equals(login.getPassword());
    }
}
