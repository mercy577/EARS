package org.um.feri.ears.problems.unconstrained.cec2014;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.um.feri.ears.problems.unconstrained.cec.Functions;

public class F3 extends CEC2014 {
	
	public F3(int d) {
		super(d,3);

		name = "F03 Discus Function";
	}

	@Override
	public double eval(Double[] ds) {
		return eval(ArrayUtils.toPrimitive(ds));
	}
	
	public double eval(double x[]) {
		double F;
		F = Functions.discus_func(x,numberOfDimensions,OShift,M,1,1);
		F+=300.0;
		return F;
	}

}