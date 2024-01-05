import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void  print(int arr[], int index) throws CustomException{
        if (index >= arr.length){
            throw  new CustomException("");
        }
        System.out.println(arr[index]);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("index gir : ");
        int index = input.nextInt();
        int [] arr = new int[10];

          try {
            print(arr,index);
          }catch (CustomException e){
              System.out.println(e.getMessage());
          }catch (Exception e){
              System.out.println("Sayı girmelisin.");
          }finally {
              System.out.println("Kod sona geldi");
          }
    }
}