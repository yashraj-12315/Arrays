public class Stock {

    public static int Maxprofit(int [] a){
        int maxprofit=0;
        int minSoFar=a[0];
        for(int i=0;i<a.length;i++){
            minSoFar=Math.min(minSoFar,a[i]);
            int profit=a[i]-minSoFar;
            maxprofit=Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] a={3,1,4,8,7,2,5};
        System.out.println(Maxprofit(a));
        
    }
}
