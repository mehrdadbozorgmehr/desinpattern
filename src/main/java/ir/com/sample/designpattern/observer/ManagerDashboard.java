package ir.com.sample.designpattern.observer;


/**
 * Created by Mehrdad on 01/27/2022.
 */
public class ManagerDashboard implements Observer{
    private String userName;

    public ManagerDashboard(String userName, Subject subject) {
        this.userName = userName;
        subject.attach(this);
    }

    public void update(Subject o, Object arg) {
        System.out.println("$$$ Dashboard of : "+userName+" is updated to "+arg.toString()+" state!");
    }
}
