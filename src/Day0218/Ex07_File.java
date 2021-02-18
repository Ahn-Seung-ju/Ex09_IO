package Day0218;

import java.io.File;

/*
파일과 폴더(디렉토리) 다루는 클래스

JAVA: 파일, 펄도 하나의 클래스: File
>> a.txt 생성, 삭제, 정보 read
>> Temp 폴더도 생성, 삭제, 정보 read

c#: File 클래스, Directory 클래스

절대경로: C:\\, D:\\  >> C:\\Temp\\a.txt

상대경로 : 현재 파일을 중심으로 C:\\Test >> 
 */
public class Ex07_File {

    public static void main(String[] args) {
        //String path = "Lotto.txt";
        String path = "C:\\Temp1\\file.txt";
        File f = new File(path);
        //File 클래스 사용: file 다양한 정보를 얻어낼 수 있음
        System.out.println("파일명: " + f.getName());
        System.out.println("전체경로: " + f.getPath());
        System.out.println("절대경로: " + f.getAbsolutePath());
        System.out.println("폴더?: " + f.isDirectory());
        System.out.println("파일?: " + f.isFile());
        System.out.println("파일크기: " + f.length() + "byte");
        System.out.println("부모경로: " + f.getParent());
        System.out.println("파일 폴더 실 존재 여부: " + f.exists());
        
        //f.createNewFile();
        //f.delete() 삭제
        
    }

}
