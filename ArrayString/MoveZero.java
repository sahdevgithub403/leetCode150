import java.util.Arrays;

public class MoveZero {

    public static int[] moveZero(int[] num) {
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[index++] = num[i];
            }
        }

        while (index < num.length) {
            num[index] = 0;
            index++;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] num = { 0, 1, 0, 3, 12 };
        int[] res = moveZero(num);
        System.out.println("output : " + Arrays.toString(res));
    }
}
