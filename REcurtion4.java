public class REcurtion4 {

    public static void moveX(String str,int count,int idx,String newString){
        if (idx == str.length()) {


            for(int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char curchar=str.charAt(idx);
        if(curchar=='x'){
            count++;
            moveX(str,count,idx+1,newString);
        }else{

            newString +=curchar;
            moveX(str,count,idx+1,newString);
        }
    }
     public static void main(String[] args){
        String str="axxabxxbx";
        moveX(str,0,0,"");
    }
}
