public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    final int expectedTime=40;
    public int expectedMinutesInOven(){
        return expectedTime;
    }

    public int remainingMinutesInOven(int actualTime){
        return expectedTime-actualTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method
    
    public int preparationTimeInMinutes(int layers){
        
        int layerTime=2;
        return layers*layerTime;
        
    }
    

    // TODO: define the 'totalTimeInMinutes()' method
    
    public int totalTimeInMinutes(int layers,int spentTime){
        return preparationTimeInMinutes(layers)+spentTime;
    }
}
