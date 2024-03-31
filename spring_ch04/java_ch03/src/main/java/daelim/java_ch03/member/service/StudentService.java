package daelim.java_ch03.member.service;

import daelim.java_ch03.member.Student;
import daelim.java_ch03.member.dao.StudentDao;

import java.util.Map;

public class StudentService {
    StudentDao studentDao;

    public StudentService (StudentDao studentDao){
        this.studentDao = studentDao;
    }
    public boolean exist(String sNum){
        Student student = studentDao.select(sNum);
        return student != null;
    }
    public void register(Student student){

    }
    public Student select(String sNum){
        if(exist(sNum)){
            studentDao.select(sNum);

        }else
    }
    public Map<String, Student> allSelect(){
        return studentDao.getStudentDB();
    }
    public void modify(Student student){
        if(exist(student.getsNum())){
            studentDao.update(student);

        }else{
            System.out.println("Student informaion is available");
        }
    }
    public void delete(String sNum){
        if(exist(sNum)){
            studentDao.delete(sNum);

        }else{
            System.out.println("Student informaion is available");
        }
    }
}
