package com.jb.T00CodingExercises;
public class C15WeatherAdviser {
    public String provideWeatherAdvisory(int temperature) 
    {
        if(temperature<0)
        {
            return "It's freezing! Wear a heavy coat.";
        }
        else if(temperature>=0 && temperature <=10)
        {
            return"It's cold! Bundle up.";
        }
        else if(temperature>=11 && temperature <=20)
        {
            return"It's cool! A light jacket will do.";
        }
        else return "It's warm! Enjoy the day.";
    }
    public static void main(String[] args) {
        C15WeatherAdviser c15WeatherAdviser=new C15WeatherAdviser();
        System.out.println(c15WeatherAdviser.provideWeatherAdvisory(11));
    }
}
//It's cool! A light jacket will do.