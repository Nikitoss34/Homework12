import java.util.Arrays;
import java.util.Random;

public class HW12 {
    public static void main(String[] args) {
        int[] winTicket = initializeTicket(7);
        int[] playerTicket = initializeTicket(7);
        Arrays.sort(winTicket);
        Arrays.sort(playerTicket);
        System.out.println(Arrays.toString(winTicket));
        System.out.println(Arrays.toString(playerTicket));
        int count = 0;
        for (int i = 0; i < winTicket.length; i++) {
            if (winTicket[i] == playerTicket[i]) {
                count++;
            }
        }
        System.out.println("Matches =" + count);
    }

    public static int[] initializeTicket(int lengthTicket) {
        Random random = new Random();
        int[] ticket = new int[lengthTicket];
        for (int i = 0; i < lengthTicket; i++) {
            ticket[i] = random.nextInt(10);
        }
        return ticket;
    }
}