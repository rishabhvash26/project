/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author mca
 */
public class Posist {
Date timestamp;
        String data;
               static int nodeNumber;
        int nodeId;
        
        String childReferenceNodeId;
        String genesisReferenceNodeId;
        String hashValue;


    public Posist(Date timestamp, String data, String childReferenceNodeId, String genesisReferenceNodeId, String hashValue, String referenceNodeId) {
        this.timestamp = timestamp;
        this.data = data;
        Posist.nodeNumber = nodeNumber++ ;
        this.childReferenceNodeId = childReferenceNodeId;
        this.genesisReferenceNodeId = genesisReferenceNodeId;
        this.hashValue = hashValue;
        this.referenceNodeId = referenceNodeId;
        this.nodeId=this.hashCode();
    }

    public void setChildReferenceNodeId(String childReferenceNodeId) {
        this.childReferenceNodeId = childReferenceNodeId;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setGenesisReferenceNodeId(String genesisReferenceNodeId) {
        this.genesisReferenceNodeId = genesisReferenceNodeId;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    

    public void setNodeNumber(int nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    public void setReferenceNodeId(String referenceNodeId) {
        this.referenceNodeId = referenceNodeId;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
        String referenceNodeId;

    public String getChildReferenceNodeId() {
        return childReferenceNodeId;
    }

    public String getData() {
        return data;
    }

    public String getGenesisReferenceNodeId() {
        return genesisReferenceNodeId;
    }

    public String getHashValue() {
        return hashValue;
    }

    public int getNodeId() {
        return nodeId;
    }

    public int getNodeNumber() {
        return nodeNumber;
    }

    public String getReferenceNodeId() {
        return referenceNodeId;
    }

    public Date getTimestamp() {
        return timestamp;
    }
        
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList arraylist=new ArrayList();
        
        // TODO code application logic here
    }
      public String getTodaysDay(String dayFormat, TimeZone timeZone)
  {
      Date date = new Date();
      /* Specifying the format */
      DateFormat requiredFormat = new SimpleDateFormat(dayFormat);
      /* Setting the Timezone */
      requiredFormat.setTimeZone(timeZone);
      /* Picking the day value in the required Format */
      String strCurrentDay = requiredFormat.format(date).toUpperCase();
      return strCurrentDay;
   }

   /**
    * Description - Method to Get Current time
    * @author Chaitanya
    * @param dateFormat
    * @param TimeZone
    */
   public String getCurrentTime(String timeFormat, TimeZone timeZone)
   {
      /* Specifying the format */ 
      DateFormat dateFormat = new SimpleDateFormat(timeFormat);
      /* Setting the Timezone */
      Calendar cal = Calendar.getInstance(timeZone);
      dateFormat.setTimeZone(cal.getTimeZone());
      /* Picking the time value in the required Format */
      String currentTime = dateFormat.format(cal.getTime());
      return currentTime;
   }

   /**
    * Description - Method to Get Today's date
    * @author Chaitanya
    * @param dateFormat
    * @param TimeZone
    */
   public String getTodayDate(String dateFormat, TimeZone timeZone)
   {
       Date todayDate = new Date();
       /* Specifying the format */
       DateFormat todayDateFormat = new SimpleDateFormat(dateFormat);
       /* Setting the Timezone */
       todayDateFormat.setTimeZone(timeZone);
       /* Picking the date value in the required Format */
       String strTodayDate = todayDateFormat.format(todayDate);
       return strTodayDate;
   }

}
class data{
    int ownerId;
    int value;
    String OwnerName;
    String hash;

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public String getHash() {
        return hash;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getValue() {
        return value;
    }
}
