package bo.edu.ucb.GrudBackend.dto;

public class Token {
    private String authToken;
    private String updateToken;

    public Token() {

    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUpdateToken() {
        return updateToken;
    }

    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }
}
