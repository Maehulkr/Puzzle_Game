package Medium;

import java.util.Scanner;

public class MediumMain {
    public static void MediumStart() throws Exception {
        MediumLevel ml = new MediumLevel();
        Scanner scan = new Scanner(System.in);
        String dir, pos, pos1, pos2, pos3, pos4;
        int i=(int) (Math.random()*100);
        //System.out.println(i);
        if(i>=1 && i<=9){
            pos="0"+i;
        }
        else{
            pos=Integer.toString(i);
        }
        pos1=pos;
        pos2=pos;
        pos3=pos;
        pos4=pos;
        System.out.println("Hello Player!! \n" +
                "Welcome to Medium Level \n" +
                "You have only 6 directions of traversing as N, E, W, S, NE, SW" +
                "\nDo you want to start? (y/n)");
        String begin = scan.nextLine();
        if(begin.toUpperCase().compareTo("Y")==0){
            System.out.println(ml.getDescription(pos));
            while(pos.compareTo("Exit")!=0 && pos1.compareTo("Exit")!=0 && pos2.compareTo("Exit")!=0 && pos3.compareTo("Exit")!=0 && pos4.compareTo("Exit")!=0 ){
                System.out.println("Enter a valid direction");
                dir=scan.nextLine();
                dir=dir.toUpperCase();
                if(dir.compareTo("N")==0 || dir.compareTo("E")==0 || dir.compareTo("W")==0 || dir.compareTo("S")==0 ||
                        dir.compareTo("NE")==0 || dir.compareTo("SW")==0){
                    try{
                        if(pos.compareTo("Null")==0 && pos1.compareTo("Null")!=0){
                            pos1 = ml.getDirection(pos1,dir);
                            String s=ml.getDescription(pos1);
                            System.out.println(s);
                            pos=pos1;
                        }
                        else if(pos1.compareTo("Null")==0 && pos2.compareTo("Null")!=0){
                            pos2 = ml.getDirection(pos2,dir);
                            String s=ml.getDescription(pos2);
                            System.out.println(s);
                            pos=pos2;
                        }
                        else if(pos2.compareTo("Null")==0 && pos3.compareTo("Null")!=0){
                            pos3 = ml.getDirection(pos3,dir);
                            String s=ml.getDescription(pos3);
                            System.out.println(s);
                            pos=pos3;
                        }
                        else if(pos3.compareTo("Null")==0 && pos4.compareTo("Null")!=0){
                            pos4 = ml.getDirection(pos4,dir);
                            String s=ml.getDescription(pos4);
                            System.out.println(s);
                            pos=pos4;
                        }
                        else{
                            pos1=pos;
                            pos2=pos;
                            pos3=pos;
                            pos4=pos;
                            pos = ml.getDirection(pos,dir);
                            String s=ml.getDescription(pos);
                            System.out.println(s);
                        }
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                else
                    continue;
            }
            System.out.println("You found a way out of maze\n Game Over");
        }
    }
}

