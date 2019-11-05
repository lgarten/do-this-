    import java.util.Random ; 
    
    
    
    public class Die {
        Random rand ; 
        //rand paul 2024
        int numSides ; 
        int value ; 
public Die (int num) { 
     rand = new Random () ; 
     numSides = num ;
     value = rand.nextInt(numSides)+1; 
    }
    
    public void roll () {
        value= rand.nextInt(numSides) + 1; 
}

public int getValue (){
    return value ; 
}
}
