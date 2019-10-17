# Rest Utils library 1.0.0

## Deploy

```bash
mvn clean javadoc:jar source:jar deploy -P rso
```

## Usage

### Validation exception

Validation exception uses self-enclosing data, so there is no need to map its data. To provide better message to users, simply provide exception mapper:

```java
import si.rso.rest.exceptions.ValidationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ValidationException> {
    
    @Override
    public Response toResponse(ValidationException e) {
        return Response.status(e.getResponse().getStatus()).entity(e.getResponse()).build();
    }
}
```
