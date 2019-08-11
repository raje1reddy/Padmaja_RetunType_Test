import static org.junit.Assert.*;

public class PhoneTest {

    @org.junit.Test
    public void setWeight1() {
        Phone p = new Phone();
        double newWeight = p.setWeight(20.0);
        System.out.println(newWeight);

    }
    @org.junit.Test
    //no method parameter is passed so no value  will be returned
    public void getWeight1() {
        Phone p = new Phone();
        p.getWeight();
    }
}