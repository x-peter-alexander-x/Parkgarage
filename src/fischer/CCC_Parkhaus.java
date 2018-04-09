package fischer;

public class CCC_Parkhaus {
    public static void main(String[] args) {


        String input = "";
        if (args.length > 0) {
            String inputData = "";
            inputData = loadInputData(args[0]);
            if (!inputData.isEmpty()) {
                input = inputData;
            }
        }
        if (input.length() < 1) {
            System.out.println("no input data found.");
            System.exit(0);
        }


    }
}
