public class Empty extends ChessPiece {
    private String name;

    public Empty() {

        super( "---");
        name = "---";
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public boolean move(int initposX, int initposY, int finalposX, int finalposY) {
        return false;
    }

}

