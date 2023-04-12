package Payloads;

public class bodyPayload {

    public String addPlace(){

        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"super house\",\n" +
                "  \"phone_number\": \"(+91) 8770323652\",\n" +
                "  \"address\": \"master colony bellaguntha\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"India-IN\"\n" +
                "}\n";

    }
    public String updatePlace(String place_id){
        return "{\n" +
                "\"place_id”:”"+place_id+"”\",\n" +
                "\"address\":\"patarapalli\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}";
    }
    public String jsonPathMethodsPayload(){
        return "{\n" +
                "\n" +
                "\"dashboard\": {\n" +
                "\n" +
                "\"purchaseAmount\": 910,\n" +
                "\n" +
                "\"website\": \"rahulshettyacademy.com\"\n" +
                "\n" +
                "},\n" +
                "\n" +
                "\"courses\": [\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"Selenium Python\",\n" +
                "\n" +
                "\"price\": 50,\n" +
                "\n" +
                "\"copies\": 6\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"Cypress\",\n" +
                "\n" +
                "\"price\": 40,\n" +
                "\n" +
                "\"copies\": 4\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"RPA\",\n" +
                "\n" +
                "\"price\": 45,\n" +
                "\n" +
                "\"copies\": 10\n" +
                "\n" +
                "}\n" +
                "\n" +
                "]\n" +
                "\n" +
                "}\n" +
                "\n";
    }
}
//{
//
//        "dashboard": {
//
//        "purchaseAmount": 910,
//
//        "website": "rahulshettyacademy.com"
//
//        },
//
//        "courses": [
//
//        {
//
//        "title": "Selenium Python",
//
//        "price": 50,
//
//        "copies": 6
//
//        },
//
//        {
//
//        "title": "Cypress",
//
//        "price": 40,
//
//        "copies": 4
//
//        },
//
//        {
//
//        "title": "RPA",
//
//        "price": 45,
//
//        "copies": 10
//
//        }
//
//        ]
//
//        }
//
//
//
//        1. Print No of courses returned by API
//
//        2.Print Purchase Amount
//
//        3. Print Title of the first course
//
//        4. Print All course titles and their respective Prices
//
//        5. Print no of copies sold by RPA Course
//
//        6. Verify if Sum of all Course prices matches with Purchase Amount
