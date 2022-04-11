package clase15;

public class project {
	
	private String modelVersion = "4.0.0";
	private Parent parent1 = new Parent("ar.com.educacionit","app-parent","1.0.0-SNAPSHOT");
	private String artifactId = "app-web";
	private String name ="modulo web del bootcamp";
	
	public project(String modelVersion, Parent parent1, String artifactId, String name) {
		this.modelVersion = modelVersion;
		this.parent1 = parent1;
		this.artifactId = artifactId;
		this.name = name;
	}

	
}
