
import java.util.*;

class ResistorColor {

    Map<Integer,String> resistor=new HashMap<>();


    int colorCode(String color) {
        int val=-1;
        setResistor();
        for(Map.Entry<Integer,String> e:resistor.entrySet()){
                String colour=e.getValue();
                if(colour.equalsIgnoreCase(color)) {
                    val=e.getKey();
                    break;
                }

        }
            return val;

    }

    String[] colors() {
    if(resistor.isEmpty()){
        setResistor();
    }
        String[] arr=new String[10];
        int i=0;
        for(Map.Entry<Integer,String > e:resistor.entrySet()){
            arr[i]=e.getValue();
            i++;
        }
        return arr;


    }

    public void setResistor(){
        resistor.put(0,"black");
        resistor.put(1,"brown");
        resistor.put(2,"red");
        resistor.put(3,"orange");
        resistor.put(4,"yellow");
        resistor.put(5,"green");
        resistor.put(6,"blue");
        resistor.put(7,"violet");
        resistor.put(8,"grey");
        resistor.put(9,"white");
    }
}
