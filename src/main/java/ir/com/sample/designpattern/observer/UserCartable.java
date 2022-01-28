package ir.com.sample.designpattern.observer;


/**
 * Created by Mehrdad on 01/27/2022.
 */
public class UserCartable implements Observer{
    private String userName;

    public UserCartable(String userName,Subject subject) {
        this.userName = userName;
        subject.attach(this);
    }

    public void update(Subject o, Object arg) {
        System.out.println("### Cartable of "+userName+" is updated to [State of Process "+o.toString()+" changed to "+arg.toString()+"]");
    }
}
