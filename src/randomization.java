import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class randomization {
    public static char normalChar[]
            = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    ArrayList<Character> arr1 = new ArrayList<Character>(26);




    Random rand = new Random();

    randomization() {
        Set<Character> hash_Set = new LinkedHashSet<>();

        while (hash_Set.size()!=26){
            char temp= (char)(rand.nextInt(97,122));
            hash_Set.add(temp);
            if(hash_Set.contains(temp)){
                try {
                    temp = (char) (rand.nextInt(97, 120));
                    hash_Set.add(temp);
                    temp = (char) (((int) temp) + 1);
                    hash_Set.add(temp);
                    temp = (char) (((int) temp) + 2);
                    hash_Set.add(temp);
//                temp=(char)(((int)temp)+3);
//                hash_Set.add(temp);
                }
                catch (Exception e){
                    continue;
                }
            }
        }





        System.out.println(hash_Set);
    }


    public static void main(String[] args) {
            randomization r1 = new randomization();
            System.out.println(normalChar);
    }
}