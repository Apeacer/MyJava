package com.poj.id1001.copy;

//Description
//
//对数值很大、精度很高的数进行高精度计算是一类十分常见的问题。比如，对国债进行计算就是属于这类问题。 
//
//现在要你解决的问题是：对一个实数R( 0.0 < R < 99.999 )，要求写程序精确计算 R 的 n 次方(Rn)，其中n 是整数并且 0 < n <= 25。
//Input
//
//T输入包括多组 R 和 n。 R 的值占第 1 到第 6 列，n 的值占第 8 和第 9 列。
//Output
//
//对于每组输入，要求输出一行，该行包含精确的 R 的 n 次方。输出需要去掉前导的 0 后不要的 0 。如果输出是整数，不要输出小数点。
//Sample Input
//
//95.123 12
//0.4321 20
//5.1234 15
//6.7592  9
//98.999 10
//1.0100 12
//Sample Output
//
//548815620517731830194541.899025343415715973535967221869852721
//.00000005148554641076956121994511276767154838481760200726351203835429763013462401
//43992025569.928573701266488041146654993318703707511666295476720493953024
//29448126.764121021618164430206909037173276672
//90429072743629540498.107596019456651774561044010001
//1.126825030131969720661201

import java.math.BigDecimal;
import java.util.Scanner;

public class Main 
{
	public static void main(String []arg)
	{
		Scanner scanner=new Scanner(System.in);
		
		while(scanner.hasNext())
		{
			
			BigDecimal big_a=scanner.nextBigDecimal();
			int n=scanner.nextInt();
			
			BigDecimal big_r=big_a.pow(n).stripTrailingZeros();//去点后0
			String result=big_r.toPlainString();//非指数显示
			if(result.charAt(0)=='0')
			{
				result=result.substring(1);
			}
			
			System.out.println(result);
			
		}
	}
}
