package Day0217;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
                fos = new FileOutputStream("C:\\Temp1\\new.txt", true);
                //FileOutputStream
                //1.write 하는 파일 존재하지 않으면 >> 파일 생성
                //new FileOutputStream("C:\\Temp1\\new.txt",false);
                //overwrite
                
                //append(추가 생성) >> true
                
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
        }finally {
            //정상적으로 수행되던 비정상적으로 수행되던 강제적 실행(return 있어도 실행)
            //자원 해제
            //명시적인 자원 해제(객체) >> 가비지 컬렉터 관리 
            //가비지 컬렉터가 관리핮 못하는 자원
            // I/O, NetWork... 개발자가 직접 (명시적으로) 자원 해제
            //ex) 엑셀파일 작업 하고 있으면 다른사람이 열면 ... 읽기 전용 ... 수정할수 없다 ..
            //생성자 <-> 소멸자 
            try {
                fs.close();
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }

    }

}
