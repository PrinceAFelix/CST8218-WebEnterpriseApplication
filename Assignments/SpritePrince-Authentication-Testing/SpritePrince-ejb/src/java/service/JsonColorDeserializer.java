/*
 *  Name:                  Prince Adrianne Felix
 *  Student Number:        040933287
 *  Class Name:            JsonColorDeserializer
 *  This class is use to convert color objects to JSON/XML 
 */

package service;

import java.awt.Color;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser.Event;

public class JsonColorDeserializer implements JsonbDeserializer<Color> {
    @Override
    public Color deserialize(javax.json.stream.JsonParser parser, javax.json.bind.serializer.DeserializationContext ctx, 
java.lang.reflect.Type rtType) {
        String keyname = "";  int value = 0; int red = 0; int green = 0; int blue = 0;
        while (parser.hasNext()) {
            Event event = parser.next();
            switch (event) {
                case KEY_NAME: {
                    keyname = parser.getString();
                    break;
                }
                case VALUE_NUMBER: {
                    value = parser.getInt();
                switch (keyname) {
                    case "red":
                        red = value; 
                        break;
                    case "green":
                        green = value;
                        break;
                    case "blue":
                        blue = value;
                        break;
                    default:
                        break;
                }
                    break;
               }
            }
        }   
        return new Color(red,green,blue);
    } 
} 
