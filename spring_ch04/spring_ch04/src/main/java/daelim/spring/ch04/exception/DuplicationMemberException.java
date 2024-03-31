package daelim.spring.ch04.exception;

public class DuplicationMemberException extends RuntimeException {
    public DuplicationMemberException(String message){
        super(message);
    }

}

