/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author preranagireesh
 */
/**
 *DateFormatter Utility class which contains date manipulation methods used in different places of the project.
 *
 */
public class DateFormatter {
    
    /**
     * Method to parse String to Date format.
     * @param startDate
     * @return
     * @throws ParseException 
     */
    public static Date convertToDate(String startDate) throws ParseException {
        Date date = new SimpleDateFormat("MM-dd-yyyy").parse(startDate);
        return date;
    }
    
    /**
     * Method which takes Date as parameter and converts it to String to be displayed on the UI.
     * @param date
     * @return 
     */
    public static String getDateString(Date date) {
        if(date == null)
            return "";
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        return dateFormat.format(date);
    }
    
}
