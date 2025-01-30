package CollectionConcept;


import java.util.Random;


public class orderStatus {
	public void orderCreated() {

		System.out.println("order has been created Naveen ....");
		System.out.println("order has been created again by Naveen and anu....") ;


	}
	public int ordernumberGenerated(){
 		 Random random = new Random();
 		 int r1 = random.nextInt();
  	      System.out.println("Random integer: " + r1);
  		return r1;

		}


	public void OrderAddconfirm(){
		 System.out.println("orderadd confirmation") ; 	}
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
