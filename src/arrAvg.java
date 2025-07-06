public class arrAvg {
    public static void main(String[] args) {
        float[] marks={98.0f,58.5f,23.5f,71.0f};
        int size = marks.length;
        float sum = 0;
        for(float elements : marks){
            sum = (sum + elements)/size;
            System.out.println(sum);
        }
    }
}
