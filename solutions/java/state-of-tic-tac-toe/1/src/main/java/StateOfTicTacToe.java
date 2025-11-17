import java.lang.IllegalArgumentException;

class StateOfTicTacToe {
    public GameState determineState(String[] board) {
        var full = board[0] + board[1] + board [2];
        full = full.replace(" ","");
        String diagonal1 = "" + board[0].charAt(0) + board[1].charAt(1) + board[2].charAt(2);
            String diagonal2 = "" + board[0].charAt(2) + board[1].charAt(1) + board[2].charAt(0);

        if(full.equals("XX")||full.equals("OO")){
            var message = "Wrong turn order: "+  full.charAt(0) +" went twice";
            throw new IllegalArgumentException(message);
        }
        if(full.length()==3&&full.replace("X","").length()==2){
            throw new IllegalArgumentException("Wrong turn order: O started");
        }
        for(int i=0;i<3;i++){
            String column = "" + board[0].charAt(i) + board[1].charAt(i) + board[2].charAt(i);
            if((board[0].equals("XXX") || board[1].equals("XXX")|| board[1].equals("XXX")) && (board[0].equals("OOO") || board[1].equals("OOO")|| board[1].equals("OOO")) ){
                throw new IllegalArgumentException("Impossible board: game should have ended after the game was won");
            }
            if(board[i].equals("XXX")||board[i].equals("OOO") || column.equals("XXX")||column.equals("OOO")){
                return GameState.WIN;
            }
            
        }
        if(diagonal1.equals("XXX") || diagonal1.equals("OOO") || diagonal2.equals("XXX") || diagonal2.equals("OOO")){
                return GameState.WIN;
        } else if(full.length() < 9){
            return GameState.ONGOING;
        } else {
            return GameState.DRAW;
        }
    }
}
