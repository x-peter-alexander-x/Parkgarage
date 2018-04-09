package fischer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CCC_Parkhaus {
    public static String main(String[] args) {


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
        public static String loadInputData(String datName)
        String fileData = "";
        File file = new File(datName);

        if (!file.canRead() || !file.isFile()) {
            return "";
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(datName));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                fileData += zeile+"\r\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return fileData;

    }
}
