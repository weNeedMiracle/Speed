import java.util.Random;

public class Car extends Thread {
    public Car(String name){
        super.run();
    }
    public void run(int s){
        int v=0;
        Random rd = new Random();
        int p=0;
        int av;
        int t = 0;
        int j;
        int r;
        for(int i = s*1000; i>0; i = i - r){
            v = v +rd.nextInt(8)+2;
            if(v>60){
                v = v - 7;
            }
            p = p+v;
            t++;
            av = p / t;
            r = (int) (v * 0.28);
            j = (int) (i/(av*0.28));
            System.out.println("Текущая скорость: " + v + " км/ч");
            System.out.println("Средняя скорость: " + av + " км/ч");
            System.out.println("Осталось ехать: "+ i/1000 + " км");
            System.out.println("Времени до прибытия: "+ j + " c");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
