import java.util.Scanner;

public class CrazyStation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue trainA  = new Queue();
        Queue trainB  = new Queue();
        Queue attempt = new Queue();
        Stack station = new Stack();
        boolean canConfig = false;

        int option;
        option = Menu(input);
        while (option != 0) {
            System.out.print("Enter the order of the original in trainA: ");
            for (int i = 0; i < option; i++) {
                trainA.push(input.nextInt());
            }
            System.out.print("Enter the order of reconfiguration in trainB: ");
            for (int i = 0; i < option; i++) {
                trainB.push(input.nextInt());
            }
            try {
                canConfig = CheckConfiguration(trainA,trainB,attempt,station);
            } catch (Exception e) {
                if (e != null) {
                    System.out.println("Dude... you caught a big exception: " +e.getMessage());
                }
            }
            if (canConfig) {
               //success case
            } else {
                //fail case
            }
        }

    }

    public static boolean CheckConfiguration(Queue a, Queue b, Queue attempt, Stack s) {
        Node tempB = b.peekFirst();      //first value to put into the B queue
            Node tempA = a.peekFirst();
            while (tempA != null) {
                if (tempA.getValue() == tempB.getValue()) {
                    s.Push(tempA.getValue());
                    attempt.push(s.pop().getValue());
                    tempB = tempB.getNext();
                } else if (s.peekFirst().getValue() == tempB.getValue()) {
                    attempt.push(s.pop().getValue());
                    tempB = tempB.getNext();
                } else {
                    s.Push(tempA.getValue());
                }
                tempA = tempA.getNext();
                if (tempB == null) {
                    break;
                }
            }
            return b.compareTo(attempt);
    }

    public static int Menu(Scanner input) {
        System.out.println("Welcome to the Crazy Train!");
        System.out.print("How many cars in your train (Enter 0 to quit): ");
        return input.nextInt();
    }

    public static int Verify(Scanner input) {
        int returner = 0;
        boolean verified = true;
        do {
            verified = true;
                    if (input.hasNext()) {
                        if (input.hasNextInt()) {
                            returner = input.nextInt();
                            if (returner < 0) {
                                System.out.println("Please enter a positive value! \n:");
                                verified = false;
                            }
                        }
                    } else {
                        verified = false;
                    }
        } while(!verified);
        return returner;
    }

    public void ConfigStats(Queue a, Queue b, Queue attempt) {

    }
}
