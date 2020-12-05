public class Parent extends Grandparent{
    public Parent() {
        super();
        System.out.println("Hello I am Parent");
    }

    public void NameOfPerson(String name){
        System.out.println("Hello my name is "+name+"\tI am parent");
    }

    public void PlaceOfStay(String name){
        System.out.println("We live in "+name);
    }
}
