package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */
class Exercise_02 {
    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter out = null;
        String file = ("src/labs_examples/input_output/files/char_data.txt");
        String file2 = ("src/labs_examples/input_output/files/Exercise_2_encrypt.txt");
        try{
            in = new BufferedReader(new FileReader(file));
            out = new PrintWriter(new FileWriter(file2));
            String inStr;
            String outStr = ("");
            while ((inStr = in.readLine()) != null) {
                // write entire line to output stream
                for(int i = 0; i < inStr.length(); i++){
                if(inStr.charAt(i) == ('a')){
                outStr += ('-');
                }else if(inStr.charAt(i) == ('e')){
                    outStr += ('~');
                }else{
                    outStr += inStr.charAt(i);
                }
                }
                out.println(outStr);
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
            try{
            out.close();
            } catch (NullPointerException one){
               System.out.println("Error in IO closing");           }
        }
        try{
            UnencryptRead("src/labs_examples/input_output/files/Exercise_2_encrypt.txt");
        }catch(IOException two){
            System.out.println("Error in unencryption.");
        }

    }
    public static void UnencryptRead(String filePath) throws IOException {

        File file = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        String st2 = ("");

        while ((st = br.readLine()) != null) {
            for(int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == '-') {
                    st2 += ('a');
                }else if(st.charAt(i) == '~'){
                    st2 +=('e');
                }else{
                    st2 += st.charAt(i);
                }
            }
        }
        System.out.println(st2);
    }
}
