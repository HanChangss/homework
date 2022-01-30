package 반복문;

public class ForTest {
    public static void main(String[] args) {
        
        for(int i = 0 ; i < 5; i++) {
            System.out.println("i 번재 : " + i);
        }

        /*
        객체가 있을때는 for each문을 사용하는게 더 유리
        */
        String[] names = {"KIM","JACK","LEE","DACUYA"};
        for( String name : names ) {
            System.out.println("name is "+ name );
        }
        System.out.println("END");

        int arr[] = {1,2,3,4,5,6};
        int sum = 0;
        for(int i : arr) {
            if(i != 3) {
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println("sum : " + sum);

        /* beak 나 또는 continue는 한번의 반복문 while문을 빠져 나오는거다
            한번에 모든 반복문을 빠져나가거나 특정 반복문을 빠져나가고 싶을 때 사용
        */
        allBreak :
        for (int i = 2; i < 10; i++) {

            for (int j = 2; j < 10; j++) {

                if (i == 5) {

                    break allBreak;

                }

                System.out.println(i + " * " + j + " = " + (i * j));

            }

}
    }
}
