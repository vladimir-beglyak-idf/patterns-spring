package com.example.strategy.developer;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public String doActivity(){
        return activity.doAction();
    }
}
