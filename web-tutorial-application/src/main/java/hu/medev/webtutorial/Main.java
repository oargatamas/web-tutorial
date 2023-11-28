package hu.medev.webtutorial;

public class Main {

    //Property ( static / dynamic )

    //Method ( static / dynamic )

    public static void main(String[] args){
        SampleObject object1 = new SampleObject(1);
        SampleObject object2 = new SampleObject(2);
        System.out.println(object1.printObject());
        System.out.println(object2.printObject());

        System.out.println(SampleObject.printStaticObject());

        object1.arrayParams(new String[]{"egy", "kettő"});

        object1.dotParams("egy", "kettő");
    }

}
