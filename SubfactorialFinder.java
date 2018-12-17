import java.util.ArrayList;

/**
 * Created by Benjamin Ehlers on 12/17/2018.
 */
public class SubfactorialFinder {

    private int[] inputs;
    private int[] outputs;

    public SubfactorialFinder(int[] inputs){
        this.inputs = inputs;
        outputs = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            outputs[i] = countPermutations(inputs[i]);
        }
    }
    private int countPermutations(int factorial) {
        if (factorial == 1) return 0;
        if (factorial == 2) return 1;
        return (factorial - 1)*((countPermutations(factorial - 1) + countPermutations(factorial-2)));
    }

    public int[] getOutputs() {
        return outputs;
    }
}
