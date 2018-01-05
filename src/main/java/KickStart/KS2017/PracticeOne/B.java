package KickStart.KS2017.PracticeOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class B {
    final static String inputPath = "/home/ZDH/Documents/Repository/ProgrammingPractice/src/main/java/KickStart/KS2017/PracticeOne/" +
            "B-small-practice.in";
    final static String outputPath = "/home/ZDH/Documents/Repository/ProgrammingPractice/src/main/java/KickStart/KS2017/PracticeOne/" +
            "B-small-practice.out";
//    final static String inputPath = "/home/ZDH/Documents/Repository/ProgrammingPractice/src/main/java/KickStart/KS2017/PracticeOne/A-large-practice.in";
//    final static String outputPath = "/home/ZDH/Documents/Repository/ProgrammingPractice/src/main/java/KickStart/KS2017/PracticeOne/A-large-practice.out";


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

    private static double solution(int d){
        double res = 1;
        for(int i = 1; i <= d; i++){
            res *= i;
        }
        return res;
    }

    public static void main(String[] orgs) {
        File file = new File(inputPath);
        BufferedReader reader = null;
        Integer N = null;
        ArrayList<String> result = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
            N = Integer.parseInt(reader.readLine());
            for(int caseNo = 1; caseNo <= N; caseNo++){
                String[] line = reader.readLine().split(" ");
                Integer A = Integer.parseInt(line[0]);
                Integer B = Integer.parseInt(line[1]);
                double resStr = ( solution(A) * B ) / solution(A+B);

                result.add("Case #"+String.valueOf(caseNo)+": "+ new BigDecimal(resStr).setScale(8,BigDecimal.ROUND_HALF_UP));
            }
            reader.close();

            writeFile(result,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
