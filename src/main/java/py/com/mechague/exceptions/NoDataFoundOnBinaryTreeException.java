package py.com.mechague.exceptions;

/**
 * @author Marcos Echague
 * @since 27/03/2019
 */

public class NoDataFoundOnBinaryTreeException extends RuntimeException {

    public NoDataFoundOnBinaryTreeException(String message){
        super(message);
    }

    public NoDataFoundOnBinaryTreeException(int key){
        super("The key "+key+" is not on the Binary tree");
    }
}
