import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What are Java loops?",
            "2. What is enhanced for-loop?",
            "3. How do you handle multiple user inputs?",
            "4. How is a switch-case different from if-else?",
            "5. What are collections in Java?",
            "6. What is ArrayList?",
            "7. How to iterate using iterators?",
            "8. What is a Map?",
            "9. How to sort a list?",
            "10. How to shuffle elements?"
        };

        String[][] options = {
            {"Control statements", "Data types", "Classes", "Interfaces"},
            {"While loop", "For-each loop", "Do-while", "Infinite loop"},
            {"Scanner & Loops", "Switch-case only", "Collections only", "Break statements"},
            {"Checks multiple values", "Checks ranges", "No difference", "None"},
            {"Group of objects", "Data type", "Loop", "Condition"},
            {"Dynamic array", "Fixed array", "HashMap", "Set"},
            {"iterator()", "next()", "hasNext()", "All of the above"},
            {"Key-Value pair", "Only keys", "Only values", "List"},
            {"Collections.sort()", "List.sort()", "Both A & B", "None"},
            {"Collections.shuffle()", "Random class", "Arrays.shuffle()", "None"}
        };

        int[] answers = {1, 2, 1, 1, 1, 1, 4, 1, 3, 1}; // correct options

        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }
            System.out.print("Enter your choice: ");
            int ans = sc.nextInt();
            if (ans == answers[i]) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.length);
        sc.close();
    }
}
