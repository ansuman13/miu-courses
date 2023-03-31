import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver {


    public static void main(String args[]){
        ArrayList<Package> packets = new ArrayList<Package>();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of packages: ");
        int digit=scan.nextInt();
        for(int i=0;i<digit;i++){
            System.out.printf("Enter details for product no. %d \n", i+1);
            System.out.print("enter description: ");
            String desc = scan.next();
            System.out.print("enter weight(in pounds): ");
            Integer weight = scan.nextInt();
            System.out.print("enter zone: ");
            String zone = scan.next();
            Package p1 = new Package(desc, weight, zone);
            packets.add(p1);
        }

//        Package p1t = new Package("Books", 2, "IA");
//        Package p2t = new Package("Phone", 4, "MA");
//        Package p3t = new Package("Boots", 6, "NY");
//
//        packets.add(p1t);
//        packets.add(p2t);
//        packets.add(p3t);

        ArrayList<Provider> providersList = new ArrayList<Provider>();
        providersList.add(new FedExProvider("FedEx"));
        providersList.add(new UPSProvider("UPS"));
        providersList.add(new USMailProvider("USMail"));

        for(Package p: packets){
            double lowestCost = Integer.MAX_VALUE;
            String providerName = "";
            for(Provider pr: providersList){
                double cost = pr.calculateCost(p);
                    if(cost<lowestCost){
                        providerName = pr.getName();
                        lowestCost = cost;
                        }
                    }
            System.out.printf("%s: $%.2f : %s \n", p.getDescription(), lowestCost, providerName);
        }

        Sender s1 = new SeniorSender();
        Sender s2 = new StudentSender();

        //calculating lowest shipping cost with Senior Discount
        System.out.println("calculating lowest shipping cost with Senior Discount");
        for(Package p: packets){
            double lowestCost = Integer.MAX_VALUE;
            String providerName = "";
            for(Provider pr: providersList){
                double cost = pr.calculateCost(p,s1);
                if(cost<lowestCost){
                    providerName = pr.getName();
                    lowestCost = cost;
                }
            }
            System.out.printf("%s: $%.2f : %s \n", p.getDescription(), lowestCost, providerName);
        }

        //calculating lowest shipping cost with Senior Discount
        System.out.println("calculating lowest shipping cost with Student Discount");
        for(Package p: packets){
            double lowestCost = Integer.MAX_VALUE;
            String providerName = "";
            for(Provider pr: providersList){
                double cost = pr.calculateCost(p,s2);
                if(cost<lowestCost){
                    providerName = pr.getName();
                    lowestCost = cost;
                }
            }
            System.out.printf("%s: $%.2f : %s \n", p.getDescription(), lowestCost, providerName);
        }

    }




}
