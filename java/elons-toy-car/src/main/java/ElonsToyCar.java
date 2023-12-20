public class ElonsToyCar {


    int meters=0;
    int percentage=100;
    public static ElonsToyCar buy() {

        return new ElonsToyCar();

    }

    public String distanceDisplay() {

        return "Driven "+meters+" meters";

    }

    public String batteryDisplay() {

        if(percentage>0)
        return "Battery at "+percentage+"%";
        else
            return "Battery empty";

    }

    public void drive() {
        if(percentage>0){
        meters+=20;
        percentage-=1;}
        else{
            System.out.println("Battery empty");
        }

    }
}
