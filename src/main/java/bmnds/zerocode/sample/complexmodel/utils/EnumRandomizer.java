package bmnds.zerocode.sample.complexmodel.utils;

import java.util.Random;

abstract class EnumRandomizer<E extends Enum<?>> {

	private final E[] VALUES;
	private final Random RND;

	EnumRandomizer(Class<E> clazz) {
		VALUES = clazz.getEnumConstants();
		RND = new Random();
	}

	E randomize() {
		return VALUES[RND.nextInt(VALUES.length)];
	}

}
