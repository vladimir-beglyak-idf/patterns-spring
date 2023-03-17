package com.example.state.activity;

public class TeacherActivityRunner {
    public static void main(String[] args) {
        Activity activity = new Teaching();
        Teacher teacher = new Teacher();
        teacher.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            teacher.doAction();
            teacher.changeActivity();
        }
    }
}
