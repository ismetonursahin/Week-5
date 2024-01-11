import java.util.HashMap;
import java.util.Scanner;

public class MostCommonWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String metin = "";
        int kelime = 0;
        int maxValue = Integer.MIN_VALUE;
        String mostRepeatedWord = "";


        HashMap<String,Integer> wordSearch  = new HashMap<String ,Integer>();

        System.out.println("#### EN ÇOK GEÇEN KELİMEYİ BULMAK ####");
        System.out.println();
        System.out.print("Metni Buraya Yazınız : ");
        metin = input.nextLine();
        String[] metinArr = metin.split(" ");

        for (int i = 0; i < metinArr.length; i++) {
            for (int j = 0; j < metinArr.length; j++) {
                if (metinArr[i].equals(metinArr[j])) {
                    kelime++;
                }
            }
            wordSearch.put(metinArr[i], kelime);
            kelime = 0;
        }
        for (String i : wordSearch.keySet()) {
            if (wordSearch.get(i)>maxValue){
                maxValue = wordSearch.get(i);
                mostRepeatedWord = i;
            }
        }
        System.out.println("En çok geçen kelime : " + mostRepeatedWord.toUpperCase() + " kelimesi " + maxValue + " defa geçiyor.");
    }
}
