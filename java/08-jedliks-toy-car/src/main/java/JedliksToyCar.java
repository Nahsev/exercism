public class JedliksToyCar {
    int baterry = 100;
    int meters = 0;
    
    public static JedliksToyCar buy() {
       return new JedliksToyCar();
    }

    public String distanceDisplay() {
       return "Driven " +  meters + " meters";
    }

    public String batteryDisplay() {
        if(baterry == 0){
            return "Battery empty";
        }
        return "Battery at " + baterry + "%";
    }

    public void drive() {
        if(baterry>0){
        meters+=20;
        baterry-=1;   
        }
    }
}
