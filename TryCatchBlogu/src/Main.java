import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index ;

        int [] arr = {1,2,3,4,5,6,7,8,9,0};

          try {
            index = input.nextInt();
            System.out.println(arr[index]);
          }catch (ArrayIndexOutOfBoundsException e){
              System.out.println(e.getMessage());
          }
    }
}