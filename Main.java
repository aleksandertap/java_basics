import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("say something");
        String userInput;

        ArrayList<String> wordlist = new ArrayList<>();

        while(true){
            userInput = sc.nextLine();
            wordlist.add(userInput);
            if(userInput.equals("")){
                break;
            }
        }

        for (String word : wordlist){
            System.out.println(word);
        }
    }
}