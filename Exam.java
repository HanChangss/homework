public class Exam {
    
    public static void main(String[] args) {
        //1.여기서는 name 호출이 안됩니다. 왜 그런지 메모리 구조를 비유하여 이유를 설명하세요.(age 도 동일)
        
        //2.호출되도록 소스를 작성해보세요.
    }

    public void name(){
        System.out.println("나는 박성훈입니다.");
        age(); //3. age가 호출되는 이유를 설명하세요.
    }

    public void age() {
        System.out.println("나이는 29살입니다.");
    }
}
