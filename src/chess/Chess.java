package chess;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class Chess extends JFrame{
    protected static King king = new King(4,0);
    protected static Pawn pawn0 = new Pawn(0,1);
    protected static Pawn pawn1 = new Pawn(1,1);



    protected static Pawn pawn2 = new Pawn(2,1);
    protected static Pawn pawn3 = new Pawn(3,1);
    protected static Pawn pawn4 = new Pawn(4,1);
    protected static Pawn pawn5 = new Pawn(5,1);
    protected static Pawn pawn6 = new Pawn(6,1);
    protected static Pawn pawn7 = new Pawn(7,1);


    protected static Horse blackHorse1 = new Horse(1,0);
    protected static Horse blackHorse2 = new Horse(6,0);

    protected static Rook blackRook1 = new Rook(0,0);
    protected static Rook blackRook2 = new Rook(7,0);

    protected static Elephant blackElephant1 = new Elephant(2,0);
    protected static Elephant blackElephant2 = new Elephant(5,0);

    protected static Queen blackQueen = new Queen(3,0);


    protected static King whiteking = new King(4,7);
    protected static Queen whiteQueen = new Queen(3,7);
    protected static WhitePawn whitepawn0 = new WhitePawn(0,6);
    protected static WhitePawn whitepawn1 = new WhitePawn(1,6);
    protected static WhitePawn whitepawn2 = new WhitePawn(2,6);
    protected static WhitePawn whitepawn3 = new WhitePawn(3,6);
    protected static WhitePawn whitepawn4 = new WhitePawn(4,6);
    protected static WhitePawn whitepawn5 = new WhitePawn(5,6);
    protected static WhitePawn whitepawn6 = new WhitePawn(6,6);
    protected static WhitePawn whitepawn7 = new WhitePawn(7,6);


    protected static Horse whiteHorse1 = new Horse(1,7);
    protected static Horse whiteHorse2 = new Horse(6,7);

    protected static Rook whiteRook1 = new Rook(0,7);
    protected static Rook whiteRook2 = new Rook(7,7);

    protected static Elephant whiteElephant1 = new Elephant(2,7);
    protected static Elephant whiteElephant2 = new Elephant(5,7);

    protected LinkedList<LinkedList<Integer>> list= new LinkedList<>();

    public static King getKing() {
        return king;
    }

    public static King getWhiteking() {
        return whiteking;
    }

    protected static boolean whiteKingIsUnderAttack = false;
protected static boolean blackKingIsunderAttack = false;


    public static void setWhiteKingIsUnderAttack(boolean whiteKingIsUnderAttack) {
        Chess.whiteKingIsUnderAttack = whiteKingIsUnderAttack;
    }

    public static void setBlackKingIsunderAttack(boolean blackKingIsunderAttack) {
        Chess.blackKingIsunderAttack = blackKingIsunderAttack;
    }

    protected static boolean white = true;
protected static ChessPropreties gettingRightWhiteObject(int x, int y) {

    if (x == whitepawn0.getX() && y == whitepawn0.getY())
        return whitepawn0;
    if (x == whitepawn1.getX() && y == whitepawn1.getY())
        return whitepawn1;
    if (x == whitepawn2.getX() && y == whitepawn2.getY())
        return whitepawn2;
    if (x == whitepawn3.getX() && y == whitepawn2.getY())
        return whitepawn3;
    if (x == whitepawn3.getX() && y == whitepawn3.getY())
        return whitepawn3;
    if (x == whitepawn4.getX() && y == whitepawn4.getY())
        return whitepawn4;
    if (x == whitepawn5.getX() && y == whitepawn5.getY())
        return whitepawn5;
    if (x == whitepawn6.getX() && y == whitepawn6.getY())
        return whitepawn6;
    if (x == whitepawn7.getX() && y == whitepawn7.getY())
        return whitepawn7;
    if (x == whiteElephant1.getX() && y == whiteElephant1.getY())
        return whiteElephant1;
    if (x == whiteElephant2.getX() && y == whiteElephant2.getY())
        return whiteElephant2;
    if (x == whiteHorse2.getX() && y == whiteHorse2.getY())
        return whiteHorse2;
    if (x == whiteHorse1.getX() && y == whiteHorse1.getY())
        return whiteHorse1;
    if (x == whiteQueen.getX() && y == whiteQueen.getY())
        return whiteQueen;
    if (x == whiteRook1.getX() && y == whiteRook1.getY())
        return whiteRook1;
    if (x == whiteRook2.getX() && y == whiteRook2.getY())
        return whiteRook2;
    if (x == whiteking.getX() && y == whiteking.getY())
        return whiteking;
    return null;
}
public static ChessPropreties gettingRightBlackObject(int x, int y){

    if (x == pawn0.getX() && y == pawn0.getY())
        return pawn0;
    if (x == pawn1.getX() && y == pawn1.getY())
        return pawn1;
    if (x == pawn2.getX() && y == pawn2.getY())
        return pawn2;
    if (x == pawn3.getX() && y == pawn3.getY())
        return pawn3;
    if (x == pawn4.getX() && y == pawn4.getY())
        return pawn4;
    if (x == pawn5.getX() && y == pawn5.getY())
        return pawn5;
    if (x == pawn6.getX() && y == pawn6.getY())
        return pawn6;
    if (x == pawn7.getX() && y == pawn7.getY())
        return pawn7;
    if (x == blackRook2.getX() && y == blackRook2.getY())
        return blackRook2;
    if (x == blackRook1.getX() && y == blackRook1.getY())
        return blackRook1;
    if (x == blackQueen.getX() && y == blackQueen.getY())
        return blackQueen;
    if (x == blackElephant2.getX() && y == blackElephant2.getY())
        return blackElephant2;
    if (x == blackElephant1.getX() && y == blackElephant1.getY())
        return blackElephant1;
    if (x == blackHorse1.getX() && y == blackHorse1.getY())
        return blackHorse1;
    if (x == blackHorse2.getX() && y == blackHorse2.getY())
        return blackHorse2;
    if (x == king.getX() && y == king.getY())
        return king;
    return null;
}

    protected LinkedList<LinkedList<LinkedList<Integer>>> blackStrokes = new LinkedList<>();
    protected LinkedList<LinkedList<LinkedList<Integer>>> whiteStrokes = new LinkedList<>();
protected void updateWhiteStrokes(){
    if(!whiteStrokes.isEmpty()){
        whiteStrokes.clear();
    }
whiteStrokes.add(whitepawn0.checkForBorders(true));
    whiteStrokes.add(whitepawn1.checkForBorders(true));
    whiteStrokes.add(whitepawn2.checkForBorders(true));
    whiteStrokes.add(whitepawn3.checkForBorders(true));
    whiteStrokes.add(whitepawn4.checkForBorders(true));
    whiteStrokes.add(whitepawn5.checkForBorders(true));
    whiteStrokes.add(whitepawn6.checkForBorders(true));
    whiteStrokes.add(whitepawn7.checkForBorders(true));
    whiteStrokes.add(whiteking.checkForBorders(true));
    whiteStrokes.add(whiteQueen.checkForBorders(true));
    whiteStrokes.add(whiteHorse1.checkForBorders(true));
    whiteStrokes.add(whiteHorse2.checkForBorders(true));
    whiteStrokes.add(whiteElephant1.checkForBorders(true));
    whiteStrokes.add(whiteElephant2.checkForBorders(true));
    whiteStrokes.add(whiteRook1.checkForBorders(true));
    whiteStrokes.add(whiteRook2.checkForBorders(true));
}



protected void updateBlackStrokes(){
    blackStrokes.add(pawn0.checkForBorders(false));

    blackStrokes.add(pawn1.checkForBorders(false));

    blackStrokes.add(pawn2.checkForBorders(false));
    blackStrokes.add(pawn3.checkForBorders(false));
    blackStrokes.add(pawn4.checkForBorders(false));
    blackStrokes.add(pawn5.checkForBorders(false));
    blackStrokes.add(pawn6.checkForBorders(false));
    blackStrokes.add(pawn7.checkForBorders(false));
    blackStrokes.add(king.checkForBorders(false));
    blackStrokes.add(blackQueen.checkForBorders(false));
    blackStrokes.add(blackHorse1.checkForBorders(false));
    blackStrokes.add(blackHorse2.checkForBorders(false));
    blackStrokes.add(blackElephant1.checkForBorders(false));
    blackStrokes.add(blackElephant2.checkForBorders(false));
    blackStrokes.add(blackRook1.checkForBorders(false));
    blackStrokes.add(blackRook2.checkForBorders(false));
    }




}
