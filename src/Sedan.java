import java.util.ArrayList;
import java.util.HashMap;

public class Sedan {

    public Integer price(String str){
        if(str.equalsIgnoreCase("Basic servicing")){
            return 4000;
        }
        else if(str.equalsIgnoreCase("Engine Fixing")){
            return 8000;
        }
        else if(str.equalsIgnoreCase("Clutch Fixing")){
            return 4000;
        }
        else if(str.equalsIgnoreCase("Brake Fixing")){
            return 1500;
        }
        else if(str.equalsIgnoreCase("Gear Fixing")){
            return 6000;
        }
        return 0;
    }

    public HashMap<String,Integer> SedanBill(ArrayList<String> services) {

        HashMap<String, Integer> bill = new HashMap<>();

        for (String str : services) {
            if (str.equalsIgnoreCase("Basic Servicing")) {
                bill.put(str, price(str));
            } else if (str.equalsIgnoreCase("Engine Fixing")) {
                bill.put(str, price(str));
            } else if (str.equalsIgnoreCase("Clutch Fixing")) {
                bill.put(str, price(str));
            } else if (str.equalsIgnoreCase("Brake Fixing")) {
                bill.put(str, price(str));
            } else if (str.equalsIgnoreCase("Gear Fixing")) {
                bill.put(str, price(str));
            }
        }
        return bill;
    }
}
