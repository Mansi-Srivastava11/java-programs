public class methodMultipTable {
    static void multiply(int a){
        for (int i = 1; i <=10; i++) {
            System.out.format("%d * %d = %d",a,i ,a*i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        multiply(5);
    }
}
