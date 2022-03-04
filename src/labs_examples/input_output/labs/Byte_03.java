package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_03 {
        public static void main(String[] args) throws IOException {
                int i;

                String fileReadPath = "src/labs_examples/input_output/files/char_data.txt";
                String fileWritePath = "src/labs_examples/input_output/files/char_data_rewrite2.txt";
                FileInputStream fin = null;
                FileOutputStream fout = null;
                BufferedInputStream buffInput = null;

                try {
                        fin = new FileInputStream(fileReadPath);
                        fout = new FileOutputStream(fileWritePath);

                        do {
                                i = fin.read();
                                if(i != -1)
                                        if ((char) i == '.')
                                                i = ';';
                                fout.write(i);
                        } while(i != -1);

                } catch(IOException exc) {
                        System.out.println("I/O Error: " + exc);
                } finally {
                        try {
                                if(fin != null) {
                                        fin.close();
                                }
                        } catch(IOException exc) {
                                System.out.println("Error closing input file");
                        }
                        try {
                                if(fout != null) {
                                        fout.close();
                                }
                        } catch(IOException exc) {
                                System.out.println("Error closing output file");
                        }
                }
        }
}
