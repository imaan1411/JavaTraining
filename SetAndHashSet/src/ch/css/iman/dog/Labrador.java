package ch.css.iman.dog;

public class Labrador extends Dog {

    public Labrador(String name) {
        super(name);
    }

    //it gets an error bc the base class .equals() is final
/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Labrador) {
            String objName = ((Labrador) obj).getName();
            return this.getName().equals(objName);
        }
        return false;

    }
*/

}
