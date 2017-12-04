package android.coolweather.com.coolweather.gson;

/**
 * Created by Yvan on 2017/12/4.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
