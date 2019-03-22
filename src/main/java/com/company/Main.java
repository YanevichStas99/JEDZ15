package com.company;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.IOException;

public class Main {
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

    public static void main(String[] args) {
        String string = null;
        try {
            string = FileUtils.readFileToString(new File("Group.xml"), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(string);

        JSONObject jsonObject = XML.toJSONObject(string);
        String jsonPrettyPrintString = jsonObject.toString(PRETTY_PRINT_INDENT_FACTOR);
        System.out.println(jsonPrettyPrintString);
        try {
            FileUtils.writeStringToFile(new File("Group.json"), jsonPrettyPrintString, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
