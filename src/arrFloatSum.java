public class arrFloatSum {
    public static void main(String[] args) {
        float[] arr = {11.0f,20.5f,29.11f};
        float sum=0;
        for (float nums : arr){
            sum+=nums;
        }
        System.out.println(sum);
    }
}
