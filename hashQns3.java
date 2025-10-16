import java.util.HashMap;
public class hashQns3 {
    public static String getStart(HashMap<String, String> tick){

        HashMap<String , String> revMap= new HashMap<>();
        for(String key: tick.keySet()){
            revMap.put(tick.get(key),key);//reversing ticket map data:key-> val ,, val->key.
        }
        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bangaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi", "Goa");
        tickets.put("Bangaluru","Hyderabad");
        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start+" ->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
