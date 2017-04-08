package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Comment implements Serializable{

	private Long id;

	private String text;
	private LocalDate date;

	public Comment(String text, LocalDate date) {
		if (text != null && !text.isEmpty()) {
			this.text = text;
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text != null && !text.isEmpty()) {
			this.text = text;
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if (id >= 0) {
			this.id = id;
		}
	}
}