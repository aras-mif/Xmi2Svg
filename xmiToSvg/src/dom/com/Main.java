package dom.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import util.com.Model;
import util.com.ParserXmiToSvg;
import util.com.SvgMaker;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws TransformerException,
	IOException{
		
		new Thread(new Runnable() {
			public void run() {
				
	
		String filePath = "Xmi2Svg.xml";
		Model model=new Model();
		
		DOMImplementation impl = SVGDOMImplementation
				.getDOMImplementation();

		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
		Document doc = impl.createDocument(svgNS, "svg", null);
		
		ParserXmiToSvg parser = new ParserXmiToSvg(filePath,model);
		parser.lecture();
		SvgMaker.printModel(model, doc);

 			
			try {
				TransformerFactory transformerFactory = TransformerFactory
						.newInstance();
				Transformer transformer = transformerFactory
						.newTransformer();

				DOMSource source = new DOMSource(doc);

				PrintStream stream;
				stream = new PrintStream(new File("xmi2svg.svg"));
				StreamResult result = new StreamResult(stream);

				result.setOutputStream(stream);

				transformer.transform(source, result);

				stream.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
			}
		}).start();
	}
}
