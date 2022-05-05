import java.io.*;
public abstract class ChessPiece  {

      private String pname;
      private int initposX;
      private int initposY;

       public ChessPiece(String name) {
                pname = name;
       }

       public String getName() {
                return pname;
       }

       public void setName(String n) {
                pname = n;
       }

       public String toString() {
        return getName();
       }

       public abstract boolean move(int initposX, int initposY, int finalposX, int finalposY);

       public int getinitposY() {
        return initposY;

       }
       public void setinitposY(int initposY) {
        this.initposY = initposY;
       }

       public int getinitposX() {
        return initposX;
       }

       public void setinitposX(int initposX) {
        this.initposX = initposX;
       }

  } 




       
