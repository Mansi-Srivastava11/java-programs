public class methodSumNaturalNo {
    static int sumRecursion(int n){
        if (n==1){
            return 1;
        }
            return n + sumRecursion(n-1);
    }

    public static void main(String[] args) {

        System.out.print(sumRecursion(5));

    }
}
