

import 베열.Array;

class test {

    public static void main(String[] args) { //main문은 메소드영역(static 영역) 이다.
        test t1 = new test(); //힙영역 생성함으로써 stack 영역에 접근 할 수 있다.
        t1.age();
        t1.name("aa");
    
    }
    public void name(String a) {
        this.age();
        String ab = "abc,def,hij";
        main(ab.split(","));
    }

    public void age() {
        
    }
}