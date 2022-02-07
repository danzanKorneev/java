import java.util.Scanner;
public class test4{
    



    
public static void main(String[] args) {
    while (true)
    {
 Scanner console = new Scanner(System.in);
    String line = console.nextLine();
    console.close();
    
  
    String[] one  = new String[5];
    one[0] = "    *";
    one[1] = "  * *";
    one[2] = "    *";
    one[3] = "    *";
    one[4] = "    *";
    String [] two = new String[5];
    two[0]=" * * * ";
    two[1]="*     *";
    two[2]="    *  ";
    two[3]=" *     ";
    two[4]="* * * *";

    String[] three = new String[5];
    three[0] = "* ** *";
    three[1] = "     *";
    three[2] = " * * *";
    three[3]=  "     *";
    three[4] = "* ** *";
    String[] four = new String[5];
    four[0] = "*    *";
    four[1] = "*    *";
    four[2] = "*  * *";
    four[3]=  "     *";
    four[4] = "     *";
    String[] five = new String[5];
    five[0] = "*  * *";
    five[1] = "*     ";
    five[2] = "*  * *";
    five[3]=  "     *";
    five[4] = "*  * *";
    String[] six = new String[5];
    six[0] = "*  * *";
    six[1] = "*     ";
    six[2] = "*  * *";
    six[3]=  "*    *";
    six[4] = "*  * *";
    String[] seven = new String[5];
    seven[0] = "*  * *";
    seven[1] = "     *";
    seven[2] = "     *";
    seven[3]=  "     *";
    seven[4] = "     *";
    String[] eight = new String[5];
    eight[0] = "* ** *";
    eight[1] = "*    *";
    eight[2] = "* ** *";
    eight[3]=  "*    *";
    eight[4] = "* ** *";
    String[] nine = new String[5];
    nine[0] = "* ** *";
    nine[1] = "*    *";
    nine[2] = "* ** *";
    nine[3]=  "     *";
    nine[4] = "* ** *";




    char chislo;
    String[] n= new String[5];
    n[0]="";
    n[1]="";
    n[2]="";
    n[3]="";
    n[4]="";
    int k=0;
    while(k<line.length()){
        chislo=line.charAt(k);
        if (chislo=='1')
        {
            for (int y=0;y<5;y++)
                n[y]+=one[y]+"  ";
        }
        if (chislo=='2')
        {
            for (int y=0;y<5;y++)
            n[y]+=two[y]+"  ";
        }
        if (chislo=='3')
        {
            for (int y=0;y<5;y++)
            n[y]+=three[y]+"  ";
        }
        if (chislo=='4')
        {
            for (int y=0;y<5;y++)
            n[y]+=four[y]+"  ";
        }
        if (chislo=='5')
        {
            for (int y=0;y<5;y++)
            n[y]+=five[y]+"  ";
        }
        if (chislo=='6')
        {
            for (int y=0;y<5;y++)
            n[y]+=six[y]+"  ";
        }
        if (chislo=='7')
        {
            for (int y=0;y<5;y++)
            n[y]+=seven[y]+"  ";
        }
        if (chislo=='8')
        {
            for (int y=0;y<5;y++)
            n[y]+=eight[y]+"  ";
        }
        if (chislo=='9')
        {
            for (int y=0;y<5;y++)
            n[y]+=nine[y]+" ";
        }
   k++;
}

for (int y=0;y<5;y++)
System.out.println(n[y]);

}
}
}