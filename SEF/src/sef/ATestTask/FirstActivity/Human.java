package sef.ATestTask.FirstActivity;

public abstract class Human implements Animal {
    public String getAnimalTypeName(){
        return "Human";
    }

    public abstract void somethingThatAHumanWouldDo();
}
