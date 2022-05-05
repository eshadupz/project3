public class Rook extends ChessPiece {

	public String name; 

	public Rook() {

        super( name: "-r-");
        name = "-r-";
	}

	public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }


	@Override
    public boolean move(int initposX, int initposY, int finalposX, int finalposY) {
    	if (initposX == finalposX) {
    		return true;
    	}

    	else if (initposY == finalposY) {
    		return true;
    	}

    	else {
    		return false;
    	}
    }

}

