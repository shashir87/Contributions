import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Dinesh
 * Date: 7/18/13
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringDeleteProgramContribution {
    public static void main(String[] args) {
        String value= "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String (Eg:SDDFHDJKKLL ) to delete same characters");
        value = in.next();
        StringBuffer stringBuffer= new StringBuffer(value);
        for(int i=0;i<stringBuffer.length();i++)
        {
            for(int j=0;j<stringBuffer.length()-1;j++)
            {
                if(stringBuffer.charAt(j)==stringBuffer.charAt(j+1))
                    stringBuffer=stringBuffer.delete(j, j+2);
            }
        }
        System.out.println("After removing the repeated characters: "+stringBuffer);
    }
}
