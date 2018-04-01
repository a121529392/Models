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
public class Fitbit_HeartrateDetailModel {
    @SerializedName("activities-heart")
    public List<heart> heart; 
    @SerializedName("activities-heart-intraday")
    public heartdetail heartrateDetail;    
    public class heart implements Serializable{
        @SerializedName("dateTime")
        private String dateTime;
        public String getDateTime() {
            return dateTime;
        }
        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }
    }
    public class heartdetail implements Serializable{
        @SerializedName("dataset")
        public List<dataset> dataset;
        @SerializedName("datasetInterval")
        private String datasetInterval;
        @SerializedName("datasetType")
        private String datasetType;
        public String getDatasetInterval() {
            return datasetInterval;
        }
        public void setDatasetInterval(String datasetInterval) {
            this.datasetInterval = datasetInterval;
        }
        public String getDatasetType() {
            return datasetType;
        }
        public void setDatasetType(String datasetType) {
            this.datasetType = datasetType;
        }        
    }    
    public class dataset implements Serializable{
        @SerializedName("time")
        private String time;
        @SerializedName("value")
        private double value;
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
        public double getValue() {
            return value;
        }
        public void setValue(double value) {
            this.value = value;
        }        
    }
}
