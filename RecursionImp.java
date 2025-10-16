public class RecursionImp {

    public static void subsequence(int idx,String str,String newString){

        if(idx == str.length()){
            System.out.println(newString);
        return;
        }
        char curchar=str.charAt(idx);

        subsequence(idx+1,str,newString+curchar);

        subsequence(idx+1,str,newString);
    }
    public static void main(String[] args){
        String str="abcd";
        subsequence(0,str,"");
    }
}
