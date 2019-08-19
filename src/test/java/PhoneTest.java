public class PhoneTest {
    public static void main (String args[]) {
        Phone ph = new Phone();
        ph.setWeight(-12.23);  //Assign a negative weight to Phone object
        System.out.println(ph.getWeight());
        ph.setWeight(-77712.23);  //Assign  weight > 1000 to Phone object
        System.out.println(ph.getWeight());
        ph.setWeight(12.23);  //Assign  weight in allowed range
        System.out.println(ph.getWeight());
    }
}