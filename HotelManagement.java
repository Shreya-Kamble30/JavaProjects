import java.util.Scanner;
public class HotelManagement 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t**********HOTEL MANAGEMENT**********");
        int Srooms=0,Spizza=0,Sburger=0;
        int Total_rooms=0,Total_pizza=0,Total_burger=0;
        System.out.println("\tQuantity we have in Hotel:");
        System.out.println("\nRooms:");
        int Qrooms=sc.nextInt();
        System.out.println("\nPizza:");
        int Qpizza=sc.nextInt();
        System.out.println("\nBurger:");
        int Qburger=sc.nextInt();
        for(int i=0;i<=100;i++)
        {
            System.out.println("\n\t\tMENU");
            System.out.println("\t 1. Rooms");
            System.out.println("\t 2. Pizza");
            System.out.println("\t 3. Burger");
            System.out.println("\t 4. Information regarding sales and collection");
            System.out.println("\t 5. Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            if(choice==5)
            {
                break;
            }
            switch(choice)
            {
                case 1:
                    System.out.println("Enter No of rooms you want:");
                    int quant=sc.nextInt();
                    int QS=Qrooms-Srooms;
                    if(QS>=quant)
                    {
                        Srooms=Srooms+quant;
                        Total_rooms=Total_rooms+quant*1200;
                        System.out.println("\n\t\t"+quant+" Rooms have been allocated to you!");
                    }
                    else
                        System.out.println("\n\t\tOnly "+QS+" Rooms are available in Hotel!");
                        break;
                case 2:
                    System.out.println("Enter Pizza Quantity:");
                    int quant1=sc.nextInt();
                    int QS1=Qpizza-Spizza;
                    if(QS1>=quant1)
                    {
                        Spizza=Spizza+quant1;
                        Total_pizza=Total_pizza+quant1*99;
                        System.out.println("\n\t\t"+quant1+" Pizza served");
                    }
                    else
                        System.out.println("\n\t\tOnly "+QS1+" Pizzas are available in Hotel!");
                        break;
                case 3:
                    System.out.println("Enter Burger Quantity:");
                    int quant2=sc.nextInt();
                    int QS2=Qburger-Sburger;
                    if(QS2>=quant2)
                    {
                        Sburger=Sburger+quant2;
                        Total_burger=Total_burger+quant2*35;
                        System.out.println("\n\t\t"+quant2+" Burger served");
                    }
                    else
                        System.out.println("\n\t\tOnly "+QS2+" Burger are available in Hotel!");
                        break;
                case 4:
                    QS=Qrooms-Srooms;
                    System.out.println("\n\t\t Details of Sales and Collection");
                    System.out.println("\n No Of Rooms We have: "+Qrooms);
                    System.out.println("\n No Of Rooms We gave for Rant: "+Srooms);
                    System.out.println("\n Remaining Rooms: "+QS);
                    System.out.println("\n Total Rooms Collection of the day: "+Total_rooms);

                    QS1=Qpizza-Spizza;
                    System.out.println("\n No Of Pizzas We have: "+Qpizza);
                    System.out.println("\n No Of Pizzas we sold: "+Spizza);
                    System.out.println("\n Remaining Pizzas: "+QS1);
                    System.out.println("\n Total Pizza Collection of the day: "+Total_pizza);

                    QS2=Qburger-Sburger;
                    System.out.println("\n No Of Burger We have: "+Qburger);
                    System.out.println("\n No Of Burger we sold: "+Sburger);
                    System.out.println("\n Remaining Burger: "+QS2);
                    System.out.println("\n Total Burger Collection of the day: "+Total_burger);
                
                    int Total=Total_rooms+Total_burger+Total_pizza;
                    System.out.println("\n Total Collection of the Day: "+Total);
                    break;
                case 5:
                    System.out.println("\tThank You");
                    System.out.println("\tVisit Again");
                    break;
                default:
                    System.out.println("Please select from the menu above");
            }
        }
    }
}
