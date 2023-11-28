package hu.medev.webtutorial;

public class SampleObject {

    private int id;

    public static final int RANDOM_ID = 4;

    public SampleObject(int id){
        this.id = id;
    }

    public void dotParams(String... args){
        String first = args[0];
    }


    public void arrayParams(String[] args){
        String first = args[0];
    }

    public String printObject(){
        return "SampleObject#" + this.id;
    }

    public static String printStaticObject(){
        return "SampleObject#" + RANDOM_ID;
    }

}
