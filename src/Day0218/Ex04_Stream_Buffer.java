package Day0218;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
File 처리 (Disk) : 원칙 1 Byte 단위 read , write
모아서 한번에 read, write (버스에 다 태워 >> 20개 씩 태움)
버스: buffer
1. I/O 성능 향상(횟수 낮아짐)
2. Line 단위 (엔터)

보조 stream: BufferedInputStream (주 클래스 의존)
개발자 의무적 사용 ..
 */
public class Ex04_Stream_Buffer {

    public static void main(String[] args) {
        
        
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        
        try {
            fos = new FileOutputStream("data.txt"); //data.txt 없으면 파일 생성 , write
            bos = new BufferedOutputStream(fos);// default 생성자가 없어 주 스트림을 넣어 주어야 한다
            
            for(int i = 0; i < 10; i++) {
                bos.write('A');
            }
            //bos.flush();
            //Java Buffer 크기: 8kbyte: 8192byte
            //1. buffer 안에 내용이 채워지면 스스로 출발(비운다): flush
            //2. buffer 강제로 비운다 (명시적으로 flush 호출) flush()
            //3. bos.close() 자원해제 >> 자동으로 flush() 호출
            
            
        }catch (Exception e) {
            // TODO: handle exception
        }finally {
            try {
                bos.close();
                fos.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }

    }

}
