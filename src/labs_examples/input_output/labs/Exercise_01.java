package labs_examples.input_output.labs;
import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
    BufferedReader in = null;
    PrintWriter out = null;
    String file = ("src/labs_examples/input_output/files/char_data.txt");
    String file2 = ("src/labs_examples/input_output/files/char_data_2.txt");
    try{
        in = new BufferedReader(new FileReader(file));
        out = new PrintWriter(new FileWriter(file2));
        String l;

        while ((l = in.readLine()) != null) {
            // write entire line to output stream
            out.println(l);
        }
    }catch(IOException one){
        System.out.println("Error in IO.");
    }finally {
        // close connections
        try{
            in.close();
        } catch(IOException exc){
            exc.printStackTrace();
        }
        //try{
            out.close();
        //} catch (IOException two){
        //    System.out.println("Error in IO");           }

    }

    }
}