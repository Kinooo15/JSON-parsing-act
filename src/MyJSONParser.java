/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
// These are import statements for the necessary libraries used in this program


/**
 *
 * @author cazchang
 */
public class MyJSONParser {
    public void parseJSON(String fileName) { // This is the start of the parseJSON method that takes a String parameter called fileName. The method does not return a value
        try {
            JSONParser parser = new JSONParser();
            Object employeesObject = parser.parse(new FileReader(fileName));
            JSONObject employeesJSON = (JSONObject) employeesObject;
            JSONArray employee = (JSONArray) employeesJSON.get("users");
            Iterator itrEmployee = employee.iterator();
            /*
            * This code attempts to read and parse the JSON data from a file specified by fileName. It uses the JSONParser class from the org.json.simple.parser package to parse the JSON data. 
            * After parsing, it extracts a JSONArray called employee from the JSONObject called employeesJSON and gets an Iterator to iterate over the elements of the JSONArray
            */

            System.out.printf("%-40s%-40s%-40s%-40s%-40s\n", "firstName", "lastName", "emailAddress", "phoneNumber", "userID"); // This prints a header line for the employee data that will be output to the console
            while (itrEmployee.hasNext()) {
                Iterator<Map.Entry> itrEmployeeInfo = ((Map) itrEmployee.next()).entrySet().iterator();
                while (itrEmployeeInfo.hasNext()) {
                    Map.Entry employeeInfo = itrEmployeeInfo.next();
                    System.out.printf("%-40s", employeeInfo.getValue());
                }
                System.out.println();
            }
            // This code iterates over each employee object in the JSONArray and prints the values of the fields for each employee object. It does this by iterating over the key-value pairs in each JSONObject that represents an employee and printing the value of each pair.


        } catch (Exception e) {
            e.printStackTrace();
            // This code catches any exceptions that might occur during the parsing process and prints a stack trace if one occurs
        }
    }
}