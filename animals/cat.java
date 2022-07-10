package animals;

public class cat extends animals {

    public void info(int length) {
        this.length = length;
    }
    @Override
    public void run() {
        System.out.println("Cat " + length);
    }
}
