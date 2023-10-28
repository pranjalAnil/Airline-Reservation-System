import java.util.Scanner;

class luggage extends FlightAvailable {
    public int ExtraLuggage() {
        a = 1000;
        System.out.print(a);
        return a;
    }
}

class Nations  extends FlightAvailable{
    public int National() {
        a = 8000;
        System.out.print(a);
        return a;

    }
    public int International() {
        a= 25000;
        System.out.print(a);
        return a;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightAvailable Flight = new FlightAvailable();
        SeatsAvailable Seats = new SeatsAvailable();
        luggage Luggage = new luggage();
        Nations nations = new Nations();
        FoodMenu menu =new FoodMenu();

        //input from user
        System.out.println("========================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\tDETAILS");
        System.out.println("========================================================================================================");

        System.out.print("\nFirst name: ");
        String fName=sc.next();
        System.out.print("Middle name: ");
        String mName=sc.next();
        System.out.print("Last name: ");
        String lName=sc.next();
        System.out.print("Enter your email: ");
        String mail=sc.next();
        System.out.print("Enter Mobile number: ");
        long mobNo=sc.nextLong();
        System.out.print("Enter passport number: " );
        long passNo=sc.nextLong();

        //Flight type
        System.out.println("\nEnter Your Flight type");
        System.out.println("1: National Flight\n2: International");
        int flightType = sc.nextByte();
        String s = null;
        int a = 0;
        switch(flightType){
            case 1:
                System.out.print("Charge on national flight is: Rs ");
                a= nations.National();
                s= "National Flight";
                break;
            case 2:
                System.out.print("Charge on international flight is: Rs ");
                a= nations.International();
                s="International Flight";
                break;
            default:
                System.out.println("Please Enter the Valid number");

        }
        //seat type
        System.out.println("\n\nChoose the number of your seat type");
        System.out.println("1 Economy Class Seats\n2 Premium Economy Class Seats\n3 Business Class Seats\n4 First-Class Seats");
        int seatClass = sc.nextInt();
        String s1 = null;
        int b=0;
        switch (seatClass){
            case 1:
                System.out.print("Charge on economy class seat is: Rs ");
                b=  Seats.EconomyClass();
                s1 = "Economy Class";
                break;
            case 2:
                System.out.print("Charge on premium class seat is: Rs ");
                b=  Seats.PremiumEconomy();
                s1= "Premium class";
                break;
            case 3:
                System.out.print("Charge on business class seat is: Rs ");
                b=  Seats.BusinessClass();
                s1 = "Business Class";
                break;
            case 4:
                System.out.print("Charge on first class seat is: Rs ");
                b=  Seats.FirsClass();
                s1 = "First Class";
                break;
            default:
                System.out.println("Enter the valid number");
                break;

        }
        System.out.println("\n\nEnter your luggage weight");
        int wt =sc.nextInt();
        int c=0;
        String s2 = null;
        if(wt>20){
            System.out.println("Your luggage is over weight you have to pay the extra charge on it ");
            System.out.println("if you don't wont to pay charge on it  ");
            System.out.println("You have to make it under 20kg");
            System.out.println("I  f you wont make it less type y otherwise type n ");
            s2= "Luggage charge";
            String e= sc.next();
            if(e.equalsIgnoreCase("y")){
                System.out.println("\nNo need to pay the charge");
                s2= "Luggage charge";
                c=0;
            }else if(e.equalsIgnoreCase("n")) {
                System.out.print("You have to pay the extra charge:  Rs ");
                c = Luggage.ExtraLuggage();
                s2= "Luggage charge";

            }

        }else {
            System.out.println("Your luggage is under weight no need to pay the extra charge");
            s2="Luggage Charge";
            c=0;
        }
        System.out.println("\nDo you wont to order a food if yes type y else type n");
        String food = sc.next();
        String s3="Food";
        int n=0;
        int f=0;
        if(food.equalsIgnoreCase("y")) {
            System.out.println("\nHow many food items you wont to order");

            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                s3 = "food";
                System.out.println("Enter Your Choice");
                System.out.println("1:Sandwich \n2:Burger\n3:Pizza\n4:Soup\n5:Maggi");
                sc.next();
            }
            int f1= menu.food();
            f=f1*n;
            System.out.print("prize of this food is: Rs "+f);

        }else if(food.equalsIgnoreCase("n")){
            s3="Food";
        }

        System.out.println("\n\nDo you wont to order a water ");
        System.out.println("if yes type y otherwise type n");
        String s4 = null;
        int d =0;
        String water= sc.next();
        if (water.equalsIgnoreCase("y")){
            s4="water";
            System.out.print("Charge on water is: Rs ");
            d=  menu.water();
        }else if(water.equalsIgnoreCase("n")){
            s4="water";
            d=0;
        }
        System.out.println("\n\nDo you wont order a tea ");
        System.out.println("If yes type y otherwise type n");
        String s5 =null;
        int e=0;
        String tea=sc.next();
        if (tea.equalsIgnoreCase("y")){
            s5="tea";
            System.out.print("Charge on tea is: Rs ");
            e=  menu.tea();
        }else if(tea.equalsIgnoreCase("n")) {
            s5="Tea";
        }


        System.out.println("\n\n\n=================================----------AIRPORT BILL----------=================================\n");

        System.out.println("Name   :   "+fName+"  "+mName+"   "+lName);
        System.out.println("e-mail :   "+mail);
        System.out.println("mob.no :   "+mobNo);
        System.out.println("Pass.no:  "+passNo);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t-------------___BILL___-------------\t\t\t\t\t\t");
        System.out.println("--------------------------------------------------------------------------------------------------------");

        System.out.println(s +"  =>  "+a);
        System.out.println(s1+"  =>  "+b);
        System.out.println(s2+"  =>  "+c);
        System.out.println(s3+"  =>  "+f);
        System.out.println(s4+"  =>  "+d);
        System.out.println(s5+"  =>  "+e);
        System.out.println("========================================================================================================");
        int total=a+b+c+f+d+e;
        System.out.println("Total"+"  ->   "+total);
        System.out.println("========================================================================================================");
        System.out.println("Thank You!!!!!!!!!!!!!");

    }
}
