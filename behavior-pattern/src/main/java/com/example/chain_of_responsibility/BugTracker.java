package com.example.chain_of_responsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier notifierReport = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier notifierEmail = new EmailNotifier(Priority.IMPORTANT);
        Notifier notifierSms = new SmsNotifier(Priority.ASAP);

        notifierReport.setNextNotifier(notifierEmail);
        notifierEmail.setNextNotifier(notifierSms);

        notifierReport.notifyManager("Everything is OK", Priority.ROUTINE);
        notifierReport.notifyManager("Something went wrong", Priority.IMPORTANT);
        notifierReport.notifyManager("Houston, we have had a problem", Priority.ASAP);
    }
}
