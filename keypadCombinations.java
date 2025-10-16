public class keypadCombinations {

    public static String[] keypad ={".","abc","def","igh","jkl","mno","pqrs","tuv,wxyz"};
    public static void printCombinations(String str,String combinations,int idx){

        if (idx == str.length()) {

            System.out.println(combinations);
            return;
        }
        char curchar=str.charAt(idx);
        String map=keypad[curchar-'0'];

        for (int i=0;i<map.length();i++){
            printCombinations(str,combinations+map.charAt(i),idx+1);
        }
    }
    public static void main(String[] args){
        String str ="12";
        printCombinations(str,"",0);
    }
}

