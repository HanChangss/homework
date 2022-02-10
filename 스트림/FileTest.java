package 스트림;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        //File dir = new File("/Users/changss/java/data2.txt");       // 디렉터리 생성
        try {

        
        File file = new File("/Users/changss/java/data2.txt"); // 파일 생성
        if(!file.exists()) {                   // 파일이 생성되었는지를 확인함.
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);
        // 4. 파일에 쓰기
        writer.write("안녕하세요");
        // 5. BufferedWriter close
        writer.close();

        System.out.println(file.getPath());    // /Users/changss/java/data.txt
        System.out.println(file.length());     // 파일의 크기를 반환함.
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
