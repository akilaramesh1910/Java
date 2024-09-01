public class Problem17 {
    public static void main(String[] args) {
        int limit = 10;
        int sum = 0;

        int i = 1;

        for(; i<= limit ;){
            sum += i++;
        }

        System.out.println(sum);
    }
}
