package 스트림;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try {

            // "rw" 모드로 "data.txt" 파일을 개방함.
            RandomAccessFile file = new RandomAccessFile("data.txt", "rw");
            System.out.println(file.getFilePointer()); // 0 : 파일 포인터의 현재 위치를 반환함.
            file.writeInt(10);                         // 정수 10을 저장함.
            System.out.println(file.getFilePointer()); // 4
            file.seek(20);                             // 파일 포인터의 위치를 20으로 이동시킴.
            System.out.println(file.getFilePointer()); // 20
        } catch (IOException e) {    
            e.printStackTrace();

        }
    }
}
