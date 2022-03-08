package Task.TaskPrinter;

public class Printer implements IPrinter{


    private int paintVolume;

    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    @Override
    public int getPaintVolume() {
        return paintVolume;
    }

    public void setPaintVolume(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    @Override
    public void print(String text) {
        System.out.println( "На печать отправлен текст:"+text+" , длина: "+text.length());
        if (text.length()<paintVolume){

            paintVolume-=text.length();
            System.out.println( "Текст распечатан:"+text+" ,  у принтера осталось краски: "+paintVolume);
        }else {

            System.out.println( "Не хватило краски: "+(text.length()-paintVolume)+" (всего краски в принтере "+paintVolume+")");
        }

    }

    @Override
    public void charge(int chargeVolume) {
        paintVolume+=chargeVolume;
        System.out.println( "Принтер пополнен на длину текста "+chargeVolume+"(всего краски в принтере: "+paintVolume+")");

    }
}
