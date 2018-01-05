package KickStart.KS2017.PracticeOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A {
//    final static String inputPath = "/home/ZDH/Documents/Repository/ProgrammingPractice/src/main/java/KickStart/KS2017/PracticeOne/A-small-practice.in";
//    final static String outputPath = "/home/ZDH/Documents/Repository/ProgrammingPractice/src/main/java/KickStart/KS2017/PracticeOne/A-small-practice.out";
    final static String inputPath = "/home/ZDH/Documents/Repository/ProgrammingPractice/src/main/java/KickStart/KS2017/PracticeOne/A-large-practice.in";
    final static String outputPath = "/home/ZDH/Documents/Repository/ProgrammingPractice/src/main/java/KickStart/KS2017/PracticeOne/A-large-practice.out";


    private static void appendFile(String data){
        try {
            FileWriter writer = new FileWriter(outputPath, true);
            writer.write(data+"\r\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void writeFile(ArrayList<String> data, boolean append){
        try{
            FileWriter writer = new FileWriter(outputPath,append);
            for(String str : data){
                writer.write(str + "\r\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Integer solution(String data){
        Set<Character> s = new HashSet<>();
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) != ' ') {
                s.add(data.charAt(i));
            }
        }
        return s.size();
    }

    public static void main(String[] orgs) {
        File file = new File(inputPath);
        BufferedReader reader = null;
        String line = null;
        Integer N = null;
        Integer caseNo = 1;
        ArrayList<String> result = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
            N = Integer.parseInt(reader.readLine());
            while( (line = reader.readLine()) != null ){
                Integer Ntests = Integer.parseInt(line);
                Integer res = 0;
                String resStr = "";
                for(int i = 1; i <= Ntests; i++){
                    line = reader.readLine();
                    Integer tmp = solution(line);
                    if(res < tmp){
                        res = tmp;
                        resStr = line;
                    } else if( res == tmp && resStr.compareToIgnoreCase(line) > 0 ){
                        res = tmp;
                        resStr = line;
                    }
                }
                result.add("Case #"+String.valueOf(caseNo++)+": "+resStr);
            }
            reader.close();

            writeFile(result,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
