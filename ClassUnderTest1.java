public class ClassUnderTest1 {
	public int p(int x, int y){
		while(x>10){
			x = x - 10;
		if((y<20) && (x % 2 ==0))
			y = y + 20;
		else 
			y = y - 20;
		}
		return (2*x + y);
	}
}
