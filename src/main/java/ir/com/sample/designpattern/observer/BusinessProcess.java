package ir.com.sample.designpattern.observer;


/**
 * Created by Mehrdad on 01/27/2022.
 */
public class BusinessProcess extends Subject {
    private String name;
    private ProcessState[] processStates;
    private int nodeIndex = 0;
    private ProcessState currentState;
    public BusinessProcess(String name,ProcessState[] processStates)
    {
        this.processStates = processStates;
        this.name = name;
    }
    public void startProcess(){
        processNode();
    }
    void processNode(){
        currentState = processStates[nodeIndex++];
        System.out.println("@ State of process "+name+" changed to "+currentState.toString());
        notifyAllObservers(currentState);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (nodeIndex<processStates.length) processNode();
    }

    @Override
    public String toString() {
        return name;
    }
}
