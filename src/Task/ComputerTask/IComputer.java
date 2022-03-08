package Task.ComputerTask;

public interface IComputer {

    String getName();
    IMonitor getMonitor();

    void on();
    void off();
}
