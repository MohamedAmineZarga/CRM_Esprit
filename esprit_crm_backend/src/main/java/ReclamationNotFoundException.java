
public class ReclamationNotFoundException  extends RuntimeException {

	ReclamationNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
	}