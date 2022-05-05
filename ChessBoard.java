public class ChessBoard 
{
	ChessPiece[][] board;
	public int length;
	int size;

	public ChessBoard(int n)
	{
		try{
			board = new ChessPiece[n][n];
			for(int i = 0; i < n; i++) {
				for(int j =0; j <n; j++){
					setPiece(new Empty(), i, j);
				}
			}
		}

		catch (OutOfBoardException e) {
			e.printStackTrace();
		}
	}
	

	public ChessBoard(int n, ChessPiece e) {
		try {
			board = new ChessPiece[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					setPiece(e, i, j);
				}
			}
		}

		catch (OutOfBoardException r) {
			r.printStackTrace();
		}
	}

	public String toString() {
		String returnStr = "";
		for (int j = 7; j >=0; j--) {
			returnStr += "="+j+"=";
			for (int i = 0; i < board.length; i++) {
				returnStr += " " + getPiece(i, j) + " ";
			}

			returnStr += "/n";
		}
		returnStr+= "=== =0= =1= =2= =3= =4= =5= =6= =7=";
		return returnStr;
	}

	public boolean setPiece(ChessPiece t, int i, int j) throws OutOfBoardException {
		if((i >= 0 && i <=7) || (j >= 0 && j <=7)) {
			board[i][j] = t;
			return true;
		}

		else {
			throw new OutOfBoardException("invalid board position.");
		}
	}

	public ChessPiece getPiece(int i, int j)
	{ 
		return board[i][j];
	}

}
