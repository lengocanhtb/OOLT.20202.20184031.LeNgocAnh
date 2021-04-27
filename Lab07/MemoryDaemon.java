package hust.soict.hedspi.aims.media;

public class MemoryDaemon implements java.lang.Runnable{
    @Override
    public void run() {
        Runtime rt = Runtime.getRuntime();
        long used;
        while (true){
            used = rt.totalMemory()-rt.freeMemory();
            long memoryUsed = 0;
            if(used != memoryUsed){
                System.out.println("\t Memory used ="+used);
                memoryUsed = used;
            }
        }
    }
}
