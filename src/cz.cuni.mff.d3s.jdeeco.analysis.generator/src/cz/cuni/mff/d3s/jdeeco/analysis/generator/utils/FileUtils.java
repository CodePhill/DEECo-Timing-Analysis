package cz.cuni.mff.d3s.jdeeco.analysis.generator.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * Utility for generation of files from templates. 
 */
public class FileUtils {
	// The path to a folder where templates can be found.
	private static final String TemplatesDirectory = "templates";
	
	// Configuration of the FreeMarker template library.
	private Configuration cfg;
	// Package into which the source files are generated.
	private String packge;
	// Folder into which the source files are saved.
	private String pathToSrc;
	
	public FileUtils(String packge, String pathToSrc) {
		this.packge = packge;
		this.pathToSrc = pathToSrc;
		
		/* Create and adjust the configuration FreeMarker */
        cfg = new Configuration(Configuration.VERSION_2_3_21);
        try {
			cfg.setDirectoryForTemplateLoading(new File(TemplatesDirectory));
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        cfg.setNumberFormat("0.######");
	}
	
	/** Checks whether the source file already exists. */
	public boolean checkIfFileExists(String fileName, String packgeAppendix) {
		String path = this.getFilePath(fileName, packge + "." + packgeAppendix);	
		return new File(path).exists();
	}
	
	/**
	 * Creates a file from a template and stores it to a directory.
	 * 
	 * @param templateName The name of a template to be used.
	 * @param dataModel Data for the template processor.
	 * @param fileName The name of the source file.
	 * @param packgeAppendix The package appendix used in as: packge.{packgeAppendix}.file
	 */
	public void createFileFromTemplate(
			String templateName, Object dataModel, String fileName, String packgeAppendix) 
			throws TemplateException, IOException {
		Template template = cfg.getTemplate(templateName);
		File file = this.createClassFile(fileName, packge + "." + packgeAppendix);
		FileWriter out = new FileWriter(file);
		template.process(dataModel, out);
		out.close();
	}
	
	/**
	 * Returns source file path based on given arguments.
	 * @param fileName Name of the file.
	 * @param packge Complete package of the file.
	 */
	private String getFilePath(String fileName, String packge) {
		return pathToSrc
				+ File.separator
				+ packge.replace(".", File.separator)
				+ File.separator
				+ fileName + ".java";
	}
	
	/**
	 * Creates file in the previously given directory.
	 * @param fileName Name of the source file.
	 * @param packge Package of the class contained by the file.
	 */
	private File createClassFile(String fileName, String packge)
			throws IOException {
				
		String path = this.getFilePath(fileName, packge);
		
		// Create file
		File file = new File(path);	
		file.getParentFile().mkdirs(); 
		file.createNewFile();
		
		return file;
	}
}
