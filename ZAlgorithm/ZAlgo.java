package ZAlgorithm;

public class ZAlgo {
   public static int[] Zalgo(String s,int n){
        int z[]=new int[n];
        int l=0,r=0;
        for(int i=1;i<n;++i){
            if(i>r){
                l=r=i;
                while(r<n&&s.charAt(r-l)==s.charAt(r)){
                    r++;
                }
                z[i]=r-l;
                r--;
            }else{
                int j=i-l;
                if(z[j]<r-i+1){
                    z[i]=z[j];
                }else{
                    l=i;
                    while(r<n&&s.charAt(r-l)==s.charAt(r)){
                        r++;
                    }
                    z[i]=r-l;
                    r--;
                }
            }
        }
        return z;
    }
    public static void main(String[] args) {
        String p="abc";
        String s="abcdabcfabdabe";
        String str=p+"&"+s;
        int ans[]=Zalgo(str, str.length());
        for(int i=0;i<str.length();i++){
            if(ans[i]==p.length()){
                System.out.println(i-p.length()+" found");
            }
        }

    }
}
