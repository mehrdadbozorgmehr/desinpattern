package ir.com.sample.designpattern.observer;

/**
 * Created by Mehrdad on 01/27/2022.
 */
public class ObserverTest {
    public static void main(String[] args) {
        BusinessProcess itemRequestBP = new BusinessProcess("Item Request", new ProcessState[]{ProcessState.INITIATED,ProcessState.CONFIRMED,ProcessState.PROCESSED,ProcessState.DELIVERED,ProcessState.ENDED});
        UserCartable mehrdadCartable = new UserCartable("Mehrdad",itemRequestBP);
        UserCartable moradiCartable = new UserCartable("Moradi",itemRequestBP);
        ManagerDashboard yazdaniDashboard = new ManagerDashboard("Yazdani",itemRequestBP);
        itemRequestBP.startProcess();
    }
}
