package DSCoursera;

import java.util.stream.IntStream;
import java.time.Instant;
import java.time.Duration;

public class TimeAnalysis {

    public static void main(String[] args) {
        Instant start = Instant.now();
        for(int i=0;i<100;i++){
        }
        Instant end = Instant.now();
        long timeElapsed = end.getNano() - start.getNano();
        System.out.println("Total time elapsed for traditional "+timeElapsed);
        start = Instant.now();
        IntStream.range(1, 100).parallel().iterator();
        end = Instant.now();
        timeElapsed = end.getNano() - start.getNano();
        System.out.println("Total time elapsed using java 8 foreach "+timeElapsed);
    }
    
}