package cz.cuni.mff.d3s.jdeeco.analysis.generator.utils;

import java.util.Collection;

/**
 * Utility for manipulation with strings.
 */
public class StringUtils {
	/**
	 * Replaces each entry in format {{i}} in the input string with value from i-th index of the
	 * replacements array. Final string is returned as the result.
	 * @param input Input text to be replaced.
	 * @param replacements Array of replacements.
	 */
	public static String replace(String input, Object... replacements) {
		
		String result = input;
		for(int i = 0; i < replacements.length; ++i) {
			result = result.replace("{{"+i+"}}", replacements[i].toString());
		}
		
		return result;
	}
	
	/**
	 * Returns string in which all entries of the array are joined with comma.
	 * @param array Array of string to be joined together.
	 * @param separator The separator of entries.
	 */
	public static String joinWithComma(Object[] array) {
		String delim = "";
		StringBuilder sb = new StringBuilder();
		for (Object item : array) {
		    sb.append(delim).append(item);
		    delim = ", ";
		}
		
		return sb.toString();
	}
	
	/**
	 * Return string where each line is indented with a given indentation string.
	 * @param lines Collection of lines of the final string.
	 */
	public static String buildIndentedString(String indent, Collection<String> lines) {
		StringBuilder sb = new StringBuilder();
		for(String line : lines) {
			sb.append(indent).append(line).append("\n");
		}
		
		return sb.toString();
	}
	
	/** Returns the input with white spaces removed. Returns empty string if null given. */
	public static String removeSpaces(String input) {
		if (input == null) {
			return "";
		}
		
		return input.replaceAll("\\s+","");
	}
}
