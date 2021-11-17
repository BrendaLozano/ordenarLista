package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
	    int [] a  = {1,2,8,44,9,26,3,7,33,1,93,417,19,27,14,11,30,4};
	    int temporal = 0;

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 1; j < (a.length - i); j++) {
	            if (a[j - 1] < a[j]) {
	                temporal = a[j - 1];
	                a[j - 1] = a[j];
	                a[j] = temporal;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(a));
	}

}
