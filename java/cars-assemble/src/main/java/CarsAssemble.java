import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class CarsAssemble {



    public double productionRatePerHour(int speed) {
        double rate=0.0;

        if(speed>=1 && speed<=4)
            rate=100.0;
        else if ((speed>=5 && speed<=8))
            rate=90.0;
        else if(speed==9)
            rate=80.0;
        else if(speed==10)
            rate=77.0;

        double productionRate= (speed*221*rate)/100;
        String s=String.format("%.2f",productionRate);
        productionRate=Double.parseDouble(s);
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {

        double workingItems=productionRatePerHour(speed)/60;
        String s=String.format("%.2f",workingItems);
        workingItems=Double.parseDouble(s);
        return (int)workingItems;

    }
}
