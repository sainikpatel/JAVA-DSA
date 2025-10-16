public class recursion3 {

   public static boolean[] map =new boolean[25];

 public static void removeduplicate(String str,String Newstring,int idx) {

     if (idx == str.length()) {
         System.out.println(Newstring);
         return;
     }
     char curchar = str.charAt(idx);
     if (map[curchar - 'a'] == true) {
         removeduplicate(str, Newstring, idx + 1);
     } else {
         Newstring += curchar;
      map[curchar - 'a']=true;
      removeduplicate(str,Newstring,idx + 1);

     }

 }
 public static void main(String[] args){
     String str ="abcaac";
     removeduplicate(str,"",0);
 }
}