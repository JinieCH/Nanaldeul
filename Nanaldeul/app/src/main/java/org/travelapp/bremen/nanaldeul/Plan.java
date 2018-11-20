package org.travelapp.bremen.nanaldeul;

public class Plan {

    private String url;
    private String date;
    private String title;
    private String dDay;

    public Plan(String url, String date, String title, String dDay) {

        this.url = url;
        this.date = date;
        this.title = title;
        this.dDay = dDay;

    }

    public String getUrl() {
        return url;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getdDay() {
        return dDay;
    }
}
