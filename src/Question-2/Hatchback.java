import java.util.ArrayList;
import java.util.HashMap;

public class Hatchback {

    public ArrayList<String> sCodes(ArrayList<String> arr){
        ArrayList<String> newList = new ArrayList<>();

        for(String num : arr){
            if(num.equalsIgnoreCase("Basic servicing")){
                newList.add("BS01");
            }
            else if(num.equalsIgnoreCase("Engine Fixing")){
                newList.add("EF01");
            }
            else if(num.equalsIgnoreCase("Clutch Fixing")){
                newList.add("CF01");
            }
            else if(num.equalsIgnoreCase("Brake Fixing")){
                newList.add("BF01");
            }
            else if(num.equalsIgnoreCase("Gear Fixing")){
                newList.add("GF01");
            }
        }
        return newList;
    }
    public Integer price(String str){
        if(str.equalsIgnoreCase("Basic servicing")){
            return 2000;
        }
        else if(str.equalsIgnoreCase("Engine Fixing")){
            return 5000;
        }
        else if(str.equalsIgnoreCase("Clutch Fixing")){
            return 2000;
        }
        else if(str.equalsIgnoreCase("Brake Fixing")){
            return 1000;
        }
        else if(str.equalsIgnoreCase("Gear Fixing")){
            return 3000;
        }
        return 0;
    }

    public HashMap<String,Integer> hatchBackBill(ArrayList<String> services) {

        HashMap<String, Integer> bill = new HashMap<>();

        for (String str : services) {
            if (str.equalsIgnoreCase("Basic Servicing")) {
                bill.put(str, price(str));
            } else if (str.equalsIgnoreCase("Engine Fixing")) {
                bill.put(str, price(str));
            }
            else if(str.equalsIgnoreCase("Clutch Fixing")){
                bill.put(str,price(str));
            }
            else if(str.equalsIgnoreCase("Brake Fixing")){
                bill.put(str,price(str));
            }
            else if(str.equalsIgnoreCase("Gear Fixing")){
                bill.put(str,price(str));
            }
        }

        return bill;
    }
}
