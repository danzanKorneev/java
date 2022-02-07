
public class test1 { 
public static void main (String[] args){
    
    String input = "step@3test_d22em1o,,*#/adddoe";
    String output = "";
    int temp = input.length();
    for (int i = 0; i < temp; i++) {
        Character c = input.charAt(i);
        if (Character.isDigit(c)) {
            output = output + c;
        }
    }
    if(output==""){
        System.out.println(0);
    }else{   int result = Integer.parseInt(output);
        
        int num = result, sum = 0, r;
        for (; num != 0; num = num / 10) {
            r = num % 10;
            sum = sum + r;
        }
        System.out.println(sum);
      

    }
 
}
}