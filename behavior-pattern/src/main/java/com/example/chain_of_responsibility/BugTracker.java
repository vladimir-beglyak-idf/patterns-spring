package com.example.chain_of_responsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier notifierReport = new SimpleReportNotifier(Priority.ROUTINE.getValue());
        Notifier notifierEmail = new EmailNotifier(Priority.IMPORTANT.getValue());
        Notifier notifierSms = new SmsNotifier(Priority.ASAP.getValue());

        notifierReport.setNextNotifier(notifierEmail);
        notifierEmail.setNextNotifier(notifierSms);

        notifierReport.notifyManager("Everything is OK", Priority.ROUTINE.getValue());
        notifierReport.notifyManager("Something went wrong", Priority.IMPORTANT.getValue());
        notifierReport.notifyManager("Houston, we have had a problem", Priority.ASAP.getValue());
    }
}
