public class Bishop extends ChessPiece {
    private String name; 

    public Knight() {

        super( name: "-b-");
        name = "-b-";
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

@Override
    public boolean move(int initposX, int initposY, int finalposX, int finalposY) {
        for (int = 0; i <8;i++) {
            if(finalposX == (initposX + i) && ((finalposY ==(initposY+i)) || (finalposY == (initposY - i))) {
                return true;
            }

            else if(finalposX == (initposX - i) && ((finalposY == (initposY + i)) || (finalposY == (initposY -i)))) {
                return true;
            }

            else if (initposX == finalposX || initposY == finalposY) {
                return false;
            }
        }
        return false;
    }

  }
