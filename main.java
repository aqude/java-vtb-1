import animals.cat;
import animals.tiger;
import animals.dog;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        cat Cat = new cat();
        dog Dog = new dog();
        tiger Tiger = new tiger();
        int [] arrRand = new int[3];
        Random r = new Random();
        int i = 0;
        while (i < arrRand.length){
            arrRand[i] = r.nextInt(100) + 1;
            i++;
        }
        for (int o : arrRand) {
            Cat.info(arrRand[0]);
            Dog.info(arrRand[1]);
            Tiger.info(arrRand[2]);
        }
        Tiger.run();
        Dog.run();
        Cat.run();
    }
}
