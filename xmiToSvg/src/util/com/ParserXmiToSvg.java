package util.com;

import java.io.File;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParserXmiToSvg {

	String filePath = "Xmi2Svg.xml";
	Model model;

	public ParserXmiToSvg(String filePath, Model model) {
		super();
		this.filePath = filePath;
		this.model = model;
	}

	public void lecture() {
		try {
			System.out.println("Start...");
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File(filePath));
			// System.out.print(FilePath+" est lu avec succès...\n");
			NodeList listOfElements = doc.getElementsByTagName("element");

			for (int s = 0; s < listOfElements.getLength(); s++) {
				// chercher les attributs et les recupérer :
				Node node = listOfElements.item(s).getAttributes()
						.getNamedItem("xmi:type");
				if (node == null)
					continue;
				String var = (node.getNodeValue());
				if (var != null) {
					String idActor;
					String idUseCase;
					String nomActor;
					String nomUseCase;
					String nomBoundary;
					String idBoundary;
					switch (var) {
					case "uml:Actor":
						nomActor = listOfElements.item(s).getAttributes()
								.getNamedItem("name").getNodeValue().toString();
						idActor = listOfElements.item(s).getAttributes()
								.getNamedItem("xmi:idref").getNodeValue()
								.toString();
						Actor actor = new Actor();
						actor.setId(idActor);
						actor.setNom(nomActor);
						model.getActors().add(actor);
						System.out.println(nomActor);

						break;
					case "uml:UseCase":
						nomUseCase = listOfElements.item(s).getAttributes()
								.getNamedItem("name").getNodeValue().toString();
						idUseCase = listOfElements.item(s).getAttributes()
								.getNamedItem("xmi:idref").getNodeValue()
								.toString();
						UseCase usecase = new UseCase();
						usecase.setId(idUseCase);
						usecase.setName(nomUseCase);
						model.getUsecases().add(usecase);
						System.out.println(Arrays.toString(model.getUsecases()
								.toArray()));

						break;
					case "uml:Boundary":
						nomBoundary = listOfElements.item(s).getAttributes()
								.getNamedItem("name").getNodeValue().toString();
						idBoundary = listOfElements.item(s).getAttributes()
								.getNamedItem("xmi:idref").getNodeValue()
								.toString();
						Systeme systeme = new Systeme();
						systeme.setName(nomBoundary);
						systeme.setId(idBoundary);

						model.getSystemes().add(systeme);
						// listeBoundarys.add(nomBoundary);

						break;

					}
				}

			}

			NodeList listeElementsA = doc.getElementsByTagName("Association");
			for (int s = 0; s < listeElementsA.getLength(); s++) {
				String startId = listeElementsA.item(s).getAttributes()
						.getNamedItem("start").getNodeValue().toString();
				String endId = listeElementsA.item(s).getAttributes()
						.getNamedItem("end").getNodeValue().toString();

				Actor actor = model.getActorById(startId);
				UseCase usecase;
				if (actor == null) {
					actor = model.getActorById(endId);
					usecase = model.getUseCaseById(startId);
				} else {
					usecase = model.getUseCaseById(endId);
				}

				actor.getUseCases().add(usecase);
				usecase.setActor(actor);

			}

			NodeList listeElementsG = doc
					.getElementsByTagName("Generalization");
			for (int s = 0; s < listeElementsG.getLength(); s++) {
				String startId = listeElementsG.item(s).getAttributes()
						.getNamedItem("start").getNodeValue().toString();
				String endId = listeElementsG.item(s).getAttributes()
						.getNamedItem("end").getNodeValue().toString();

				Actor actor = model.getActorById(startId);
				Actor actorChild;
				if (actor == null) {
					actor = model.getActorById(endId);
					actorChild = model.getActorById(startId);
				} else {
					actorChild = model.getActorById(endId);
				}

				actor.getActorsChild().add(actorChild);

			}

			NodeList packagedElementList = doc
					.getElementsByTagName("packagedElement");
			NodeList linksElement = doc.getElementsByTagName("links");
			NodeList listeElementsExt = doc.getElementsByTagName("UseCase");
			NodeList listeElementsIncl = doc.getElementsByTagName("UseCase");
			for (int s = 0; s < linksElement.getLength(); s++) {
				for (int i = 0; i < packagedElementList.getLength(); i++) {
					if (listeElementsExt
							.item(s)
							.getAttributes()
							.getNamedItem("xmi:id")
							.getNodeValue()
							.toString()
							.equals(doc.getElementsByTagName("extend").item(i)
									.getAttributes().getNamedItem("xmi:id")
									.getNodeValue().toString())) {
						String startId = listeElementsExt.item(s)
								.getAttributes().getNamedItem("start")
								.getNodeValue().toString();
						String endId = listeElementsExt.item(s).getAttributes()
								.getNamedItem("end").getNodeValue().toString();
						UseCase useCase = model.getUseCaseById(startId);
						UseCase useCaseExt;
						if (useCase == null) {
							useCase = model.getUseCaseById(endId);
							useCaseExt = model.getUseCaseById(startId);
						} else {
							useCaseExt = model.getUseCaseById(endId);
						}

						useCase.getUseCasesExtend().add(useCaseExt);

					} else if (listeElementsIncl
							.item(s)
							.getAttributes()
							.getNamedItem("xmi:id")
							.getNodeValue()
							.toString()
							.equals(doc.getElementsByTagName("include").item(i)
									.getAttributes().getNamedItem("xmi:id")
									.getNodeValue().toString())) {

						String startId = listeElementsIncl.item(s)
								.getAttributes().getNamedItem("start")
								.getNodeValue().toString();
						String endId = listeElementsIncl.item(s)
								.getAttributes().getNamedItem("end")
								.getNodeValue().toString();
						UseCase useCase = model.getUseCaseById(startId);
						UseCase useCaseIncl;
						if (useCase == null) {
							useCase = model.getUseCaseById(endId);
							useCaseIncl = model.getUseCaseById(startId);
						} else {
							useCaseIncl = model.getUseCaseById(endId);
						}

						useCase.getUseCasesInclud().add(useCaseIncl);

					}

					else {
						System.out.println("null");
					}
				}
			}

		} catch (Exception e) {
			System.out.print(" L'opération génère l'erreur suivante:  ");
			e.printStackTrace();
		}
		System.out.println("fin lecture");
	}

}
