package cz.cuni.mff.d3s.jdeeco.analysis.generator.utils;

import java.util.HashMap;

import analysismetamodel.GenericKnowledge;
import analysismetamodel.Knowledge;
import analysismetamodel.NumericKnowledge;

/**
 * Utility for generators.
 */
public class GeneratorUtils {
	/** Returns the analysis build-in implementations of types intervals. */
	public static HashMap<String, String> getDefaultIntervalsImplementors() {
		HashMap<String, String> intervalsImpls = new HashMap<String, String>();
		intervalsImpls.put("java.lang.Integer", "IntegerInterval");
		intervalsImpls.put("java.lang.Double", "DoubleInterval");
		intervalsImpls.put("java.lang.String", "StringInterval");
		
		return intervalsImpls;
	}
	
	/** Returns complete name of a class representing the type of the given knowledge. */
	public static String getKnowledgeType(Knowledge knowledge) {
		if (knowledge instanceof NumericKnowledge) {
			return "java.lang.Double";
		} else {
			return ((GenericKnowledge) knowledge).getType();
		}
	}
}
