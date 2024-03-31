package daelim.java_ch03.member.dao;

import daelim.java_ch03.member.Student;

import java.util.Map;

public class StudentDao {
    private Map<String, Student> studentDB = newHashMap<>();
    public void insert(Student student){
        return studentDB.put(student.setsNum(), student);
    }
    public void select (Student student){
        return studentDB.get(sNum);
    }
    public void update(Student student){
        return studentDB.put(student.getsNum(), student);
    }

    public void delete(String sNum){
        return studentDB.remove(student.getsNum(), student);
    }

}
