package GeeksForGeeks;

class Point{
	int x;
	int y;
	Point (int x,int y){
		this.x = x;
		this.y = y;
	}
}
public class RectangleOverlap {

	public static void main(String[] args){
		Point l1 = new Point(0, 10), r1 = new Point(10, 0);
	    Point l2 = new Point(5, 5), r2 = new Point(15, 0);
	    if (doOverlap(l1, r1, l2, r2))
	    	System.out.println("Rectangles Overlap");
	    else
	    	System.out.println("Rectangles do not Overlap");
	}
	
	static boolean doOverlap(Point l1, Point r1, Point l2, Point r2){
		if((l1.x <= l2.x || r1.x <= r2.x) && (l1.y<= l2.y || r1.y <= r2.y))
			return true;
			
		return false;
	}
}
