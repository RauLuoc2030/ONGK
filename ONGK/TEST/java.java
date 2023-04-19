package TEST;

import java.util.Random;

public class java {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(29) + 1;
        for (int i = 0; i < n; i++)
        {
            System.out.println(rand.nextInt(3) + 1);
        }
    }
}
