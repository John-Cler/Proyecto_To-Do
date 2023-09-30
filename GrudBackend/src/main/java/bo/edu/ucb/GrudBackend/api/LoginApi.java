package bo.edu.ucb.GrudBackend.api;

import bo.edu.ucb.GrudBackend.Service.LoginService;
import bo.edu.ucb.GrudBackend.dto.Login;
import bo.edu.ucb.GrudBackend.dto.Response;
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
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Login loginRequest) {
//        if (authService.authenticate(loginRequest.getUser(), loginRequest.getPassword())) {
//            return new ResponseEntity<>("Login exitoso", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Credenciales incorrectas", HttpStatus.UNAUTHORIZED);
//        }
//    }
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Login loginRequest) {
        if (loginService.authenticate(loginRequest)) {
            return ResponseEntity.ok("Login exitoso");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas verifique su usuario y password porfavor");
        }
    }
}
