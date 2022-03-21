package com.example.demolibmod1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer {

    public String[] setTimer(int year, int month, int day) {

        long Days, Hours, Minutes, Seconds;
        String system_date = year + "-" + month + "-" + day;
        String[] result = new String[4];

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            // Please here set your event date//YYYY-MM-DD
            Date futureDate = dateFormat.parse(system_date);
            Date currentDate = new Date();
            if (!currentDate.after(futureDate)) {
                long diff = futureDate.getTime()
                        - currentDate.getTime();
                Days = diff / (24 * 60 * 60 * 1000);
                Hours = diff / (60 * 60 * 1000) % 24;
                Minutes = diff / (60 * 1000) % 60;
                Seconds = diff / 1000 % 60;

                result[0] = Long.toString(Days);
                result[1] = Long.toString(Hours);
                result[2] = Long.toString(Minutes);
                result[3] = Long.toString(Seconds);


            } else {
                result[0] = "Null Days";
                result[1] = "Null Hours";
                result[2] = "Null Minutes";
                result[3] = "Null Seconds";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;

    }

}
