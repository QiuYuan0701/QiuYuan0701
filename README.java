package pl.mkrstudio.truefootballnm.objects.schedules;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class For5Teams2Rounds extends Schedule {
    public For5Teams2Rounds() {
        this.schedule = (byte[][][]) Array.newInstance((Class<?>) byte.class, 10, 2, 2);
        addToSchedule(0, 0, 1, 3);
        addToSchedule(0, 1, 4, 2);
        addToSchedule(1, 0, 0, 4);
        addToSchedule(1, 1, 1, 2);
        addToSchedule(2, 0, 2, 0);
        addToSchedule(2, 1, 3, 4);
        addToSchedule(3, 0, 4, 1);
        addToSchedule(3, 1, 0, 3);
        addToSchedule(4, 0, 1, 0);
        addToSchedule(4, 1, 3, 2);

        addToSchedule(5, 0, 3, 1);
        addToSchedule(5, 1, 2, 4);
        addToSchedule(6, 0, 2, 1);
        addToSchedule(6, 1, 4, 0);
        addToSchedule(7, 0, 0, 2);
        addToSchedule(7, 1, 4, 3);
        addToSchedule(8, 0, 1, 4);
        addToSchedule(8, 1, 3, 0);
        addToSchedule(9, 0, 0, 1);
        addToSchedule(9, 1, 2, 3);
    }
}
