public class Navigator implements Runnable{

    int s;
    Car c;

    public Navigator(int s, Car c){
        this.s = s*1000;
        this.c = c;
    }

    @Override
    public void run() {
        int time = 0;
        double av = 0;
        double obshayV = 0;
        double vMs;
        int timeOst;

        for(int i = s; i>0; i= (int) (i-vMs)){
            vMs = c.getV()*0.28;
            time++;
            obshayV = obshayV + vMs;
            av = (int) ((obshayV)/time);
            timeOst = (int) (i/av);
            System.out.println("Your speed: " + c.getV()+" km/h");
            System.out.println("Average speed: "+ String.format("%1$,.2f", av/0.28) + " km/h");
            System.out.println("Left to go: " + i/1000 + " km");
            System.out.println("time to arrival: " + timeOst + " s");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
