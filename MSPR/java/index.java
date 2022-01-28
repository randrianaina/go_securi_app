package MSPR.java;

import java.util.*;
import java.io.*;
import java.nio.file.Paths;
import java.text.Collator;

public class index {static String[] args2;
    public static void main(String[] args) throws IOException {



        var path = Paths.get("MSPR/java", "staff.txt");
        FileReader fr = new FileReader(path.toString());
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(fr);
        StringBuilder sb = new StringBuilder();
        List<String> lines = new ArrayList<String>();
        String line = null;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();
        Collections.sort(lines, Collator.getInstance());
        var path2 = Paths.get("MSPR/java", "index.html");
        FileWriter fw = new FileWriter(new File(path2.toString()));
        BufferedWriter bw = new BufferedWriter(fw);
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>MSPR");
        sb.append("</title>");
        sb.append("<link href='main.css' rel='stylesheet'>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<div class='agents'>");
        sb.append("<ul>");
        for(int i = 0; i < lines.size(); i++) {
            sb.append("<li><a href='");
            Mspr.generateHtml(args2,lines.get(i),i);
            sb.append("test"+i+".html'>"+ lines.get(i) +"</a></li>");
        }
        sb.append("</ul>");
        sb.append("</div>");
        sb.append("</body>");
        sb.append("</html>");
        bw.write(sb.toString());
        bw.close();
        sc.close();


    }
}

