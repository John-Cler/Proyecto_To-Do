package bo.edu.ucb.GrudBackend.dto;

public class Response<X> {
    // Campos para almacenar la información de respuesta
    private String errorMessage;
    private String code;
    private X response;
    // Constructor sin argumentos
    public Response() {

    }
    // Constructor con argumentos para inicializar la respuesta

    public Response(String errorMessage, String code, X response) {
        this.errorMessage = errorMessage;
        this.code = code;
        this.response = response;
    }

    // Getter para obtener el mensaje de error
    public String getErrorMessage() {
        return errorMessage;
    }
    // Setter para establecer el mensaje de error
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    // Getter para obtener el código de respuesta
    public String getCode() {
        return code;
    }

    // Setter para establecer el código de respuesta
    public void setCode(String code) {
        this.code = code;
    }

    // Getter para obtener la respuesta (de tipo genérico)
    public X getResponse() {
        return response;
    }

    // Setter para establecer la respuesta (de tipo genérico)
    public void setResponse(X response) {
        this.response = response;
    }
    @Override
    public String toString() {
        return "Response{" +
                "errorMessage='" + getErrorMessage() + "'" +// Concatena el mensaje de error
                ", code='" + getCode() + "'" + // Concatena el código de respuesta
                ", response=" + getResponse() + "'" + // Concatena la respuesta (de tipo genérico)
                '}';
    }
}
