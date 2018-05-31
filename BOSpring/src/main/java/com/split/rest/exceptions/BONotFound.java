package com.split.rest.exceptions;

public class BONotFound extends Exception {
	private static final long serialVersionUID = 9176382068329878558L;

    public BONotFound(String bo_id) {
        super("BO " + bo_id + " not found");
    }
}
