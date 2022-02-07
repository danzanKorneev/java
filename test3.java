import java.util.Arrays;
import java.util.Scanner;

public class test3 {
   

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        System.out.println(str);
        str = str.toLowerCase();
        String[] words = str.split(" ");
        String vowel = " уаоыэяюёие";
        int total = 0;
     

        int[] count = new int[words.length];
         for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                if (index > 0) {

                    count[i] = count[i] + 1;
                }
            }
        }
        //Сортировка выбором (Selection sort)

        for (int i = 0; i < count.length-1 ; i++) {
            for (int j = i+1; j < count.length; j++) {

                if (count[i] < count[j]) {

                    int buf = count[i];
                    count[i] = count[j];
                    count[j] = buf;
                    

                    String sbuf = words[i]; //сортируем слова по тем же критериям что и числа в массиве count
                    words[i] = words[j];
                    words[j] = sbuf;
                   
                }
            }
        }
        String x= String.join(" ", words);
        String z = String.join("", vowel );
        char[] charsV =z.toCharArray();
        char[] chars = x.toCharArray();
        
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                for(int j =0;j<charsV.length-1;j++)
                if(chars[i+1]==charsV[j]){
                    chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                }
              
            }
        }

        for (int i = 0; i < count.length; i++) {
           total += count[i];
        }
        x = new String(chars);
     
        System.out.println("В строке:"+total+" глассных ");
        System.out.println("отсортированы числа и слова:");
        System.out.println(Arrays.toString(count));
        System.out.println(x);

    }

  
    }