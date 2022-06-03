package sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.List;

public class SAXParserDemo {
    public static void main(String[] args) {
        try {
            //doc file xml
            File inputFile = new File("input.xml");
            // khoi tao saxparser factory
            SAXParserFactory factory = SAXParserFactory.newInstance();
            // tao sax parser
            SAXParser saxParser = factory.newSAXParser();
            StudentHandler studentHandler = new StudentHandler();
            //par se file xml theo cach parse o tren
            saxParser.parse(inputFile, studentHandler);
            // lay danh sach student
            List<Student> students = studentHandler.getStudents();
            for (int i = 0; i < students.size();i++ ){
                System.out.println(students.get(i).toString());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
