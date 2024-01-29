import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class TextProcessingApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a text: ");
        String sentence= sc.nextLine();
        
        while(true){
            System.out.println("1. Word count");
            System.out.println("2. Character count");
            System.out.println("3. Reverse text");
            System.out.println("4.Remove Duplicate");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice: ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1: int count=sentence.split("\\s+").length;
                System.out.println("number of words: "+count);
                    break;
         case 2: int characters=sentence.replaceAll("\\s+","").split("").length;
         System.out.println("Number of Character: " + characters);
         break;
                case 3:StringBuilder string= new StringBuilder(sentence);
                System.out.println(string.reverse());
                break;
                case 4: HashSet<String> res=new HashSet<>(Arrays.asList(sentence));
                    System.out.println(res);
            case 5: System.exit(0);
                default:System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
