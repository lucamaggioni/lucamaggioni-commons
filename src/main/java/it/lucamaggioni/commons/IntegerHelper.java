package it.lucamaggioni.commons;

public class IntegerHelper {

	public static Integer quantize(Integer value,Integer quantum) {
		return 
				new Integer(
					(int)(
						Math.round(
							(new Double(value)).doubleValue()/quantum.intValue()
						) * quantum.intValue()
					)
				) ;
	}

}
