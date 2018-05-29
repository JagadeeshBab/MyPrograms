package com.java.object_class;

public class SplitTest {

	public static void main(String[] args) {

		String cell = "ironman/infinitywar/captain america/spiderman/black panther/antman/superman";
		String[] str = cell.split("/");

		System.out.println(str); // [Ljava.lang.String;@70dea4e
		int acount = 0, mcount = 0;

		for (String s : str) {
			System.out.println(s);

			char[] cha = s.toCharArray();
			System.out.println(cha);

			for (char ch : cha) {
				// System.out.println(c);

				if (ch == 'a')
					acount++;

				else if (ch == 'm')
					mcount++;
			}
		}
		System.out.println(acount); // 12
		System.out.println(mcount); // 5
	}

}
