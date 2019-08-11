import static org.junit.Assert.*;

public class PhoneTest {

    @org.junit.Test
    public void setWeight1() {
        Phone p = new Phone();
        double newWeight = p.setWeight(20.0);
        System.out.println(newWeight);

    }
    @org.junit.Test

    //The returned value is assigned to variable i.e double value
    public void getWeight1() {
        Phone p = new Phone();
       double value = p.getWeight();
       System.out.println(value);
    }
}