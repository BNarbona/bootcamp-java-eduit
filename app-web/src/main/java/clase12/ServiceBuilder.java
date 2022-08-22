package clase12;

public class ServiceBuilder {

	public final static IService builderService(String site) {
		IService service;
		switch (site) {
			case "1":
				service = new ServiceS1();
				break;
			case "2":
				service = new ServiceS2();
				break;
			default:
				service = new DefaultService();
				break;
		}
		return service;
		
	}
}
