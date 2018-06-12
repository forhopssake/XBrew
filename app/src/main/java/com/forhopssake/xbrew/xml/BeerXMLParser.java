package com.forhopssake.xbrew.xml;

import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BeerXMLParser {
    private Logger logger = Logger.getLogger(BeerXMLParser.class.getName());
    private static final String namespace = null;


    // TODO: better excpetions
    public List parseBeerXML(InputStream in) throws Exception{
        XmlPullParser parser = Xml.newPullParser();
        try {
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in,null);
            parser.nextTag();
            return readStream(parser);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error parsing input stream");
        }
    }

    private List readStream(XmlPullParser parser) throws IOException, XmlPullParserException {
        List entries = new ArrayList();
        parser.require(XmlPullParser.START_TAG,, namespace, "feed");
        while(parser.next() != XmlPullParser.END_TAG);
        
    }
}
