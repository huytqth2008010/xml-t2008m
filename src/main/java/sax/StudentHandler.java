package sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class StudentHandler extends DefaultHandler {

    private List<Student> students = new ArrayList<>();
    private Student currentStudent;
    private boolean isFirstName = false;
    private boolean isLastName = false;
    private boolean isNickName = false;
    private boolean isMarks = false;

    public List<Student> getStudents(){
        return students;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        System.out.println("Gặp thẻ mở của thẻ: " +qName);
        if (qName.equals("student")){
            currentStudent = new Student();
            String rollNo = attributes.getValue("rollno");
            currentStudent.setRollNo(rollNo);
        }else if (qName.equals("firstname")){
            isFirstName = true;
        }else if (qName.equals("lastname")){
            isLastName = true;
        }else if (qName.equals("nickname")){
            isNickName = true;
        }else if (qName.equals("marks")){
            isMarks = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        System.out.println("Gặp thẻ dong của thẻ: " +qName);
        if (qName.equals("student")){
            students.add(currentStudent);
        }else if (qName.equals("firstname")){
            isFirstName = false;
        }else if (qName.equals("lastname")){
            isLastName = false;
        }else if (qName.equals("nickname")){
            isNickName = false;
        }else if (qName.equals("marks")){
            isMarks = false;
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException{
        String content = new String(ch, start, length);
        if (isFirstName){
            currentStudent.setFirstName(content);
        }else if (isLastName){
            currentStudent.setLastName(content);
        }else if (isNickName){
            currentStudent.setNickName(content);
        }else if (isMarks){
            currentStudent.setMarks(Integer.parseInt(content));
        }
        System.out.println("Đây là nội dung bên trong thẻ: " + new String(ch, start, length));
    }
}
