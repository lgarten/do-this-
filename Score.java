public class Score {
    
    int roundScore ; 
    int gameScore ; 
    
    
    public Score () {
        roundScore = 0 ; 
        gameScore = 0 ; 
}

public int getRoundScore() {
    return roundScore ;
}

public int getGameScore() {
    return gameScore ; 
}

public void setRoundScore(int input) {
    roundScore = input ;
    
}

public void setGameScore (int input) {
    gameScore = input;
}

public void adjustGameScore() {
    gameScore = gameScore + roundScore ;
    roundScore = 0  ; 


}

public void adjustRoundScore (int input)  {
    roundScore = roundScore + input ;

}


}