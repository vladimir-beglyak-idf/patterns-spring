package com.example.state.activity;

public class Teacher {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Teaching) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Teaching());
        }
    }

    public void doAction(){
        activity.doAction();
    }
}
