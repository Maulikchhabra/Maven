package pkg2;
import pkg1.*;



public class Myclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Myclass1 ob1 = new Myclass1();
        Myclass2  ob2 = new Myclass2();
        System.out.println("sum ="+ob1.sum(4, 2));
        System.out.println("sub ="+ob1.sub(4, 2));
        System.out.println("mul ="+ob2.mul(4, 2));
        System.out.println("div ="+ob2.div(4, 2));
        
	}

}
