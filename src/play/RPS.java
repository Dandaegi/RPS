package play;

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        String[] play = {"가위", "바위" , "보"};
        Random rand = new Random();

        Scanner scanner = new Scanner(System. in);
        while (true) {
            System.out.print("어떤걸 내시겠습니까? : "); //가위
            String input = scanner.nextLine();

            if (input.equals("끝내기")) {
                System.out.println("종료");
                break;
            }


            int ramdomIndex = rand.nextInt(play.length);
            String ramdomPlays = play[ramdomIndex];


             if (input.equals(ramdomPlays)) {
                System.out.println(ramdomPlays);
                System.out.println("비겼습니다.");
            } else if (input.equals("가위") && ramdomPlays.equals("바위") || input.equals("바위") && ramdomPlays.equals("보") || input.equals("보") && ramdomPlays.equals("가위")) {
                System.out.println(ramdomPlays);
                System.out.println("졌습니다");
            } else if (input.equals("바위") && ramdomPlays.equals("가위") || input.equals("가위") && ramdomPlays.equals("보") || input.equals("보") && ramdomPlays.equals("바위")) {
                System.out.println(ramdomPlays);
                System.out.println("이겼습니다");
            }

        }









    }

}
