import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ConvertIntegerBinary {

    public static String convert_to_binary(int decimal, String output) {
        if (decimal <= 1) {
            output = String.valueOf(decimal) + output;
            return output;
        } else
        {
            output = String.valueOf(decimal % 2) + output;
            decimal = decimal / 2;
            return convert_to_binary(decimal, output);
        }

    }

    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String s = br.readLine();
        int input_decimal = 10;
        String output  = "";
        System.out.println(input_decimal);
        String ans = convert_to_binary(input_decimal, output);
        System.out.println(ans);

    }
}
