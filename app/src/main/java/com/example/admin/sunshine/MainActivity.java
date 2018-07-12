package com.example.admin.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Create a field to store the weather display TextView
    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Using findViewById, we get a reference to our TextView from xml. This allows us to
         * do things like set the text of the TextView.
         */
        mWeatherTextView = (TextView)findViewById(R.id.tv_weather_data);

        // Create an array of Strings that contain fake weather data
        /*
         * This String array contains dummy weather data. Later in the course, we're going to get
         * real weather data. For now, we want to get something on the screen as quickly as
         * possible, so we'll display this dummy data.
         */
        String[] dummyWeatherData = {
                "Today, July 12 - Clear - 17°C / 15°C",
                "Tomorrow - Cloudy - 19°C / 15°C",
                "Thursday - Rainy- 30°C / 11°C",
                "Friday - Thunderstorms - 21°C / 9°C",
                "Saturday - Thunderstorms - 16°C / 7°C",
                "Sunday - Rainy - 16°C / 8°C",
                "Monday - Partly Cloudy - 15°C / 10°C",
                "Tue, July 19  - Meatballs - 16°C / 18°C",
                "Wed, July 20 - Cloudy - 19°C / 15°C",
                "Thu, July 21 - Stormy - 30°C / 11°C",
                "Fri, July 22 - Hurricane - 21°C / 9°C",
                "Sat, July 23 - Meteors - 16°C / 7°C",
                "Sun, July 24 - Apocalypse - 16°C / 8°C",
                "Mon, July 25 - Post Apocalypse - 15°C / 10°C",
        };

        // Append each String from the fake weather data array to the TextView
        /*
         * Iterate through the array and append the Strings to the TextView. The reason why we add
         * the "\n\n\n" after the String is to give visual separation between each String in the
         * TextView. Later, we'll learn about a better way to display lists of data.
         */
        for(String dummyWeatherDay: dummyWeatherData){
            mWeatherTextView.append(dummyWeatherDay + "\n\n\n");

        }
    }
}
