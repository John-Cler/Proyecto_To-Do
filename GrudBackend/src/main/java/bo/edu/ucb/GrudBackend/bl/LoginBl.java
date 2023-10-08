package bo.edu.ucb.GrudBackend.bl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import bo.edu.ucb.GrudBackend.dto.Login;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LoginBl {
    public boolean authenticate(Login login) {
        // Aquí implementa la lógica de autenticación
        // Por ejemplo, puedes verificar el usuario y la contraseña en una base de datos

        // Supongamos una autenticación básica de usuario "admin" y contraseña "password"
        String expectedUser = "John";
        String expectedPassword = "12345";

        return expectedUser.equals(login.getUsername()) && expectedPassword.equals(login.getPassword());
    }

}
