package output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
    public static void main(String[] args) {
        byte []buf=new byte[10];
        for(int i=0;i<buf.length;i++){
            buf[i]=(byte)i;
        }
        try {
            FileOutputStream out =new FileOutputStream("a.dat");
            out.write(buf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
