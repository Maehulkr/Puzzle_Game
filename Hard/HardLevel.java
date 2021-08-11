package Hard;

import java.io.BufferedReader;
import java.io.FileReader;

public class HardLevel {
    public String getDirection(String pos, String dir) throws Exception{
        BufferedReader br = null;
        String s;
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\Java\\College Java\\Maze Game\\src\\Direction.txt"));
            while((s = br.readLine())!=null){
                if(dir.length()==2)
                {
                    if(s.charAt(0)==pos.charAt(0) && s.charAt(1)==pos.charAt(1) && s.charAt(3)==dir.charAt(0) && s.charAt(4)==dir.charAt(1) ){
                        String a=s.substring(6);
                        return a;
                    }
                }
                else{
                    if(s.charAt(0)==pos.charAt(0) && s.charAt(1)==pos.charAt(1) && s.charAt(3)==dir.charAt(0)){
                        String a=s.substring(6);
                        return a;
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if(br!=null)
                br.close();
        }
        return null;
    }
    public String getDescription(String s) throws Exception{
        BufferedReader br = null;
        String st;
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\Java\\College Java\\Maze Game\\src\\Description.txt"));
            while((st = br.readLine())!=null){
                if(st.charAt(0)==s.charAt(0) && st.charAt(1)==s.charAt(1) && s.compareTo("Null")!=0 && s.compareTo("Exit")!=0){
                    String a = st.substring(3);
                    return a;
                }
                else if((s.compareTo("Null")==0 || s.compareTo("Exit")==0) && (st.charAt(0)==s.charAt(0))){
                    String a = st.substring(5);
                    return a;
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if(br!=null)
                br.close();
        }
        return null;
    }
}


