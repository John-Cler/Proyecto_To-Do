package bo.edu.ucb.GrudBackend.api;

import bo.edu.ucb.GrudBackend.dto.Login;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin(origins = "*")
public class LoginApi {
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Login loginRequest) {
//        if (authService.authenticate(loginRequest.getUser(), loginRequest.getPassword())) {
//            return new ResponseEntity<>("Login exitoso", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Credenciales incorrectas", HttpStatus.UNAUTHORIZED);
//        }
//    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Login loginRequest) {
    // Aquí puedes realizar la autenticación básica (por ejemplo, verificar las credenciales en memoria)
    if (isValidUser(loginRequest.getUser(), loginRequest.getPassword())) {
        return new ResponseEntity<>("Login exitoso", HttpStatus.OK);
    } else {
        return new ResponseEntity<>("Credenciales incorrectas", HttpStatus.UNAUTHORIZED);
    }
}

    private boolean isValidUser(String username, String password) {
        // Aquí puedes implementar la lógica para verificar las credenciales
        // En este ejemplo, simplemente verificamos que el nombre de usuario sea "usuario" y la contraseña sea "contraseña"
        return "usuario".equals(username) && "contraseña".equals(password);
    }
}
