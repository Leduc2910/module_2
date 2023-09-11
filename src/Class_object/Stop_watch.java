package Class_object;

public class Stop_watch {
    private long startTime;
    private long endTime;

    public Stop_watch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
