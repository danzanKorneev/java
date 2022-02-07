import java.util.Scanner;

public class test2 {
    public void factorization(int n){
		for(int i = 2;i<=n;i++){
			while(n>=i){
				if(n%i==0){
					System.out.println(i);
					n = n/i;
				}else{
					break;
				
            }
        }
    }
    }
    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

	public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
       if(checkString(input)==true){
        int chislo=Integer.parseInt(input);
        test2 pf = new test2();
        pf.factorization(chislo);
       }else{
           System.out.println("Некоректный ввод");
       }
       
    }

    }
		
	
        
	

	

