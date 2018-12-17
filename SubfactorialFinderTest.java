import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 12/17/2018.
 */
public class SubfactorialFinderTest {

    public static void main(String[] args) throws FileNotFoundException{

        //Input 5
        File file = new File("5.txt");
        Scanner scanner = new Scanner(file);
        int i = 0;
        while(scanner.hasNext()) {
            scanner.nextLine();
            i++;
        }
        int[] inputs = new int[i];
        scanner.close();
        scanner = new Scanner(file);
        i = 0;
        while(scanner.hasNextLine()){
            inputs[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        SubfactorialFinder subfactorialFinder = new SubfactorialFinder(inputs);
        for(int j = 0; j < subfactorialFinder.getOutputs().length; j++) {
            System.out.println(subfactorialFinder.getOutputs()[j]);
        }
    }

}
