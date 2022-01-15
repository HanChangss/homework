public class recursiveSumTest {
    public static void main(String[] args) {
        //재귀호출
        System.out.println("result : " + recursiveSum(1));
    }

    
    public static int recursiveSum(int n) {

        if (n == 1) {                 // n이 1이면, 그냥 1을 반환함.
            
            return 1;
    
        }
    
        return n + recursiveSum(n-1); // n이 1이 아니면, n을 1부터 (n-1)까지의 합과 더한 값을 반환함.
        
        /*
        num이 1이면 그냥 1을 return을 하고 함수가 종료된다. 
        1이 아닐 경우 현재 num 값에 Funtion(num-1) 결과로 리턴되는 값을 더하여 리턴을 하게 된다. 
        풀이를 해보자면 5 + 1~4까지의 합이 된다. 
        매개변수 값이 4가 넘어가게 되는 경우에는 4 + 1~3까지의 합이 된다. 
        */
    }
}
