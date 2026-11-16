
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message;

        System.out.println("Chatbot: Hello! Welcome to Java Chatbot.");
        System.out.println("Chatbot: Ask me anything. Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            message = sc.nextLine().toLowerCase();

            if (message.contains("hi") ||
                message.contains("hello")) {

                System.out.println("Chatbot: Hello! How are you?");
            }

            else if (message.contains("your name")) {

                System.out.println("Chatbot: I am Java Chatbot.");
            }

            else if (message.contains("java")) {

                System.out.println("Chatbot: Java is a programming language.");
            }

            else if (message.contains("how are you")) {

                System.out.println("Chatbot: I am fine. Thank you!");
            }

            else if (message.contains("thank")) {

                System.out.println("Chatbot: You are welcome!");
            }

            else if (message.contains("bye")) {

                System.out.println("Chatbot: Goodbye! Have a nice day.");
                break;
            }

            else {

                System.out.println("Chatbot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}
