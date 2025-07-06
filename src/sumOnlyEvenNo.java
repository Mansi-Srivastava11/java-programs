
public class sumOnlyEvenNo {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,8,4,6};
        int sum=0;
        int i=0;
        while (i<arr.length){
            if(arr[i]%2==0){
                System.out.print("Sum of "+sum);
                sum += arr[i];
                System.out.print(" + "+arr[i]+" = "+sum+"\n");
            }
            i++;
        }
    }
}
