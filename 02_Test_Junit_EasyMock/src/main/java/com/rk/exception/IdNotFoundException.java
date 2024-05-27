package com.rk.exception;

public class IdNotFoundException extends RuntimeException{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IdNotFoundException() {
    	
    }
    
    public IdNotFoundException(String msg) {
    	super(msg);
    }

}
