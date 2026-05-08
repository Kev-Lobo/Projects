public class JedliksToyCar {
    private int distance = 0;
    private int battery = 100;
    public static JedliksToyCar buy() {
        System.out.println("My Car");
        return new JedliksToyCar(); 
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if (this.battery <= 0) {
            return "Battery empty";
        }
        return "Battery at " + this.battery + "%";
    }

    public void drive() {
        int numOfDrives=0;
        if(battery > 0){
            this.battery -= 1;
            numOfDrives = 100 - this.battery;
            this.distance = numOfDrives * 20;
        }
    }
}
