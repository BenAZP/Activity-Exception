package Exception;

import java.lang.Exception;

public class DiaException extends DataException {
	   public DiaException() {
	        System.out.println("O mes nao possui este dia.");
	        this.printStackTrace();
	    }

	    public DiaException(String message) {
	        super(message);
	    }

	    public DiaException(String message, Throwable cause) {
	        super(message, cause);
	    }

	    public DiaException(Throwable cause) {
	        super(cause);
	    }

	    public DiaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(message, cause, enableSuppression, writableStackTrace);
	    }
}
