import java.util.Random;

public class Car {
    private int v;
    public int getV() {
        Random rd = new Random();
        v=v+ rd.nextInt(6)+5;
        if(v>100) {
            v = v - 10;
        }
        return v;
    }
}
