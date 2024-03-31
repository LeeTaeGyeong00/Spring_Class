package daelim.java_ch03.member.service;

import daelim.java_ch03.member.Student;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintStudentInformationService {
    StudentService studentService;
    public PrintStudentInformaionService(StudentService studentService){
        this.studentService = studentService;
    }

    public void printStudentInfo(){
        Map<String, Student> allStudent = studentService.allSelect();
        Set<String> keys = allStudent.keySet();
        Iterator<String> iterator = keys.iterator();
        System.out.println("STUDENT LIST start ==============>");
        while (iterator.hasNext()){
            String key = iterator.next();
            Student student = allStudent.get(key);
            System.out.println("sNum : " + student.getsNum());
            System.out.println("sId : " + student.getsId());
            System.out.println("sName : " + student.getsName());
        }
        System.out.println("End ==============================");
    }
}
