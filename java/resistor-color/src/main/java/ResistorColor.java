
import java.util.*;

class ResistorColor {

    Map<Integer,String> resistor=new HashMap<Integer,String>();







    int colorCode(String color) {
        int val=-1;
        resistor.put(0,"Black");
        resistor.put(1,"Brown");
        resistor.put(2,"Red");
        resistor.put(3,"Orange");
        resistor.put(4,"Yellow");
        resistor.put(5,"Green");
        resistor.put(6,"Blue");
        resistor.put(7,"Violet");
        resistor.put(8,"Grey");
        resistor.put(9,"White");
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
    if(resistor.size()==0){
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
        String[] arr=new String[10];
        int i=0;
        for(Map.Entry<Integer,String > e:resistor.entrySet()){
            arr[i]=e.getValue();
            i++;
        }
        return arr;


    }
}
