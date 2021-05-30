package OOPs.Inheritance;
public class Puppy extends Dog {
private String breed;
private int teethHeight;    

public Puppy(String furColor, int tailLength, String breed, int teethHeight ){
    super(furColor, tailLength);
    this.breed = breed;
    this.teethHeight = teethHeight;
}
public String getbreed() {
    return breed;
}

public void setbreed(String breed) {
    this.breed = breed;
}

public int getteethHeight() {
    return teethHeight;
}

public void setteethHeight(int teethHeight) {
    this.teethHeight = teethHeight;
}
@Override
public String toString() {
return "PUPPY: Breed = " + breed + " Teeth Height = " + teethHeight +  " inches";

}
}

