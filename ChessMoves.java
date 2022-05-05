import java.io.*;
import java.util.*;

public class ChessMoves {

	public static void main(String[] args) throws FileNotFoundException, OutOfBoardException {

		Scanner scan = new Scanner(new File(input2.txt));
		String line;
		String[] lineSegment;
		ChessBoard board = new ChessBoard(8);

		while (scan.hasNextLine()) {
			line = scan.nextLine();
			lineSegment = line.split(" ");
			String pieceType = "";
			pieceType = lineSegment[0];

			if(lineSegment.length >= 3) {
				int x = Integer.parseInt(lineSegment[1]);
				int y = Integer.parseInt(lineSegment[2]);
				try {
					switch (lineSegment[0]) {
						case "knight" -> {
							board.setPiece(new Knight(), x, y);
						}

						case "pawn" -> {
							board.setPiece(new Pawn(), x, y);
						}

						case "rook" -> {
							board.setPiece(new Rook(), x, y);
						}
						case "bishop" -> {
							board.setPiece(new Bishop(), x, y);
						}

						case "queen" -> {
							board.setPiece(new Queen(), x, y);
						}
						case "king" -> {
							board.setPiece(new King(), x, y);
						}
						case "move" -> {
							int finalposX = Integer.parseInt(lineSegment[3]);
							int finalposY = Integer.parseInt(lineSegment[4]);
							ChessPiece p = board.getPiece(x, y);

							if(p.move(x, y, finalposX, finalposY)) {
								board.setPiece(p, finalposX, finalposY);
								board.setPiece(new Empty(), x, y);
								System.out.println(p.getClass().getSimpleName() + "(" + x + "," + y + ")" + "(" + finalposX + "," + finalposY + ")");
								System.out.println("Moved! " + "(" + x + "," + y + ")" + "(" + finalposX + "," + finalposY + ")");
								System.out.println("=======================================");
							}
							else {
								System.out.println(p.getClass().getSimpleName() + "(" + x + "," + y + ")" + "(" + finalposX + "," + finalposY + ")");
								System.out.println("Invalid Move." + "(" + x + "," + y + ")" + "(" + finalposX + "," + finalposY + ")");
								System.out.println("=======================================");
							}
						}
					}
				}

		catch (OutOfBoardException e) {
		}
		System.out.println(board);
	}

	}
	}
}