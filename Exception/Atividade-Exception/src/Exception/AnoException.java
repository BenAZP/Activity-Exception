package Exception;

import java.lang.Exception;


public class AnoException extends Exception {
	public AnoException() {
        System.out.println("O ano nao e bissexto");
    }

    public AnoException(String message) {
        super(message);
    }

    public AnoException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnoException(Throwable cause) {
        super(cause);
    }

    public AnoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
