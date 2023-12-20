class NeedForSpeed {

    int speed;
    int meters=0;
    int battery=100;
    int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {

        this.speed=speed;
        this.batteryDrain=batteryDrain;


    }

    public boolean batteryDrained() {
        if(battery>0)
            return false;
        else
            return true;
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        if(battery>0) {
            meters += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {


    int distance;

    RaceTrack(int distance) {

        this.distance = distance;

    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        boolean flag=false;

        double b= car.batteryDrain;
        double s=car.speed;

        double div=distance/s;
        double rem=div*b;

        if(car.battery-rem>=0)
            flag=true;
        return flag;
    }
}