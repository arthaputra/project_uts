package LearnGradle1.app;

public class perulanganFor {
    public static void main(String args[]) {
        int i = 1;
        while(i <= 3) {
            int j = 1;
            while(j <= 10) {
                System.out.println(i + "x" + j + "=" + i*j);
                j++;
            }
            i++;
        }
    }
}




