public class sumofodd {

public static  int placetiles(int n,int m){
    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;
    }

    //vertically
    int vertically = placetiles(n-m,m);

    //horizontal
    int horizontally= placetiles(n-1,m);

    return vertically + horizontally;
}

public static void main(String[] args){
    int n=4;
    int m =2;
    int es = placetiles(n,m);
    System.out.println("total no. of ways are "+es);
}
}