package bo.edu.ucb.GrudBackend.bl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import bo.edu.ucb.GrudBackend.dto.Login;
import bo.edu.ucb.GrudBackend.dto.Token;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;

import java.util.Date;

public class LoginBl {
    public static final String KEY = "12345678";

    public Token login(Login login){
        if ("John".equals(login.getUser()) && "Ingenieria23".equals(login.getPassword())){
            Token token = new Token();
            token.setAuthToken(generateToken(100, "Hector Ramirez", "AUTH", 30));
            token.setUpdateToken(generateToken(100, "Maria Magdalen", "UPDATE", 60));
            return token;
        }else {
            return null;
        }
    }
    private String generateToken(Integer userId, String nombre, String tipo, int minutes) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(KEY);
            String token = JWT.create()
                    .withIssuer("www.ucb.edu.bo")
                    .withClaim("userId",userId)
                    .withClaim("tipo", tipo)
                    .withClaim("nombre", nombre)
                    .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 + minutes))
                    .sign(algorithm);
            return token;
        }catch (JWTCreationException exception){
            System.out.println("Error al generar el token " + userId + " " + nombre + " " + tipo + " " + minutes);
            throw new RuntimeException("Error al generar el token", exception);
        }
    }

}
