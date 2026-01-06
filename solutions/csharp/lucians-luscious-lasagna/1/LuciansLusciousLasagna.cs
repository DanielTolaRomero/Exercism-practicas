class Lasagna
{
    int timeInOven = 40;
    // TODO: define the 'ExpectedMinutesInOven()' method
    public int ExpectedMinutesInOven() => timeInOven;
    // TODO: define the 'RemainingMinutesInOven()' method
    public int RemainingMinutesInOven(int timeCurren) => timeInOven - timeCurren;
    // TODO: define the 'PreparationTimeInMinutes()' method
    public int PreparationTimeInMinutes(int layer) => 2* layer;
    // TODO: define the 'ElapsedTimeInMinutes()' method
    public int ElapsedTimeInMinutes(int layer, int timeCurren) => PreparationTimeInMinutes(layer) + timeCurren;
}
