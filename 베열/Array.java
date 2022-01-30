package 베열;

public class Array {
    public static void main(String[] args) {
        /*
            배열 복사에는 가장 많이 사용하는 arraycopy() 이다.
            문법 정리
            System.arraycopy(src, srcPos, dest, destPos, length); 
            src - 원본 배열, 
            srcPos - 원본 배열의 복사 시작 위치, 
            dest - 복사할 배열, 
            destPost - 복사할 배열의 복사 시작 위치, 
            length - 복사할 요소의 개수
        */
        
        
        int[][] arr = new int[2][3];

        int k = 10;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = k; // 인덱스를 이용한 초기화

                k += 10;

            }
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        for(int[] a : arr) {
            for(int b : a) {
                System.out.println(b + " ");
            }
            System.out.println();
        }
    }
}
