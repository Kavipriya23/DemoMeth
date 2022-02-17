package demmetho1;
public class Demethcall {
	        int val=150;
			int operation(int val) {
				val =val*10/100;
				return(val);
			}
			public static void main(String args[]) {
				Demethcall c = new Demethcall();
				System.out.println("Before operation value of data is "+c.val);
				c.operation(10);
				System.out.println("After operation value of data is "+c.val);
				}
			}


