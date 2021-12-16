/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.awt.Color;
import javax.faces.component.UIColumn;
import javax.faces.context.FacesContextWrapper;
import jsf.SpriteController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author princ
 */
public class TestColorConverter {
    
    public TestColorConverter() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
     public void testColorConverterObject() {
         //Testing the color converter object
         SpriteController.ColorConverter converter = new SpriteController.ColorConverter();
         Color colorObject;
         colorObject = (Color)converter.getAsObject( //Creating instance of it
                 new FacesContextWrapper(){},
                 new UIColumn(),
                 "#010203");
         assertEquals(colorObject, new Color(1,2,3)); //This will decide if pass or fail
     }
     
     @Test
     public void testColorConverterString() {
         //Testing the color converter string
         SpriteController.ColorConverter converter = new SpriteController.ColorConverter();
         Color colorObject = new Color(1,2,3);
         String colorString;
         colorString = converter.getAsString(//Creating instance of it
                 new FacesContextWrapper(){},
                 new UIColumn(),
                 colorObject);
         
         assertEquals(colorString, "#010203"); //This will decide if pass or fail
     }
}
