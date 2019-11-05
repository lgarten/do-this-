public class Dice {
    Die d1 ; 
    Die d2 ;
    
    
    public Dice () {
        d1 = new Die(6) ; 
        d2 = new Die (6) ;
    }
    
    public void rollDice() {
        d1.roll() ; 
        d2.roll() ;
        
    }
    public int getD1() {
     return d1.getValue();
     
        
    }
    public int getD2() {
        return d2.getValue() ; 
    }
    
    public int rollValue() {
        return d1.getValue() + d2.getValue() ; 
    
        
    }

    public boolean checkDouble () {
        if (d1.getValue() == d2.getValue())  {
            return true ;
                       
            
            

        }
        else {
            return false ;
        }
      
    
}
 public boolean checkOnes() {
     if (d1.getValue () == 1 && d2.getValue () == 1) {
         return true ; 
         
        }
        else {
            return false ;
        }
    }
}





