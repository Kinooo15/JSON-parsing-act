/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author cazchang
 */
public class JSONPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyJSONParser myParser = new MyJSONParser(); // This creates a new instance of the MyJSONParser class and assigns it to the myParser variable
        myParser.parseJSON("employees.json"); // This calls the parseJSON method of the MyJSONParser object created in the previous line and passes it the name of a JSON file to parse
    }
    
}
