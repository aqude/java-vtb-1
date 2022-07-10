package animals;

public class tiger extends animals{

    public void info(int length) {
        this.length = length;
    }
    @Override
    public void run() {
        System.out.println("Tiger " + length);
    }
}
