package Recursion;
import java.util.*;
import java.io.*;

public class TowerofHanoi {
	 public static void Hanoi(int n, String src, String helper, String Dest) {
		if(n==1) {
			System.out.println("Disk "+n+" transfer from "+src+" to "+Dest);
			return;
		}
		
		Hanoi(n-1,src,Dest,helper);
		System.out.println("Disk "+n+" transfer from "+src+" to "+Dest);
		Hanoi((n-1),helper,src,Dest);
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number of disk you want");
		int n = read.nextInt();
		Hanoi(n,"S","H","D");

	}

}
