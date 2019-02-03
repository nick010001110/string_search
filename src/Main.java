import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.nextLine();
        String phrase2 = unify(phrase1);

        char [] p1 = phrase1.toCharArray();
        char [] p2 = phrase2.toCharArray();

        int [] counts = new int[p2.length];


        for (int i : counts
             ) {
            counts[i]=0;
        }

        for (int i =0; i< p1.length; i++) {


            for (int j =0; j< p2.length; j++)
            {
                if (p2[j]==p1[i])
                {
                    counts[j]++;
                }
            }

        }





        for(int i= 0; i<counts.length; i++)
        {
            if(counts[i]==1){
                System.out.println("Уникальный символ в строке: " + p2[i]);
                break;
            }
        }
    }



    public static String unify(String str){
        HashSet<Character> hs = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for (Character character : str.toCharArray()) {
            if(hs.add(character)){
                sb.append(character);
            }
        }
        return sb.toString();
    }




}
