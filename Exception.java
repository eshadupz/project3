Part D:- Creating Exceptions for Error Cases

OutOfBoardException

public class outOfBoardException extends Exception

{

public outOfBoardException (String message)

{

super(message);

}

}

IllegalChessMoveException

Public class illegalChessMoveException extends Exception

{

public class illegalChessMoveException(String message)

{

super(message);

}

}

Only need to raise these exceptions in the main java class whenever exception condition occurs.