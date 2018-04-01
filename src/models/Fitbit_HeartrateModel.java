/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yang
 */
public class Fitbit_HeartrateModel {
    @SerializedName("activities-heart")
    public List<heart> heart; 
    public class heart implements Serializable{
        @SerializedName("dateTime")
        private String dateTime;
        @SerializedName("value")
        public ValueType value;        
        public String getDateTime() {
            return dateTime;
        }
        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }
    }
    public class ValueType implements Serializable{
        @SerializedName("heartRateZones")
        public List<heartrate> heartRateZones;
    }
    public class heartrate implements Serializable{
        @SerializedName("caloriesOut")  
        private double caloriesOut;
        @SerializedName("max")
        private int max;
        @SerializedName("min")
        private int min;
        @SerializedName("minutes")
        private String minutes;
        @SerializedName("name")
        private String name;
        public double getCaloriesOut() {
            return caloriesOut;
        }
        public void setCaloriesOut(double caloriesOut) {
            this.caloriesOut = caloriesOut;
        }
         public int getMax() {
            return max;
        }
        public void setMax(int max) {
            this.max = max;
        }
        public int getMin() {
            return min;
        }
        public void setMin(int min) {
            this.min = min;
        }
        public String getMinutes() {
            return minutes;
        }
        public void setMinutes(String minutes) {
            this.minutes = minutes;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
