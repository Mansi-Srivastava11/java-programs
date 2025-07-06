public class methodAvgArray {
    static void avgOfNo(int ...arr){
        int size = arr.length;
        float sum = 0;
        for(float fetch:arr){
            sum = sum + fetch;
        }
        float avg = sum/size;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        avgOfNo(28,11,29,5);
    }
}
