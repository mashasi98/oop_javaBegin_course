package Paterns.Sinleton;

public class TestSingleton {

    public static TestSingleton intanse;

    private TestSingleton(){
    }
    public static TestSingleton getIntanse() {

            if (intanse==null){
                intanse= new TestSingleton();
            }
        return intanse;
    }
}
