package org.travelapp.bremen.nanaldeul;

import java.util.ArrayList;

public class SampleData {

    ArrayList<Plan> items = new ArrayList<>();

    public ArrayList<Plan> getItems() {

        Plan plan1 = new Plan("https://t1.daumcdn.net/cfile/tistory/0138F14A517F77713A",
                "2018.11.17 - 19", "제주여행", "D - 1");

        Plan plan2 = new Plan("https://t1.daumcdn.net/cfile/tistory/0138F14A517F77713A",
                "2018.11.17 - 19", "제주여행", "D - 1");

        Plan plan3 = new Plan("https://i.ytimg.com/vi/5-mWvUR7_P0/maxresdefault.jpg",
                "2018.11.17 - 19", "제주여행", "D - 1");

        items.add(plan1);
        items.add(plan2);
        items.add(plan3);

        items.add(plan1);
        items.add(plan2);
        items.add(plan3);

        items.add(plan1);
        items.add(plan2);
        items.add(plan3);

        return items;
    }
}