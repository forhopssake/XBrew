package com.forhopssake.xbrew;


import android.support.test.runner.AndroidJUnit4;

import com.forhopssake.xbrew.data.impl.Recipe;
import com.forhopssake.xbrew.xml.BeerXMLParser;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(AndroidJUnit4.class)
public class TestBeerXMLParser {
    private String mangoLassi = "MangoLassiIPA.xml";
    // Context of the app under test.

    @Test
    public void testParser() {

        try {
            File file = getFileFromPath(this,mangoLassi);
            assertNotNull(file);
            InputStream inputStream = new FileInputStream(file);
            BeerXMLParser parser = new BeerXMLParser();
            List<Recipe> recipes = parser.parseBeerXML(inputStream);
            assertTrue(recipes.size() == 1);
            Recipe recipe = recipes.get(0);
            String name = recipe.getName();
        } catch (Exception e) {
            TestCase.fail(e.getMessage());
        }
    }

    private static File getFileFromPath(Object obj, String fileName) {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        return new File(resource.getPath());
//        File file = new File("src/test/res/" + fileName);
//        return file;
    }

}
