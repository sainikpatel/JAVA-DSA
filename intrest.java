import java.util.*;
public class intrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        while(n<10){
               
                int p = sc.nextInt();
                int r = sc.nextInt();
                int t = sc.nextInt();
                System.out.print("Choose an option:\n1. Simple Interest\n2. Compound Interest\n");
            
                
                int opt = sc.nextInt();

                switch(opt){
                    case 1:
                    int a =  (p * r * t) / 100;
                        System.out.println("Simple Interest: "+a);
                        break;
                    case 2:
                        System.out.println("Compound Interest: " + (p * Math.pow((1 + r / 100.0), t) - p));
                        break;
                        case 3:
                        System.out.println("sainik");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                n++;
        }
      
    }
    
    }

