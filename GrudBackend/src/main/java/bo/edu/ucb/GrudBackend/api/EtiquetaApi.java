//package bo.edu.ucb.GrudBackend.api;
//
//import bo.edu.ucb.GrudBackend.bl.EtiquetaBl;
//import bo.edu.ucb.GrudBackend.bl.LoginBl;
//import bo.edu.ucb.GrudBackend.dto.Etiqueta;
//import bo.edu.ucb.GrudBackend.dto.Response;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "*")
//public class EtiquetaApi {
//    private EtiquetaBl etiquetaBl;
//
//    public EtiquetaApi(EtiquetaBl etiquetaBl){
//        this.etiquetaBl = etiquetaBl;
//    }
//    @GetMapping("/api/v1/etiqueta")
//    public Response<List<Etiqueta>> getAllEtiquetas(@RequestHeader("Authorizacion") String token ){
//        LoginBl loginBl = new LoginBl();
//        if (!loginBl.validateToken(token)){
//            Response<List<Etiqueta>> response = new Response<>();
//            response.setCode("0001");
//            response.setResponse(null);
//            response.setErrorMessage("Token invalido");
//            return response;
//        }
//        Response<List<Etiqueta>> response = new Response<>();
//        response.setCode("0000");
//        response.setResponse(this.etiquetaBl.getAllEtiquetas());
//        return response;
//    }
//
//    @GetMapping("/api/v1/etiqueta/{etiquetaId}")
//    public Response<Etiqueta>getEtiquetaById(@PathVariable("etiquetaId") Integer id, @RequestHeader("Autorization") String token){
//        Response<Etiqueta> response = new Response<>();
//        LoginBl loginBl = new LoginBl();
//        if (!loginBl.validateToken(token)){
//            response.setCode("0001");
//            response.setResponse(null);
//            response.setErrorMessage("Token Invalido");
//            return response;
//        }
//        //Busca el elemento en la lista
//        Etiqueta etiqueta = this.etiquetaBl.getEtiquetaById(id);
//        //Retorna un error sino existe.
//        if (etiqueta == null){
//            response.setCode("404");
//            response.setResponse(null);
//            response.setErrorMessage("Etiqueta no encontrada");
//            return response;
//        }
//        else {
//            //Si existe el valor entonces retornara el elemento
//            response.setCode("0000");
//            response.setResponse(etiqueta);
//            return response;
//        }
//    }
//    //UPDATE DE ETIQUETAS POR EL ID
//    @PutMapping("/api/v1/etiqueta/{etiquetaId}")
//    public Response<Etiqueta> updateEtiquetaById(@PathVariable Integer etiquetaId,@RequestBody Etiqueta nuevaEtiqueta,@RequestHeader("Authorization") String token ){
//        Response<Etiqueta> response = new Response<>();
//        LoginBl loginBl =new LoginBl();
//        if (!loginBl.validateToken(token)){
//            response.setCode("0001");
//            response.setResponse(null);
//            response.setErrorMessage("token invalido");
//            return response;
//        }
//        //Busca un elemento en la lista
//        Etiqueta etiqueta =this.etiquetaBl.getEtiquetaById(etiquetaId);
//        //RETORNA ERROR SINO EXISTE EL VALOR EN LA LISTA
//        if (etiqueta == null){
//            response.setCode("404");
//            response.setResponse(null);
//            response.setErrorMessage("Etiqueta no encontrado");
//            return response;
//        }else {
//            this.etiquetaBl.updateEtiquetaById(etiquetaId,nuevaEtiqueta);
//            //Si existe el valor entonces retorna el elemento
//            response.setCode("0000");
//            response.setResponse(etiqueta);
//            return response;
//        }
//    }
//    //CREAR TAREA
//    @PostMapping("/api/v1/etiqueta")
//    public Response<String> createEtiqueta(@RequestBody Etiqueta etiqueta,@RequestHeader("Authorization") String token){
//        Response<String> response = new Response<>();
//        LoginBl loginBl = new LoginBl();
//        if (!loginBl.validateToken(token)){
//            response.setCode("0001");
//            response.setResponse(null);
//            response.setErrorMessage("token Invalido");
//            return response;
//        }
//        this.etiquetaBl.CrearEtiqueta(etiqueta);
//        response.setCode("0000");
//        response.setResponse("Etiqueta creado con exito");
//        return response;
//    }
//}
