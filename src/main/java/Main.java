public class Main{
    public static void main(String[] args) throws Exception {
        Car c = new Car();
        Navigator nv = new Navigator(3, c);
        nv.run();
    }
}
