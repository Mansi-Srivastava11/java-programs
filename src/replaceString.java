public class replaceString {
    public static void main(String args[]){
        String letter = " \" Dear <!name!> , Trans a b t \"";
        System.out.println(letter);
        System.out.print(letter.replace("<!name!>","Shraddha"));
    }
}
