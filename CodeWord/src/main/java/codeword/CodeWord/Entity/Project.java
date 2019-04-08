package codeword.CodeWord.Entity;

public class Project {
	private String title;
	private String description;
	private String technologies;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	@Override
	public String toString() {
		return "Project [title=" + title + ", description=" + description + ", technologies=" + technologies + "]";
	}
	
}
