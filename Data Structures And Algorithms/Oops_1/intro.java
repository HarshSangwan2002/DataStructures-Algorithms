public class intro {

    public static class person{

        //Encapsulation- Putting together data members and functions in an entity called 'Class'!
        int age;
        String name;

        void sayshi(){
            
            System.out.println(name+"["+age+"]"+"sayshi");
        }
    }

    public static void main(String[] args) {
        
        person p1 = new person();
        p1.age = 10;
        p1.name = "A";
        p1.sayshi();

        person p2 = new person();
        p2.age = 20;
        p2.name = "B";
        p2.sayshi();

        person p3 = p1;
        p3.sayshi();
        p1.sayshi();
        
    }
}