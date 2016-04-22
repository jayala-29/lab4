package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @java.lang.Override
    public Temperature toCelsius() {
        return this;
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        float temp = (this.getValue() * 9) / 5 + 32;
        return new Fahrenheit(temp);
    }


    public String toString()
        {
            // TODO: Complete this method
            return this.getValue() + " C";
        }
}
