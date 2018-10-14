import java.util.Scanner;


class GiaiPhuongTrinhB2{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String []arg){
		float a = GiaiPhuongTrinhB2.scanner.nextFloat();
		float b = GiaiPhuongTrinhB2.scanner.nextFloat();
		float c = GiaiPhuongTrinhB2.scanner.nextFloat();

		float delta= b*b - 4*a*c;

		if(delta < 0){System.out.println("Phuong trinh vo nghiem!");}
		else if(delta == 0){System.out.println("Phuong trinh co nghiem kep "+ (-b/(2*a)));}		
		else{System.out.println("Phuong trinh co 2 nghiem phan biet: "+ (-b - Math.sqrt(delta)/(2*a)) + " va " + (-b+Math.sqrt(delta))/(2*a) );}
	}
}