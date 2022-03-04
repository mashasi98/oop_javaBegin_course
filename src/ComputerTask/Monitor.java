package ComputerTask;

public class Monitor implements IMonitor{
    private String name;

    public Monitor() {
    }

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
