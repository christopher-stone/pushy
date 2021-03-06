package dev.chrisstone.pushyalarms;

import android.net.Uri;

public class AlarmModel {

    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    private final boolean[] repeatingDays;
    public long id = -1;
    public int timeHour;
    public int timeMinute;
    public boolean repeatWeekly;
    public Uri alarmTone;
    public String name;
    public boolean isEnabled;

    public AlarmModel() {
        repeatingDays = new boolean[7];
    }

    /**
     * Change the the day to repeat.
     *
     * @param dayOfWeek The day of the week.
     * @param value     True or false.
     */
    public void setRepeatingDay(int dayOfWeek, boolean value) {
        repeatingDays[dayOfWeek] = value;
    }

    public boolean getRepeatingDay(int dayOfWeek) {
        return repeatingDays[dayOfWeek];
    }
}