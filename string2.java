public class string2 {
    public static void main(String args[]){
       StringBuilder sb = new StringBuilder("sainik");
      //  System.out.println(sb.charAt(1));
        // char set
        //set a new char in a string
    //  sb.setCharAt(0,'k');
      //  System.out.println(sb);
        //sb.insert(0,'s');
        //System.out.println(sb);

      //  sb.delete(3,6);
        //System.out.println(sb);

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;


            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);


            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }


        System.out.println(sb);

    }
    
}
