package com.example.domowe19a;

public class Calculator{
	
public int calculate(int limit){

if(limit <= 0)
	return 0;

int natural = 0;

int sum = 0;

while(natural < limit){
	if(natural % 3 == 0 || natural % 5 == 0){
		sum += natural;
	}
	natural++;	
}
return sum;
}
}