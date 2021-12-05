package Driver;
import HrDepartment.*;
import AdminDepartment.*;
import TechDepartment.*;

public class mainClass{

    public static void main(String args[]){
        //Create objects
        adminDepartmentClass adminObj =  new adminDepartmentClass();
        hrDepartmentClass hrObj =  new hrDepartmentClass();
        techDepartmentcClass techObj = new techDepartmentcClass();

        //Admin department functionality
        System.out.println("Welcome to "+adminObj.departmentName());
        System.out.println(adminObj.getTodaysWork());
        System.out.println(adminObj.getWorkDeadline());
        System.out.println(adminObj.isTodayAHoliday());
        System.out.println();

        //Hr department functionality
        System.out.println("Welcome to " +hrObj.departmentName());
        System.out.println(hrObj.doActivity());
        System.out.println(hrObj.getTodaysWork());
        System.out.println(hrObj.getWorkDeadline());
        System.out.println(hrObj.isTodayAHoliday());
        System.out.println();

        //Tech department functionality
        System.out.println("Welcome to " + techObj.departmentName());
        System.out.println(techObj.getTodaysWork());
        System.out.println(techObj.getWorkDeadline());
        System.out.println(techObj.getTechStackInformation());
        System.out.println(techObj.isTodayAHoliday());
        
    }
}