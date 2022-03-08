package TaskPrinter;

public interface IPrinter {

    int getPaintVolume();
    void print(String text);
    void charge(int chargeVolume);
}
