import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



public class ReclamationNotFoundAdvice {


	  @ResponseBody
	  @ExceptionHandler(ReclamationNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String employeeNotFoundHandler(ReclamationNotFoundException ex) {
	    return ex.getMessage();
	  }
	  
	  
}
