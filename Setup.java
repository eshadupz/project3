import java.io.*;
import java.util.*;

public class Setup {

        public static void main(String[] args) throws FileNotFoundException {


                Scanner scan = new Scanner(new File(chess_piece.txt));
                String line;
                String[] lineSegment;
                ChessBoard board = new ChessBoard(8);
                try {
                while(scan.hasNextLine()) {
                        line = scan.nextLine();
                        lineSegment = line.split(" ");
                        String pieceType ="";
                        pieceType = lineSegment[0];
                        System.out.println(lineSegment[0]);
                        int x = Integer.parseInt(lineSegment[1]);
                        int y = Integer.parseInt(lineSegment[2]);

                        if(Objects.equals(pieceType, "pawn")){
                                board.setPiece(new Pawn(), x, y);
                                System.out.println(board);
                                ChessPiece p = board.getPiece(x,y);
                        }

                        else if(Objects.equals(pieceType, "rook")){
                                board.setPiece(new Rook(), x, y);
                                System.out.println(board);
                        }

                        else if(Objects.equals(pieceType, "bishop")){
                                board.setPiece(new Bishop(), x, y);
                                System.out.println(board);
                        }

                        else if(Objects.equals(pieceType, "knight")){
                                board.setPiece(new Knight(), x, y);
                                System.out.println(board);
                        }
                        else {
                                System.out.println(board);
                        }

                        }}

                        catch (OutOfBoardException e) {
                                e.printStackTrace();
                        }
                }
        }







