package Day0217;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
대상 read , write(file) >> 1. txt , 메모.txt

>>FileInputStream
>>FileOutputStream




 */
public class Ex02_Point_FileStream {

    public static void main(String[] args) {
        FileInputStream fs = null;
        FileOutputStream fos = null;
        String path = "C:\\Temp1\\a.txt";
        
        try {
                fs = new FileInputStream(path);
                fos = new FileOutputStream("C:\\Temp1\\new.txt");
                int data = 0;
                while((data = fs.read()) != -1) {
                    System.out.println("정수: " + data);// char 정수 변환해서
                    System.out.println("문자: " + (char)data);//타입 캐스팅
                    
                    fos.write(data);
                    //new.txt 파일에 data 값을 write
                    //FileOutputStream write할려고 하는 파일이 없으면
                    //파일도 생성(생성 기능)
                }
            
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

}
