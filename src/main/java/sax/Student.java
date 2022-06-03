package sax;

public class Student {
    private String RollNo;
    private String FirstName;
    private String LastName;
    private String NickName;
    private int Marks;

    @Override
    public String toString() {
        return "Student{" +
                "RollNo='" + RollNo + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", NickName='" + NickName + '\'' +
                ", Marks=" + Marks +
                '}';
    }

    public Student(String rollNo, String firstName, String lastName, String nickName, int marks) {
        RollNo = rollNo;
        FirstName = firstName;
        LastName = lastName;
        NickName = nickName;
        Marks = marks;
    }

    public Student() {
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }
}