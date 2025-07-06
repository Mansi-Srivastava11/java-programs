public class arrIntIsInArray {
    public static void main(String[] args) {
        int[] arr = {11,44,22,31,61,29};
        int a = 11;
        for (int num : arr){
            if (a==num){
                System.out.print("Present");
            }
        }
    }
}
