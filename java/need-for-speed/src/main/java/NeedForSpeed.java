class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    int batery = 100;
    int distance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        
    }

    public boolean batteryDrained() {
       
return batery< batteryDrain;

    }

    public int distanceDriven() {
        return distance;
       
    }

    public void drive() {
      if (!batteryDrained()){
        distance += speed;
        batery -= batteryDrain;
      }
    }

    public static NeedForSpeed nitro() {
       return new NeedForSpeed(50, 4);

    }
    public int capacity(){
        return (batery/batteryDrain)*speed;
    }

}


class RaceTrack {
    private int distance;
    
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.capacity()>=distance;
    }
}
