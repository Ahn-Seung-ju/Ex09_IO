package Day0217;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
Stream 중간 매개체(데이터 통로) default: Byte

JAVA API
추상 클래스

InputStream, OutputSteam

입출력 [대상] 두개의 추상클래스 상속 재정의 사용해라

1. Memory: ByteArray...., ByteArray...
2. File  : File...      , File...   (중요요요용ㅇㅇ요요요ㅗㅗㅗㅗㅗㅗㅗ오)

 */
public class Ex01_Stream {
    public static void main(String[] args) {
        //Byte(-128 ~ 127) 정수를 저장하는 데이터 타입
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        byte[] outSrc = null;//현재 메모리를 가지고 있지 않다(초기화)
        
        //데이터 read, write 대상 memory
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        input = new ByteArrayInputStream(inSrc); //inSrc 배열(메모리) >> read
        output = new ByteArrayOutputStream(); //write
        
        System.out.println("ourSrc before: " + Arrays.toString(outSrc));
        
        //공식같은 로직
        int data = 0;
        while((data = input.read()) != -1) {//더이상 read data 없으면 -1
            System.out.println("data: " + data);//read() 함수는 내부적으로 next()
            //read한 데이터를 다른 메모리 write
            output.write(data);
            //write 대상이 data가 아니고
            //ByteArrayOutputStream 자신의 통로 data 가진다
        }
        
        System.out.println(output.toByteArray());//가지고 있는 곳의 주소
        
        outSrc = output.toByteArray();
        
        System.out.println("outSrc after: " + Arrays.toString(outSrc));
        
        
        
    }

}
