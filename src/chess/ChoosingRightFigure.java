package chess;



import javax.swing.Icon;


public class ChoosingRightFigure {

    public static String chooseFigure(Icon icon){
String s = icon.toString();
final String k = "src\\Images\\";
        switch (s){
            case k+"moderator_male-96.png":return "BlackKing";
            case k+"Pawn-icon0.png": return "BlackPawn0";
            case k+"Pawn-icon1.png": return "BlackPawn1";
            case k+"Pawn-icon2.png": return "BlackPawn2";
            case k+"Pawn-icon3.png": return "BlackPawn3";
            case k+"Pawn-icon4.png": return "BlackPawn4";
            case k+"Pawn-icon5.png": return "BlackPawn5";
            case k+"Pawn-icon6.png": return "BlackPawn6";
            case k+"Pawn-icon7.png": return "BlackPawn7";
            case k+"Horse1.png": return "BlackHorse1";
            case k+"Horse2.png": return "BlackHorse2";
            case k+"rook1.png": return "BlackRook1";
            case k+"rook2.png": return "BlackRook2";
            case k+"elephant1.png": return "BlackElephant1";
            case k+"elephant2.png": return "BlackElephant2";


default:return null;
        }

    }













}
