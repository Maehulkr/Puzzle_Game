import Easy.EasyMain;
import Medium.MediumMain;
import Hard.HardMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Player and welcome to the puzzle game!!");
        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.println("4. Exit");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        do{
            switch(choice){
                case 1: EasyMain.EasyStart();
                        break;
                case 2: MediumMain.MediumStart();
                        break;
                case 3: HardMain.HardStart();
                        break;
            }
        }while(choice != 4);
    }
}