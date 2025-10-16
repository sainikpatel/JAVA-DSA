import java.util.ArrayList;
public class subsetofNnumers {

    public static void printstring(ArrayList<Integer> subset){

        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i) +" ");
        }
        System.out.println();
    }

    public static void findsubset(int n,ArrayList<Integer>subset){
          if(n==0){
              printstring(subset);
              return;
}

        findsubset(n-1,subset);
        subset.add(n);

        findsubset(n-1,subset);
        subset.remove(subset.size()-1);

    }
    public static void main(String[] args){
        int n=3;
        findsubset(n,new ArrayList<Integer> ());
    }
}
