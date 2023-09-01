public class printPairs {
    public static void pairs(int[] numbers){
        int totalCount=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                totalCount++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is "+totalCount);
    }

    public static void main(String[] args) {
        int[] numbers={2,4,6,8,10};
        pairs(numbers);

    }
}
