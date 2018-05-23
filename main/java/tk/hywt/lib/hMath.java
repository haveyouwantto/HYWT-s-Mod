package tk.hywt.lib;

import java.util.Random;

public class hMath {
public static int GetRandomNumber(int a) {
	Random rand = new Random();
	return rand.nextInt(a) + 1;
}}
