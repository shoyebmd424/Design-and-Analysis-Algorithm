public class BoyerMooreMajority {
    static int mejority(int a[],int n){
        int con=a[0],vote=0;
        for(int i=1;i<n;i++){
            if(vote==0){
                vote=1;
                con=a[i];
            }else{
                if(con==a[i]){
                    vote++;
                }else{
                    vote--;
                }
            }
        }
        for(int i:a)
        {
            if(i==con){
                vote++;
            }
        }
        if(vote>=n/2){
            return con;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1, 1, 1, 1, 2, 3, 4 };
        System.out.println(mejority(a, a.length));
    }
}
