package com.harcyah.kata.projecteuler;

import org.apache.commons.lang3.StringUtils;

public class Problem004 {

	public static void main(String[] args) {

		long max = 0;

		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				long product = i * j;
				String p = String.valueOf(product);
				String q = StringUtils.reverse(p);
				if (p.equals(q) && max <= product) {
					max = product;
				}
			}
		}

		System.out.println(max);

	}

}
