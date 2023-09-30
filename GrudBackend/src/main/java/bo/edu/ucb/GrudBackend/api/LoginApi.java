package bo.edu.ucb.GrudBackend.api;

import bo.edu.ucb.GrudBackend.Service.LoginService;
import bo.edu.ucb.GrudBackend.dto.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class LoginApi {

    @Autowired
    private LoginService loginService;
    // Este endpoint permite a los usuarios iniciar sesión
    @PostMapping("/api/v1/login")
    public ResponseEntity<String> login(@RequestBody Login loginRequest) {
        // Se inyecta el servicio de autenticación
        if (loginService.authenticate(loginRequest)) {
            // Si la autenticación es exitosa, se devuelve una respuesta exitosa (código 200) con un mensaje
            return ResponseEntity.ok("Login exitoso");
        } else {
            // Si la autenticación falla, se devuelve una respuesta de error no autorizado (código 401) con un mensaje
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas verifique su usuario y password porfavor");
        }
    }
}
