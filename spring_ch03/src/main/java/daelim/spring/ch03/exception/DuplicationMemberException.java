package daelim.spring.ch03.exception;

public class DuplicationMemberException extends RuntimeException {
    public DuplicationMemberException(String message){
        super(message);
    }

}

