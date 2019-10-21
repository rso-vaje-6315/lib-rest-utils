package si.rso.rest.exceptions;

import javax.ws.rs.core.Response;

public class ServiceCallException extends RestException {
    
    public ServiceCallException(String message) {
        super(message, Response.Status.SERVICE_UNAVAILABLE);
    }
    
    public ServiceCallException(String message, Throwable cause) {
        super(message, Response.Status.SERVICE_UNAVAILABLE, cause);
    }
    
}
