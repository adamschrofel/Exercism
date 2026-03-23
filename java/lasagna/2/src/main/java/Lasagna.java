public class Lasagna {
    public static final int EXPECTED_MIN_IN_OVEN = 40;
    public static final int LAYER_PREP_TIME = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return EXPECTED_MIN_IN_OVEN;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven() - actualMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numLayers){
        return LAYER_PREP_TIME * numLayers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numLayers, int minutesInOven){
        return preparationTimeInMinutes(numLayers) + minutesInOven;
    }
}
