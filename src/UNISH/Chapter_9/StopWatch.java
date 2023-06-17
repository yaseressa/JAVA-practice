package UNISH.Chapter_9;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStopTime() {
        return endTime;
    }

    public double getStartTime() {
        return startTime;
    }
    void start(){
        this.startTime = (System.currentTimeMillis()/60);
    }
    void stop(){
        this.endTime = (System.currentTimeMillis()/60);
    }
    double getElapsedTime(){
        return endTime - startTime;
    }

}
class stopMain {
    public static void main(String[] args) {


        int[] randomArray = new int[100000];

        System.out.println("Creating an unsorted array of 100,000 numbers...");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopWatch = new StopWatch();

        System.out.println("Sorting array using selection algorithm...");
        stopWatch.start();
        selectionSort(randomArray);
        stopWatch.stop();
        System.out.println("Time elapsed: " + stopWatch.getElapsedTime() + " milliseconds.");

        for (int i = 0; i < randomArray.length; i++) {

            System.out.printf("%6d ", randomArray[i]);
            if ((i + 1) % 10 == 0)
                System.out.printf("\n");

        }
    }

    public static void selectionSort(int[] m) {

        for (int i = 0; i < m.length - 1; i++) {

            int currentMin = m[i];
            int currentIndex = i;

            for (int j = i + 1; j < m.length; j++) {

                if (currentMin > m[j]) {
                    currentMin = m[j];
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                m[currentIndex] = m[i];
                m[i] = currentMin;
            }
        }
    }
}