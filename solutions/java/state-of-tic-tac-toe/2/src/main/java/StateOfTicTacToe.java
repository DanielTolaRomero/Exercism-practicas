import java.util.List;
import java.util.ArrayList;

class StateOfTicTacToe {
    public GameState determineState(String[] board) {
        var full = board[0] + board[1] + board[2];
        full = full.replace(" ","");
        List<String> lineas = new ArrayList<>();
        boolean xwin = false, owin = false;
        lineas.add("" + board[0].charAt(0) + board[1].charAt(1) + board[2].charAt(2));
        lineas.add("" + board[0].charAt(2) + board[1].charAt(1) + board[2].charAt(0));
        for(int i=0;i<3;i++){
            lineas.add(board[i]);
            lineas.add(""+ board[0].charAt(i) + board[1].charAt(i) + board[2].charAt(i));
        }
        for(String l:lineas){
            xwin = xwin||l.equals("XXX");
            owin = owin||l.equals("OOO");
        }
        if(full.equals("XX")||full.equals("OO")){
            var message = "Wrong turn order: "+  full.charAt(0) +" went twice";
            throw new IllegalArgumentException(message);
        }
        if(full.length()==3&&full.replace("X","").length()==2){
            throw new IllegalArgumentException("Wrong turn order: O started");
        }
        if(xwin && owin){
            throw new IllegalArgumentException("Impossible board: game should have ended after the game was won");
        }
        if(xwin || owin){
            return GameState.WIN;
        }
        if(full.length() >= 9){
            return GameState.DRAW;
        } else {
            return GameState.ONGOING;
        }
    }
}
