package devdreamers.dev.forecastapp.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jlcs on 5/1/16.
 */
public class WeatherDataParser {

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here
        JSONObject mObject = new JSONObject(weatherJsonStr);
        JSONArray mArray  = mObject.getJSONArray("list");
        JSONObject weather = mArray.getJSONObject(dayIndex);
        JSONObject daily   = weather.getJSONObject("temp");
        return daily.getDouble("max");
    }

}