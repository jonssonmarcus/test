import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

enum Car {
	 WHITE, BLACK, RED, YELLOW, BLUE;  //; is optional

	 
	}
public  class Hello {

int max = 50;

public void skriv() {
	System.out.println("hello");
}

public void a(Hello2 b) {
	b.max = 133;
}
public static void main(String args[]) {
	int[] aa = new int[3];
	ArrayList al = new ArrayList();
	
	for (int i=0; i<5;i++) {
		if (i == 3) {
			continue;
		}
		System.out.println(i);
	}
	
	int key = 1;
	switch (key) {

	case 0 :
		System.out.println("0");
		break;
	default : {
		System.out.println("default");
	}
	case 2 :
		System.out.println("1");
		break;
	}
	
	Car c = Car.BLACK;
	Hello2 h2 = new Hello2();
	h2.a(h2);
	System.out.println(h2.max);
	

h2.skriv();
	}
}


