public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double carsProdCapPerSpeed = 221 ;
        if(speed <= 4){
            return speed * carsProdCapPerSpeed;
        }else if(speed > 4 && speed <=8){
            carsProdCapPerSpeed = carsProdCapPerSpeed * 90/100;
            return speed * carsProdCapPerSpeed;
        }else if(speed==9){
            carsProdCapPerSpeed = carsProdCapPerSpeed * 80/100;
            return speed * carsProdCapPerSpeed;
        }else{
            carsProdCapPerSpeed = carsProdCapPerSpeed * 77/100;
            return speed * carsProdCapPerSpeed;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double totalCarsProducedPerHour = productionRatePerHour(speed);
        return (int)totalCarsProducedPerHour / 60;
    }
}
