package io.github.jorge85xx.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Id não encontrado, id: " + id);
    }
}
