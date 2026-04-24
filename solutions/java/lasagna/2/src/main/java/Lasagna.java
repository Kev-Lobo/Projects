public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
    }
    
    public int remainingMinutesInOven(int n){
        return n = expectedMinutesInOven() - n;
    }
    
    public int preparationTimeInMinutes(int layersAdded){
            int totalTimeTakenForLayers;
            return totalTimeTakenForLayers = layersAdded * 2;
    }
    
    public int totalTimeInMinutes(int i, int j){
        int n = preparationTimeInMinutes(i) + j;
        return n;
    }
}
