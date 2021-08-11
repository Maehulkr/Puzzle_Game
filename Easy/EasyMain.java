package Easy;

import java.util.Scanner;

public class EasyMain {
    public static void EasyStart() throws Exception {
	    EasyLevel el = new EasyLevel();
	    Scanner scan = new Scanner(System.in);
	    int i=(int) (Math.random()*100);
		String dir, pos, pos1, pos2;
	    //System.out.println(i);
	    if(i>=1 && i<=9){
	    	pos="0"+i;
		}
	    else{
	    	pos=Integer.toString(i);
		}
	    pos1=pos;
	    pos2=pos;
	    System.out.println("Hello Player!! \n" +
				"Welcome to Easy Mode \n" +
				"You have only 4 directions of traversing as N, E, W, S" +
				"\nDo you want to start? (y/n)");
	    String begin = scan.nextLine();
	    if(begin.toUpperCase().compareTo("Y")==0){
			System.out.println(el.getDescription(pos));
			while(pos.compareTo("Exit")!=0 && pos1.compareTo("Exit")!=0){
				System.out.println("Enter a valid direction");
				dir=scan.nextLine();
				dir=dir.toUpperCase();
				if(dir.compareTo("N")==0 || dir.compareTo("E")==0 || dir.compareTo("W")==0 || dir.compareTo("S")==0){
					try{
						if(pos.compareTo("Null")==0 && pos1.compareTo("Null")!=0){
							pos1 = el.getDirection(pos1,dir);
							String s=el.getDescription(pos1);
							System.out.println(s);
							pos=pos1;
						}
						else if(pos1.compareTo("Null")==0){
							pos2 = el.getDirection(pos2,dir);
							String s=el.getDescription(pos2);
							System.out.println(s);
							pos=pos2;
						}
						else{
							pos1=pos;
							pos2=pos;
							pos = el.getDirection(pos,dir);
							String s=el.getDescription(pos);
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
