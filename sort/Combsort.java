package sort;

public class Combsort {
    // improve bubble sort
    static void comb(int a[],int n){
        int gap=n;
    gap =(int) (gap/1.3);
    while(gap>=1){
        for(int i=0;i<n;i++){
            if((i+gap)<n&&a[i]>a[i+gap]){
                int temp=a[i];
                a[i]=a[i+gap];
                a[i+gap]=temp;
            }
        }
        gap=(int) (gap/1.3);
    }

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        comb(a, a.length);
        for(int i:a)
        System.out.print(i+" ");
    }
}
