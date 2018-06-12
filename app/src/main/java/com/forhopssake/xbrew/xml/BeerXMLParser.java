package com.forhopssake.xbrew.xml;

import android.util.Xml;

import com.forhopssake.xbrew.data.impl.Recipe;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BeerXMLParser {

    //https://developer.android.com/training/basics/network-ops/xml

    private Logger logger = Logger.getLogger(BeerXMLParser.class.getName());
    private static final String namespace = null;


    // TODO: better exceptions
    public List parseBeerXML(InputStream in) throws Exception{
        XmlPullParser parser = Xml.newPullParser();
        try {
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in,null);
            parser.nextTag();
            return readRecipes(parser);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error parsing input stream");
        }
    }

    private List readRecipes(XmlPullParser parser) throws IOException, XmlPullParserException {
        List<Recipe> recipes = new ArrayList<>();
        parser.require(XmlPullParser.START_TAG, namespace, "RECIPES");
        while(parser.next() != XmlPullParser.END_TAG) {

            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            // Starts by looking for the recipe tag
            if (name.equals("RECIPE")) {
                recipes.add(readRecipe(parser));
            } else {
                logger.log(Level.SEVERE,"No recipes found");
            }
        }
        return recipes;
        
    }

    private Recipe readRecipe(XmlPullParser parser) throws XmlPullParserException, IOException{
        parser.require(XmlPullParser.START_TAG, namespace, "RECIPE");
        String name;
        while(parser.next() != XmlPullParser.END_TAG) {

            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            // Starts by looking for the entry tag
            if (name.equals("NAME")) {
                name = parser.getText();
            } else {
                skip(parser);
            }
        }
        Recipe recipe = new Recipe(name);
    }

    private void skip(XmlPullParser parser) {
        logger.warning("Found unsupported tag " + parser.getName());
    }

}