package ht1;
import java.util.Scanner;
public class Ht1arexh {
    public static void main(String[] args) {
        int tries = 0;
        boolean matchTemplete = false;
        String temp = "";
       String updataTemplete="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your secret word:");
        String word =sc.nextLine();
        do {
            System.out.print("Enter your letter guess:");
            String guess = sc.nextLine();

            for(int i = 0; i < word.length(); i ++) {
                if (guess.equals(Character.toString(word.charAt(i)))) {
                    if(!matchTemplete)
                        temp += Character.toString(word.charAt(i));
                    else {
                        updataTemplete = Character.toString(temp.charAt(i)).replace("-", guess);
                        temp = temp.substring(0, i) + updataTemplete + temp.substring( i + 1, temp.length());
                    }
                } else {
                    if(!matchTemplete) {
                        temp += "-";
                    }
                }
            }
            tries++;
            matchTemplete = true;
            System.out.println(temp);
            if(temp.equals(word)) {
                System.out.println("You guessed correctly!");
                break;
            }
        }
        while (tries <7);{
            System.out.println("No more  tries");
        }

    }
    
}
