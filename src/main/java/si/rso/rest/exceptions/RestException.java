package si.rso.rest.exceptions;

import javax.ws.rs.core.Response;

public class RestException extends RuntimeException {
    
    private int status;
    
    public RestException(String message) {
        super(message);
        this.status = Response.Status.INTERNAL_SERVER_ERROR.getStatusCode();
    }
    
    public RestException(String message, Response.Status status) {
        super(message);
        this.status = status.getStatusCode();
    }
    
    public RestException(String message, int status) {
        super(message);
        this.status = status;
    }
    
    public int getStatus() {
        return this.status;
    }
}
