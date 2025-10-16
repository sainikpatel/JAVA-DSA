public class Main{
    public static void permutation(String str,String permutedcombo){

        if(str.length()==0){
            System.out.println(permutedcombo);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curchaar=str.charAt(i);

          String newstr = str.substring(0,i) + str.substring(i+1);
        permutation(newstr,permutedcombo+curchaar);
        }
    }
    public static void main(String[] args){
        String str="ABC";
        permutation(str,"");
    }

}