public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int n){
        return n = 40 - n;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layersAdded){
            int totalTimeTakenForLayers;
            return totalTimeTakenForLayers = layersAdded * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int i, int j){
        int n = preparationTimeInMinutes(i) + j;
        return n;
    }
}
