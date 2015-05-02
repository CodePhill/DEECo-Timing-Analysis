package cz.cuni.mff.d3s.jdeeco.analysis.generator;

import java.io.IOException;

import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.FileUtils;
import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.NamingConventions;
import analysismetamodel.Model;
import freemarker.template.TemplateException;

/**
 * Abstract code generator. Defines common functionality for all code generators.
 */
public abstract class AbstractGenerator {
	/* Root package of the generated code */
	protected String packge;
	protected FileUtils fileUtils;
	protected NamingConventions naming;
	
	/**
	 * @param packge Package into which the class TimingAnalysis will be generated.
	 */
	public AbstractGenerator(FileUtils fileUtils, String packge) {
		this.packge = packge;
		this.fileUtils = fileUtils;
		this.naming = new NamingConventions();
	}
	
	/** Generates source code files for the given input model. */
	public abstract void generateCodeForModel(Model model) throws IOException, TemplateException;
}
