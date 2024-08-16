package Task;

public class Main {
    public static void main(String[] args) {

        for (int i=0;i<=100;i++){
            SharedResources sh = new SharedResources(i);
            sh.start();
        }
    }
}
