import java.net.*;

public class websiteIp{
    public static void main(String[] args){
        String website = "www.youtube.com";
        try{
            InetAddress.getByName(website);
            System.out.println("IP address of " + website + " is: " + InetAddress.getByName(website).getHostAddress());
        }
        catch(UnknownHostException e){

            System.out.println("Coundn't find the IP address of " + website);
            e.printStackTrace();
        }
    }
}