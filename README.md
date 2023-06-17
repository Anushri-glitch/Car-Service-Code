# Car-Service-Code
This is Oops Assignment ...

### :arrow_right: Classes In Project
#### Main.java
```java
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
        ........
    }
}
```

#### HatchBack.java
```java
public class Hatchback {

    public ArrayList<String> sCodes(ArrayList<String> arr){
        ArrayList<String> newList = new ArrayList<>();

        for(String num : arr){
            ........
        }
        return newList;
    }
}
```

#### Sedan.java
```java
public class Sedan {

    public ArrayList<String> sCodes(ArrayList<String> arr){
        ArrayList<String> newList = new ArrayList<>();

        for(String num : arr){
            ........
        }
        return newList;
    }
}
```

#### SUV.java
```java
public class SUV {

    public ArrayList<String> sCodes(ArrayList<String> arr){
        ArrayList<String> newList = new ArrayList<>();

        for(String num : arr){
            ........
        }
        return newList;
    }
}
```

### :arrow_right: Functions In Project
     1. ArrayList<String> sCodes(ArrayList<String> arr)
     2. Integer price(String str)
     3. HashMap<String,Integer> hatchBackBill(ArrayList<String> services)
     
### :arrow_right: Output Of Project
This is How It Works - I Have cropped output video from clideo.com.

https://github.com/Anushri-glitch/Car-Service-Code/assets/47708011/79ec1fb7-0ed3-4c2c-af87-a4b4130e6676

![Screenshot (863)](https://github.com/Anushri-glitch/Car-Service-Code/assets/47708011/06a9796e-4be7-45de-aaf7-ab36cc71533b)


