package bmnds.zerocode.sample.complexmodel.utils;

import bmnds.zerocode.sample.complexmodel.BrandEnum;

public class BrandRandomizer extends EnumRandomizer<BrandEnum> {

	public static final BrandRandomizer INSTANCE = new BrandRandomizer();

	public BrandRandomizer() {
		super(BrandEnum.class);
	}

}
