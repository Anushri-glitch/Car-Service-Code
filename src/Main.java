import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello I am Car service expert");
        System.out.println("Please Let me know about your car information to register your service!!");

        System.out.println("Enter your car name : ");
        String carName = sc.nextLine();

        System.out.println("Please select which type of service you want ...");

        //Display List of services In front of Customer
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1. Basic Servicing");
        arr.add("2. Engine Fixing");
        arr.add("3. Clutch Fixing");
        arr.add("4. Brake Fixing");
        arr.add("5. Gear Fixing");

        for (String str : arr) {
            System.out.println(str);
        }

        //Customer Service List by customer
        ArrayList<String> services = new ArrayList<>();

        System.out.println("Now Its time to know about your wanted services ...");
        System.out.println("Now Enter Your service names and");
        System.out.println("If You are done then type done after entering all the services : ");

        for (int i = 0; i < 6; i++) {

            String newService = sc.nextLine();
            if (newService.equalsIgnoreCase("done")) {
                break;
            }
            services.add(newService);

        }

        //Developer function
        if(carName.equalsIgnoreCase("Hatchback")){
            Hatchback back = new Hatchback();
            HashMap<String,Integer> map = new HashMap<>();
            map = back.hatchBackBill(services);

            //Get Total Bill
            int total = 0;
            for(Map.Entry<String,Integer> itr : map.entrySet()){
                total += itr.getValue();
            }
            //Name Of car and codes of services
            System.out.println("Type of car - "+carName);

            ArrayList<String> code = new ArrayList<>();
            code = back.sCodes(services);
            System.out.print("Service codes - ");
            for(String num : code){
                System.out.print(num+", ");
            }
            System.out.println();
            //Print Service names and costs
            for(Map.Entry<String,Integer> itr : map.entrySet()) {
                System.out.println("Charges for "+ itr.getKey()+" - "+itr.getValue());
            }
            System.out.println("Total Bill - "+"₹ "+total);
        }
        else if(carName.equalsIgnoreCase("Sedan")){
            Sedan sedan = new Sedan();
            HashMap<String,Integer> map = new HashMap<>();
            map = sedan.SedanBill(services);
            //Get Total Bill
            int total = 0;
            for(Map.Entry<String,Integer> itr : map.entrySet()){
                total += itr.getValue();
            }
            //Name Of car and codes of services
            System.out.println("Type of car - "+carName);

            ArrayList<String> code = new ArrayList<>();
            code = sedan.sCodes(services);
            System.out.print("Service codes - ");
            for(String num : code){
                System.out.print(num+", ");
            }
            System.out.println();
            //Print Service names and costs
            for(Map.Entry<String,Integer> itr : map.entrySet()) {
                System.out.println("Charges for "+" "+ itr.getKey()+" - "+itr.getValue());
            }
            System.out.println("Total Bill : "+"₹ "+total);
        }
        else if(carName.equalsIgnoreCase("SUV")){
            SUV suv = new SUV();
            HashMap<String,Integer> map = new HashMap<>();
            map = suv.SuvBill(services);
            //Get Total Bill
            int total = 0;
            for(Map.Entry<String,Integer> itr : map.entrySet()){
                total += itr.getValue();
            }
            //Name Of car and codes of services
            System.out.println("Type of car - "+carName);

            ArrayList<String> code = new ArrayList<>();
            code = suv.sCodes(services);
            System.out.print("Service codes - ");
            for(String num : code){
                System.out.print(num);
            }
            System.out.println();

            //Print Service names and costs
            for(Map.Entry<String,Integer> itr : map.entrySet()) {
                System.out.println("Charges for "+" "+ itr.getKey()+" - "+itr.getValue());
            }
            System.out.println("Total Bill - "+"₹ "+total);
        }

    }
}