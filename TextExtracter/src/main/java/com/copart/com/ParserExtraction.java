package com.copart.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.xml.sax.SAXException;

import com.copart.AutoDetectParser;
import com.copart.BodyContentHandler;
import com.copart.Metadata;
import com.copart.ParseContext;
import com.copart.Parser;
import com.copart.TikaException;

public class ParserExtraction {
	
public static void main(final String[] args) throws IOException,SAXException, TikaException {

   //Assume sample.txt is in your current directory
   File file = new File(args[0]);
   
   //parse method parameters
   Parser parser = new AutoDetectParser();
   BodyContentHandler handler = new BodyContentHandler();
   Metadata metadata = new Metadata();
   FileInputStream inputstream = new FileInputStream(file);
   ParseContext context = new ParseContext();
   
   //parsing the file
   parser.parse(inputstream, handler, metadata, context);
   System.out.println("File content : " + Handler.toString());
   }
}

