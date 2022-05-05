public class Pawn extends ChessPiece {
    private String name;
    private static int count = 0;

    public Pawn() {
        super( name: "-p-");
        name = "-p-";
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

    public boolean firstMove() {
        if (count == 0) {
            return true;
        }
        return false
    }

    @Override
    public boolean move(int initposX, int initposY, int finalposX, int finalposY) {
        if (firstMove() == true) {
            if (initposX == finalposX) {
                if (finalposY == (initposY + 1) || finalposY == (initposY-1)) {
                    count++;
                    return true;
                }
                else if (finalposY == (initposY+2) || finalposY == (initposY-2)) {
                    count++;
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        } 

        else {
            if (initposX == finalposX) {
                if (finalposY == (initposY+1) || finalposY == (initposY -1)) {
                    count++;
                    return true;
                }
                else{
                    return false;
                }
            else return false;
            }
        }
    }
}