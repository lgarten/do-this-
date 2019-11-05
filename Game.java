import java.util.Scanner  ;

public class Game {
    Player p1; 
    Player p2; 
    Player currentPlayer ;
    Scanner kb ; 

    public Game() {
        System.out.println("Player 1 type your name") ;
        p1 = new Player () ; 
        System.out.println("Player 2 type your name") ;
        p2 = new Player () ; 
        currentPlayer = p1 ; 
        kb = new Scanner (System.in) ; 
        
        
        //System.out.println(currentPlayer.getName() +" it's your turn") ; 
        //System.out.println(currentPlayer.testRoll()) ; 
        
        
        
    }
    public static void main (String [] agrs) {
        //create a game object
        Game pigDice = new Game() ; 
        pigDice.start() ; 

        
        
        
            
    }
    
    public void start() {
        while (true) {
            System.out.println(currentPlayer.getName() + " it's your turn") ;
            //System.out.println(currentPlayer.testRoll());
            currentPlayer.rollDice(); 
            //currentPlayer.updateRoundScore() ; 
            //System.out.println("Your Round Score is " +currentPlayer.getRoundScore()) ;
            
            //currentPlayer.updateGameScore() ; 
            
            //System.out.println("Your Total Game score is " +currentPlayer.getGameScore()) ; 
            
            //currentPlayer.printScore() ; 
            //currentPlayer.winGameCheck () ;
            
            
            if(currentPlayer.checkForSnakeEyes()) {
                System.out.print ("Snake Eyes!") ; 
                //game goes to 0
                //round goes to 0
                changePlayer (); 
            }
            
            else if (currentPlayer.checkForDoubles()){
                //roundScore = 0 ;
                currentPlayer.setRoundScore(0) ;
                System.out.println("Doubles") ; 
                
                changePlayer (); 
            }
            else{
                //roll value and add it to round score 
                currentPlayer.updateRoundScore() ; 
                System.out.println("Your Round Score is " +currentPlayer.getRoundScore()) ;
                System.out.println("Your Total Game score is " +currentPlayer.getGameScore()) ; 
                System.out.println("You rolled a " + currentPlayer.getD1Value()) ;
                System.out.println("You rolled a " + currentPlayer.getD2Value()) ;
                rollAgain() ;
                
            }
            
            
            
            //if (currentPlayer.winGameCheck() == true) {
                //break ;
                
            //}
            
        }
        
    }
   
    public void changePlayer () {
        if (currentPlayer.equals(p1)) {
            currentPlayer = p2 ;
        }
        else {
            currentPlayer = p1 ;
        }
        
    }
    public boolean rollAgain () {
        System.out.println("Would you like to role again? \"Y\" (Continue) or \"N\" (Bank Your Points") ; 
        //System.out.println("If you select Y, you choose to continue"); 
        //System.out.println("If you select N, you choose to bank your points") ;
        String answer = kb.nextLine().toUpperCase() ; 
        if (answer.equals("Y")) {
            //APPLY BELOW CONCEPT TO GAMESCOER
            //currentPlayer.updateRoundScore() ; 
            return true ; 
            
        }
        else {
            currentPlayer.updateGameScore() ; 
            changePlayer() ;
            
            return true ; 
            
            
            
        }
    }
}