package cz.cuni.mff.d3s.jdeeco.analysis.generator;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.FileUtils;
import freemarker.template.TemplateException;
import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.Model;

public class Main {

	/**
	 * Main method of the generator called from the command line.
	 * 
	 * Required arguments follows.
	 * -m path => path to the analysis input model.
	 * -o path => path of directory into which the generated classes should be saved.
	 * -p package => root package of the generated Java classes.
	 */
	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, IOException, TemplateException {
		
		System.out.println();
		
		// Verify correct number of input arguments
		if (args.length != 6) {
			System.out.println("Invalid number of arguments. List of required inputs follows.");
			System.out.println("----------------------------------------------------");
			System.out.println("'-m path' path to the analysis input model (.xmi format)");
			System.out.println("'-o path' path of directory into which the generated classes should be saved");
			System.out.println("'-p package' root package of the generated Java classes");
			return;
		}
		
		String pathToModel = null;
		String pathToOutput = null;
		String packge = null;
		
		// Parse the arguments
		for(int i = 0; i < 6; i+=2) {
			if (args[i].toLowerCase().equals("-m")) {
				pathToModel = args[i+1];
			} else if (args[i].toLowerCase().equals("-o")) {
				pathToOutput = args[i+1];
			} else if (args[i].toLowerCase().equals("-p")) {
				packge = args[i+1];
			} else {
				System.out.println("Invalid parameter '" + args[i] + "'");
				return;
			}
		}
		
		if (pathToModel == null) {
			System.out.println("Missing path to the .xmi model. Use '-m path'.");
			return;
		} else if (pathToOutput == null) {
			System.out.println("Missing path to the output directory. Use '-o path'.");
			return;
		} else if (packge == null) {
			System.out.println("Missing name of root package for Java classes. Use '-o path'.");
			return;
		}
		
		// Run the generator
		run(pathToModel, pathToOutput, packge);
	}
	
	/** Runs the generator. */
	public static void run(String pathToModel, String pathToSrc, String packge) {
		// Check whether the given file representing the model exists.
		File file = new File(pathToModel);
		if (!file.exists() || !file.canRead() || file.isDirectory()) {
			System.out.println("Error: Provided input model on path '"
					+ pathToModel
					+ "' does not exist or cannot be opened.");
			return;
		}
		
		// Append prefix for the loader.
		pathToModel = "file://" + pathToModel;
		
		// Check whether the output directory exists.
		if(!new File(pathToSrc).isDirectory()) {
			System.out.println("Error: Output folder '" + pathToSrc + "' is invalid.");
			return;
		}
		
		Model runtimeMetadata = null;
		
		try {
			// Load and parse the model
			runtimeMetadata = load(pathToModel);
			runtimeMetadata.getComponentInstances();
		} catch (Exception e) {
			System.out.println("Error: Provided input model file is in a wrong format.");
			return;
		}
		
		// Validate the model
		Validator validator = new Validator();
		if (!validator.validate(runtimeMetadata)) {
			return;
		}
		
		System.out.println("Validation of the input model passed.");
		System.out.println("Executing code generation...");
		System.out.println();
		
		FileUtils generatorUtils = new FileUtils(packge, pathToSrc);
		
		ClassGenerator generator = new ClassGenerator(generatorUtils, packge, false);
		BindingGenerator generator2 = new BindingGenerator(generatorUtils, packge);
		
		try {
			// Generate classes.
			generator.generateCodeForModel(runtimeMetadata);
			// Generate the binding code.
			generator2.generateCodeForModel(runtimeMetadata);
			
			System.out.println();
			System.out.println("Task finished. You are ready to roll!");
		} catch (IOException e) {
			System.out.println("Exception when saving a file on the drive.");
			e.printStackTrace();
		} catch (TemplateException e) {
			System.out.println("Something went wrong during template processing, please verify your input model.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Something went wrong in the generator, please verify your input model.");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Loads and parses a file loaded from the given path.
	 * @param filePath Path to the file.
	 */
	public static Model load(String filePath) {
	    // Initialize the model
		AnalysismetamodelPackage.eINSTANCE.eClass();
	    
	    // Register the XMI resource factory for the .xmi extension
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI.createURI(filePath), true);
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    Model runtimeMetadata = (Model) resource.getContents().get(0);
	    return runtimeMetadata;
	  }
}
