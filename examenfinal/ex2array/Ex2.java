package examenfinal.ex2array;

/**
 * Ex2
 */
public class Ex2 {

    public static void even_dont_exist(int[] a, int[] b) {
        int lengtha = a.length;
        int lengthb = b.length;
        int[] c = new int[lengtha];

        for (int i = 0; i <= lengtha - lengthb; i++) {
            int temp = i;
            for (int j = 0; j < lengthb; j++) {
                if (a[temp++] != b[j])
                    break;

                if (j == (lengtha - 1)) {
                    System.out.print("True\n");
                    return;
                }
            }
        }
        System.out.print("False\n");
    }

    public static void main(String[] args) {

        int[] one = { 1, 2, 3, 6, 7, 9, 2, 4, 1 };
        int[] second = { 6, 7, 9, 2, 4, 1, 3, 8 };
        System.out.println("\n[*] Exercise B: ");
        System.out.print("List all EVEN elements present in ONE but DONT EXIST in SECOND array ");

        Ex2.even_dont_exist(one, second);
    }
}