public class methodPatternTwo {
    static void pattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i-1; j < n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
