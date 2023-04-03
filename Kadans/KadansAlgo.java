package Kadans;
public class KadansAlgo {
    static int kadans(int a[]){
        int local_max=0;
        int   gloabal=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        local_max=Math.max(a[i],a[i]+local_max);
        gloabal=Math.max(local_max, gloabal);
    }
    return gloabal;
    }
public static void main(String[] args) {
    
}
}