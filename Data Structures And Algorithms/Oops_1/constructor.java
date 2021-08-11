public class constructor {

    public static class person{

        //Encapsulation- Putting together data members and functions in an entity called 'Class'!
        int age;
        String name;

        void sayshi(){
            
            System.out.println(name+"["+age+"]"+"sayshi");
        }

        //If we forget, java provides our class a default constructor
        person(){


        } 

        person(int age, String name){
            
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        
        person p1 = new person();
        p1.age = 10;
        p1.name = "A";
        p1.sayshi();

        person p2 = new person(20,"B");
        p2.sayshi();
    }
}