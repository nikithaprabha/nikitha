package com.showroom.showroomApp;




import com.showroom.showroomApp.showroom.Showroom;
import com.showroom.showroomApp.staff.Staff;
import com.showroom.showroomApp.manager.Manager;

public class ShowroomRunner {
    public static void main(String[] args) {
        System.out.println("main started");


        Manager manager = new Manager();
        manager.managerId = 1;
        manager.managerName = "John Doe";
        manager.showroomLocation = "Koramangala";


        Staff staff1 = new Staff();
        staff1.staffId = 101;
        staff1.staffName = "Alice Smith";
        staff1.role = "Sales Associate";
        staff1.showroomLocation = "Koramangala";

        Staff staff2 = new Staff();
        staff2.staffId = 102;
        staff2.staffName = "Bob Johnson";
        staff2.role = "Customer Support";
        staff2.showroomLocation = "Koramangala";


        Staff[] staffArray = {staff1, staff2};


        Showroom showroom = new Showroom();
        showroom.showroomId = 1;
        showroom.showroomLocation = "Koramangala";
        showroom.manager = manager;
        showroom.staff = staffArray;


        showroom.display();

        System.out.println("main ended");
    }
}
