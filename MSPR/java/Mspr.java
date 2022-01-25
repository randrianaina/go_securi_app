package MSPR.java;

import java.util.*;
import java.io.*;
import java.nio.file.Paths;

public class Mspr{


    public static void main(String[] args2,String str,int j) throws IOException {

        var path = Paths.get("MSPR/java", "liste.txt");
        FileReader fr = new FileReader(path.toString());
        Scanner sc = new Scanner(fr);
        StringBuilder sb = new StringBuilder();
        var path3 = Paths.get("MSPR/java", "test"+j+".html");
        FileWriter fw = new FileWriter(new File(path3.toString()));
        BufferedWriter bw = new BufferedWriter(fw);

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>MSPR");
        sb.append("</title>");
        sb.append("<link href='main.css' rel='stylesheet'>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<img src='img.png' alt='photo de profil'>");
        sb.append("<div class='iden'>"+str+"</div>");
        sb.append("<div class='hello'>");
        while (sc.hasNext())
        {
            String line = sc.nextLine();
            String ch="";
            for(int i = 0; i < line.length(); i++)
            {
                if(line.charAt(i) == Character.toUpperCase(line.charAt(i)))
                {
                    
                    ch=line.substring(i+4,line.length());
                    sb.append("<label>"+ch+"</label> ");
                    sb.append("<input type='checkbox'checked><br><br>");
                    break;
                }
            }
                
        }
        sb.append("</div>");
        sb.append("</body>");
        sb.append("</html>");
        bw.write(sb.toString());
        bw.close();
        sc.close();
        

    }
}