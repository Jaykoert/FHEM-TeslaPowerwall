
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class TeslaAuth {
    public static void main(String[]args){
        byte[] array = new byte[86 ]; // length is bounded by 86
        new Random().nextBytes(array);
        String generatedString = new String(array, StandardCharsets.UTF_8);

        System.out.println(generatedString);



    }
}

