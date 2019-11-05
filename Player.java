import java.util.Scanner ;



public class Player {
    
    Scanner kb; 
    String name ; 
    Score scoreKeeper ; 
    Dice pairOfDice ; 
    int turnNum ; 
    
    public Player () {
        kb= new Scanner (System.in) ; 
        this.name = kb.nextLine() ; 
        
        this.name = name ;
        scoreKeeper = new Score () ; 
        pairOfDice = new Dice () ; 
        turnNum = 1 ; 
        
    
}

public int getGameScore () { 
    return scoreKeeper.getGameScore() ;
}

public int getRoundScore () {
    return scoreKeeper.getRoundScore() ; 
}

public String getName () {
    return name ; 
}

public int getTurnNum () {
    return turnNum ;
}

public void adjustTurnNum() {
     turnNum++ ; 
}

public void setName(String input) { 
    name = input ;
}

public void updateGameScore () {
    scoreKeeper.adjustGameScore() ; 
}

public void setRoundScore(int num) {
    scoreKeeper.setRoundScore(num); 
}

public void updateRoundScore () {
    scoreKeeper.adjustRoundScore(pairOfDice.rollValue()) ;
}

public void printScore() {
    System.out.println("Round Score:\t" + scoreKeeper.getRoundScore()) ; 
    System.out.println("Game Score:\t" + scoreKeeper.getGameScore()) ; 
}

public boolean winGameCheck () {
    if (scoreKeeper.getGameScore () >= 100) {
        System.out.println(name + " has won the game with " + scoreKeeper.getGameScore() + " points") ; 
        //System.out.print(scoreKeeper.getGameScore() + "points!") ; 
        return true ; 
    }
    else {
        return false ;
    }

}

public void rollDice () {
   pairOfDice.rollDice() ; 
    
    
}

public int getD1Value () {
    return pairOfDice.getD1() ; 
    
    
    
}
public int getD2Value () {
    return pairOfDice.getD2() ; 
}
public boolean checkForSnakeEyes() {
    return pairOfDice.checkOnes(); 
}
public boolean checkForDoubles() {
    return pairOfDice.checkDouble(); 
}


}