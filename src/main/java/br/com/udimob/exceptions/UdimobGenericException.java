package br.com.udimob.exceptions;

public class UdimobGenericException extends Exception {

	private static final long serialVersionUID = 1L;

	public UdimobGenericException() {
		super();
	}

	public UdimobGenericException(String message, Throwable cause) {
		super(message, cause);
	}

	public UdimobGenericException(String message) {
		super(message);
	}

	public UdimobGenericException(Throwable cause) {
		super(cause);
	}

}
