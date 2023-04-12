package basics;

import Payloads.bodyPayload;
import groovy.json.JsonOutput;
import io.restassured.path.json.JsonPath;

public class JsonpathMethods {
    public static void main(String[] args) {
        bodyPayload bodaypayload = new bodyPayload();

        JsonPath js = new JsonPath(bodaypayload.jsonPathMethodsPayload());

        //1 find the number of courses as integer
        System.out.println("1 find the number of courses as integer");
       int  noOfCourse = js.getInt("courses.size()");
        System.out.println("no of courses found from response get is :->"+noOfCourse);

        //2 print purchase amount
        System.out.println("//2 print purchase amount");
        int purchaseAmout = js.getInt("dashboard.purchaseAmount");
        System.out.println("purchaseAmout is :->"+purchaseAmout);

        //3 print title of first course
        System.out.println("//3 print title of first course");
        String firstCourseTitle = js.getString("courses[0].title");
        System.out.println("firstCourseTitle is :->"+firstCourseTitle);

        //4. Print All course titles and their respective Prices
        System.out.println();
        System.out.println("//Print All course titles and their respective Prices");
        for(int i = 0;i<js.getInt("courses.size()");i++){
            System.out.println(js.getString("courses["+i+"]"+".title")+" "+":>"+js.getString("courses["+i+"]"+".price"));
        }
        //5. Print no of copies sold by RPA Course
        System.out.println();
        System.out.println(" //5. Print no of copies sold by RPA Course");
        for(int i = 0;i<js.getInt("courses.size()");i++){
           String getTitleOfCourse = js.getString("courses["+i+"]"+".title");
           if(getTitleOfCourse.equalsIgnoreCase("RPA")){
               System.out.println("The price of rca course is "+js.getString("courses["+i+"]"+".price"));
               break;
           }
        }

       // 6. Verify if Sum of all Course prices matches with Purchase Amount
        System.out.println();
        System.out.println("// 6. Verify if Sum of all Course prices matches with Purchase Amount");
        int sumOfCourse = 0;
        for(int i = 0;i<js.getInt("courses.size()");i++){
               int temp = js.getInt("courses["+i+"]"+".price")*js.getInt("courses["+i+"]"+".copies");
               sumOfCourse+=temp;
        }
        if(sumOfCourse==js.getInt("dashboard.purchaseAmount")){
            System.out.println("your purchase amount is : ->"+js.getInt("dashboard.purchaseAmount"));
            System.out.println("your sum of couse is :>"+sumOfCourse);
            System.out.println("Your purchase amout is same");
        }
        else {
            System.out.println("your purchase amount is : ->"+js.getInt("dashboard.purchaseAmount"));
            System.out.println("your sum of couse is :>"+sumOfCourse);
            System.out.println("Your purchase amout is not same");
        }



    }
}
