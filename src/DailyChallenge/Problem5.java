package DailyChallenge;
/*
  cons(a, b) constructs a pair, and car(pair) and cdr(pair)
  returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4))
  returns 4.
  Given this implementation of cons:

def cons(a, b):
    return lambda f : f(a, b)
Implement car and cdr.
 
 */

class Cons{
	int a;
	int b;
	
	Cons(int a,int b){
		this.a = a;
		this.b = b;
	}
}
public class Problem5 {

	public static int car(Cons c){
		return c.a;
	}
	
	public static int cdr(Cons c){
		return c.b;
	}
	
	public static void main(String[] args){
		Cons c = new Cons(1,2);
		System.out.println(car(c));
		System.out.println(cdr(c));
	}
}
