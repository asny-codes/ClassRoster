package com.sg.classroster;

import com.sg.classroster.controller.ClassRosterController;
import com.sg.classroster.dao.classRosterDao;
import com.sg.classroster.dao.classRosterDaoFileImpl;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOConsoleImpl;
import com.sg.classroster.ui.classRosterView;

public class App {
    public static void main(String[] args) {
        //ClassRosterController controller = new ClassRosterController();
        //controller.run();
        UserIO myIo = new UserIOConsoleImpl();
        classRosterView myView = new classRosterView(myIo);
        classRosterDao myDao = new classRosterDaoFileImpl();
        ClassRosterController controller =
                new ClassRosterController(myDao, myView);
        controller.run();
    }
}
