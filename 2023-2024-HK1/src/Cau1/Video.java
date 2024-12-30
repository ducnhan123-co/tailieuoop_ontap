package Cau1;

public class Video {
    private String title;
    private String classification;
    private int time;

    public Video(String title, String classification, int time) {
        this.title = title;
        this.classification = classification;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public String formatTime()
    {
        int hour = this.time/60;
        int minute = this.time%60;
        return hour+" hours "+minute +" minute ";
    }

    public void print()
    {
        System.out.println("Tieu de phim: "+ this.title);
        System.out.println("Loai phim: "+ this.classification);
        System.out.println("Thoi gian: "+this.time);
        System.out.println(formatTime());
    }
}
