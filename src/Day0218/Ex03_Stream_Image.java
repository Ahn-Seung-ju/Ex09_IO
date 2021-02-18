package Day0218;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_Stream_Image {

    public static void main(String[] args) {
        String orfile = "C:\\Temp1\\image.jpg";
        String tarfile = "copy.jpg";
        // default 경로 : 프로젝트 폴더
        FileInputStream fs = null;
        FileOutputStream fos = null;

        try {
            fs = new FileInputStream(orfile);
            fos = new FileOutputStream(tarfile, false);

            int data = 0;
            while ((data = fs.read()) != -1) {
                fos.write(data); //copy.jpg 에서 byte  write
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fos.close();
                fs.close();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            

        }
    }

}
