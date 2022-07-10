package animals;

public class dog extends animals{

    public void info(int length) {
        this.length = length;
    }
    @Override
    public void run() {
        System.out.println("Dog " + length);
    }
}
