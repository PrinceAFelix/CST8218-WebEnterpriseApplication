/*
 *  Name:                  Prince Adrianne Felix
 *  Student Number:        040933287
 *  Class Name:            JsonColorSerializer 
 *  This class is use to convert color objects to JSON/XML 
 */

package service;

import java.awt.Color;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

public class JsonColorSerializer implements JsonbSerializer<Color>  {
    @Override
    public void serialize(Color c, JsonGenerator jg, SerializationContext ctx) {
        jg.writeStartObject();
        jg.write("red", c.getRed());
        jg.write("green", c.getGreen());
        jg.write("blue", c.getBlue());
        jg.writeEnd();
    }
}