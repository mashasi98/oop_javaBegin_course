package Task.ComputerTask;

public class Computer implements IComputer {

    private String name;
    private IMonitor iMonitor;

    public Computer() {
    }

    public Computer(String name, IMonitor iMonitor) {
        this.name = name;
        this.iMonitor = iMonitor;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public IMonitor getMonitor() {
        return iMonitor;
    }
    public void setiMonitor(IMonitor iMonitor) {
        this.iMonitor = iMonitor;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился "+ name+", используется монитор "+iMonitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился "+ getName()+", используется монитор "+getMonitor().getName());
    }
}
