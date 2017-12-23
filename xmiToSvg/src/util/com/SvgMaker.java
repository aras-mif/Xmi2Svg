package util.com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SvgMaker {

	/**
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param color
	 * @param doc
	 */

	public static void rectangle(Document doc, int i, int j, String name) {

		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element rectangle = doc.createElementNS(svgNS, "rect");

		rectangle.setAttributeNS(null, "x", 200 + i + "");
		rectangle.setAttributeNS(null, "y", 100 + j + "");
		rectangle.setAttributeNS(null, "width", 500 + "");
		rectangle.setAttributeNS(null, "height", 660 + "");
		rectangle.setAttributeNS(null, "fill", "pink");
		rectangle.setAttribute("stroke-width", 2 + "");
		rectangle.setAttribute("stroke", "black");

		svgRoot.appendChild(rectangle);

		text(210 + i, 120 + j, doc, name);
	}

	
	public static void polygon(Document doc,int i,int l){
		
		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element polygon = doc.createElementNS(svgNS, "polygon");
		
		int k=i-5;
		int m=i+5;
		int n=l-15;

		polygon.setAttribute("points", i+","+n+" "+k+","+l+" "+m+","+l);
		polygon.setAttribute("fill", "white");
		polygon.setAttribute("stroke", "black");
		polygon.setAttribute("stroke-width", "2");
		
		svgRoot.appendChild(polygon);
		
		
	}
	/**
	 * 
	 * @param cx
	 * @param cy
	 * @param rx
	 * @param ry
	 * @param color
	 * @param doc
	 */
	public static void ellipse(Document doc, int i, int j, String name) {
		//
		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
		Element svgRoot = doc.getDocumentElement();
		Element elipse = doc.createElementNS(svgNS, "ellipse");

		elipse.setAttribute("cx", 270 + i + "");
		elipse.setAttribute("cy", 160 + j + "");
		elipse.setAttribute("rx", "60");
		elipse.setAttribute("ry", "40");
		elipse.setAttribute("fill", "white");
		elipse.setAttribute("stroke-width", "2");
		elipse.setAttribute("stroke", "black");

		svgRoot.appendChild(elipse);

		text(230 + i, 160 + j, doc, name);

	}

	/**
	 * 
	 * @param cx
	 * @param cy
	 * @param r
	 * @param color
	 * @param strock
	 * @param sw
	 * @param doc
	 */
	public static void circle(int cx, int cy, int r, String color,
			String strock, int sw, Document doc) {

		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element circle = doc.createElementNS(svgNS, "circle");

		circle.setAttribute("cx", cx + "");
		circle.setAttribute("cy", cy + "");
		circle.setAttribute("r", r + "");
		// circle.setAttribute("width", width + "");
		// circle.setAttribute("height", height + "");
		circle.setAttribute("fill", color);
		circle.setAttribute("stroke-width", sw + "");
		circle.setAttribute("stroke", strock);

		svgRoot.appendChild(circle);

	}

	/**
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param color
	 * @param sw
	 * @param colorS
	 * @param doc
	 */
	public static void line(int x1, int y1, int x2, int y2, String color,
			int sw, String colorS, Document doc) {

		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element line = doc.createElementNS(svgNS, "line");

		line.setAttribute("x1", x1 + "");
		line.setAttribute("y1", y1 + "");
		line.setAttribute("x2", x2 + "");
		line.setAttribute("y2", y2 + "");
		line.setAttribute("fill", color);
		line.setAttribute("stroke-width", sw + "");
		line.setAttribute("stroke", colorS);

		svgRoot.appendChild(line);

	}

	public static void association(Document doc, int i, int j, int k, int l) {

		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element line = doc.createElementNS(svgNS, "line");

		line.setAttribute("x1", 100 + i + "");
		line.setAttribute("y1", 100 + j + "");
		line.setAttribute("x2", 270 + k + "");
		line.setAttribute("y2", 160 + l + "");
		line.setAttribute("fill", "black");
		line.setAttribute("stroke-width", 1 + "");
		line.setAttribute("stroke", "black");

		svgRoot.appendChild(line);

	}
	
	public static void generalisation(Document doc, int i, int j, int k, int l) {

		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element line = doc.createElementNS(svgNS, "line");
		polygon(doc,100+i, 218+j);
		line.setAttribute("x1", 100 +i+"");
		line.setAttribute("y1", 218 +j+"");
		line.setAttribute("x2", 100 +k+ "");
		line.setAttribute("y2", 150 + l + "");
		line.setAttribute("fill", "black");
		line.setAttribute("stroke-width", 1 + "");
		line.setAttribute("stroke", "black");

		svgRoot.appendChild(line);

	}

	
	public static void extention(Document doc,int i, int j, int k, int l) {

		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element line = doc.createElementNS(svgNS, "line");
		polygon(doc,260+i, 220+j);
		line.setAttribute("x1", 260 +i+"");
		line.setAttribute("y1", 220 +j+"");
		line.setAttribute("x2", 260 +k+ "");
		line.setAttribute("y2", 200+ l + "");
		line.setAttribute("fill", "black");
		line.setAttribute("stroke-width", 1 + "");
		line.setAttribute("stroke", "black");
		line.setAttribute("stroke-linecap", "round");
		line.setAttribute("stroke-dasharray", "1,3,3,3");
		svgRoot.appendChild(line);
		text(230 + i, 240 + j, doc,"\"extend\"");

	}
	
	
	public static void include(Document doc,int i, int j, int k, int l) {

		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element line = doc.createElementNS(svgNS, "line");
		polygon(doc,260+i, 220+j);
		line.setAttribute("x1", 260 +i+"");
		line.setAttribute("y1", 220 +j+"");
		line.setAttribute("x2", 260 +k+ "");
		line.setAttribute("y2", 200+ l + "");
		line.setAttribute("fill", "black");
		line.setAttribute("stroke-width", 1 + "");
		line.setAttribute("stroke", "black");
		line.setAttribute("stroke-linecap", "round");
		line.setAttribute("stroke-dasharray", "1,3,3,3");
		svgRoot.appendChild(line);
		text(230 + i, 240 + j, doc,"\"include\"");

	}

	/**
	 * 
	 */
	public static void text(int x, int y, Document doc, String name) {
		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;

		Element svgRoot = doc.getDocumentElement();
		Element text = doc.createElementNS(svgNS, "text");

		text.setAttribute("x", x + "");
		text.setAttribute("y", y + "");
		text.setAttribute("fill", "black");
		text.setTextContent(name);

		svgRoot.appendChild(text);

	}

	public static void actor(Document doc, int i, int j, String name) {

		circle(100 + i, 100 + j, 18, "white", "black", 2, doc);
		line(100 + i, 118 + j, 100 + i, 160 + j, "black", 2, "black", doc);
		line(80 + i, 140 + j, 120 + i, 140 + j, "black", 2, "black", doc);
		line(100 + i, 160 + j, 120 + i, 190 + j, "black", 2, "black", doc);
		line(100 + i, 160 + j, 80 + i, 190 + j, "black", 2, "black", doc);
		text(80 + i, 200 + j, doc, name);

	}

	public static void printActor(List<Actor> list, Document doc) {

		
		int x=0, y=0;
		for(int i=0; i < list.size(); i++)
		{
			Actor actor =list.get(i);
//			String name = actor.getNom();
//			actor(doc,x,y,name);
			actor.setX(x);
			actor.setY(y);
			actor.setPrint(false);
			y+=180;
			if(i>=3)
			{
				y=0;
				x+=660;
			}
		}

	}

	public static void printUseCase(List<UseCase> list, Document doc) {

		int x=0, y=0;
		for(int i=0; i < list.size(); i++)
		{
			 
			UseCase uc =list.get(i);
//			String name = uc.getName();
//			ellipse(doc, x, y, name);
			uc.setX(x);
			uc.setY(y);
			uc.setPrint(false);
			y+=130;
			
			if(i>=5)
			{
				y=0;
				x+=140;
				
			}
			 
			
			
		}
	}

	public static void printSystem(List<Systeme> list, Document doc) {

		int x=0, y=0;
		for(int i=0; i < list.size(); i++)
		{
			Systeme sys =list.get(i);
			String name = sys.getName();
			rectangle(doc, x, y, name);
			sys.setX(x);
			sys.setY(y);
			sys.setPrint(true);
			y+=520;
			if(i>6)
			{
				y=0;
				x+=240;
			}
		}
	}
	
	public static void printAssociation(List<Actor> list, Document doc) {

//		int k=0,l=0,m=0,n=0;
		for(int i=0; i < list.size(); i++)
		{ 
			Actor actor=list.get(i);
			if(!actor.isPrint()){
			Set<UseCase> listUC=actor.getUseCases();
			 Iterator<UseCase> it=listUC.iterator();
			while(it.hasNext())
			{	
				UseCase ucCase=it.next();
			     association(doc, actor.getX(), actor.getY(), ucCase.getX(), ucCase.getY());
			     if(!ucCase.isPrint()){
			     String name = ucCase.getName();
					ellipse(doc, ucCase.getX(), ucCase.getY(), name);
					ucCase.setPrint(true);
			     }
			     
			} 
			String name = actor.getNom();
			actor(doc,actor.getX(),actor.getY(),name);
			
			actor.setPrint(true);
			
		   }
			 
		}
	}
	
	public static void printGenralisation(List<Actor> list, Document doc) {

//		int k=0,l=0,m=0,n=0;
		for(int i=0; i < list.size(); i++)
		{ 
			Actor actor=list.get(i);
			if(actor.isPrint()){
			Set<Actor> actors=actor.getActorsChild();
			Iterator<Actor> it=actors.iterator();
				
			while(it.hasNext())
			{	
				Actor actorChild=it.next();
			     generalisation(doc, actorChild.getX(), actorChild.getY(), actor.getX() ,actor.getY());
			     if(actorChild.isPrint()){
			     String name = actorChild.getNom();
					actor(doc, actorChild.getX(), actorChild.getY(), name);
					actorChild.setPrint(false);
			     }
			} 
			String name = actor.getNom();
			actor(doc,actor.getX(),actor.getY(),name);
			
			actor.setPrint(false);
		   }
			 
		}
	}
	public static void printExtention(List<UseCase> list, Document doc) {

//		int k=0,l=0,m=0,n=0;
		for(int i=0; i < list.size(); i++)
		{ 
			 
			UseCase useCase=list.get(i);
			if(useCase.isPrint()){
			Set<UseCase> useCases=useCase.getUseCasesExtend();
			Iterator<UseCase> it=useCases.iterator();
				
			while(it.hasNext())
			{	
				UseCase useCaseExt=it.next();
			     extention(doc, useCaseExt.getX(), useCaseExt.getY(), useCase.getX() ,useCase.getY());
			     if(!useCaseExt.isPrint()){
			     String name = useCaseExt.getName();
					ellipse(doc, useCaseExt.getX(), useCaseExt.getY(), name);
					useCaseExt.setPrint(true);
			     }
			} 
			String name = useCase.getName();
			ellipse(doc,useCase.getX(),useCase.getY(),name);
			
			useCase.setPrint(false);
		   }
			 
		}
	}
	
	
	public static void printInclusion(List<UseCase> list, Document doc) {

//		int k=0,l=0,m=0,n=0;
		for(int i=0; i < list.size(); i++)
		{ 
			 
			UseCase useCase=list.get(i);
			if(useCase.isPrint()){
			Set<UseCase> useCases=useCase.getUseCasesInclud();
			Iterator<UseCase> it=useCases.iterator();
				
			while(it.hasNext())
			{	
				UseCase useCaseIncl=it.next();
			     extention(doc, useCaseIncl.getX(), useCaseIncl.getY(), useCase.getX() ,useCase.getY());
			     if(!useCaseIncl.isPrint()){
			     String name = useCaseIncl.getName();
					ellipse(doc, useCaseIncl.getX(), useCaseIncl.getY(), name);
					useCaseIncl.setPrint(true);
			     }
			} 
			String name = useCase.getName();
			ellipse(doc,useCase.getX(),useCase.getY(),name);
			
			useCase.setPrint(false);
		   }
			 
		}
	}
	
	

	public static void printModel(Model model, Document doc) {

         printSystem(model.getSystemes(), doc);
		 printActor(model.getActors(), doc);
		 printUseCase(model.getUsecases(), doc);
		 printAssociation(model.getActors(), doc);
		 printGenralisation(model.getActors(), doc);
		 printExtention(model.getUsecases(), doc);
	}

}
