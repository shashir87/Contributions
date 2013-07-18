import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Dinesh
 * Date: 7/18/13
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReadAndWriteToAFile {
    public static void main(String args[])
    {
        try{
            String filename = "football.txt";
            FileReader fileReader = new FileReader(filename);
            BufferedReader reader=new BufferedReader(fileReader);

            FileWriter writer = new FileWriter("writingFile.txt");
            BufferedWriter out = new BufferedWriter(writer);
            Scanner in = new Scanner(reader);
            while(in.hasNextLine()){
                String readLine = in.nextLine().trim();
                out.write(readLine);
                out.write("\n");
            }

            out.close();
            reader.close();
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}

