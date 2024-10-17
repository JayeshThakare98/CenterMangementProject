package com.sen.Exception;

public class ResourceNotFoundException extends  Exception {
    //extra properties that you want to mange
    public ResourceNotFoundException() {
        super("Resource not found on server !!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }


}
