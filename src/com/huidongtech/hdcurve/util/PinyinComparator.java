package com.huidongtech.hdcurve.util;

import java.util.Comparator;

import com.huidongtech.hdcurve.model.TB_User;

public class PinyinComparator implements Comparator<TB_User> {

	public int compare(TB_User o1, TB_User o2) {
		if (o1.getSortLetter().equals("@")
				|| o2.getSortLetter().equals("#")) {
			return -1;
		} else if (o1.getSortLetter().equals("#")|| o2.getSortLetter().equals("@")) {
			return 1;
		} else {
			return o1.getSortLetter().compareTo(o2.getSortLetter());
		}
	}

}
