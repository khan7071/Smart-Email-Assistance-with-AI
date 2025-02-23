package com.email.writer;

import lombok.Data;

@Data
public class EmailRequest {

	private String emailContent;
	private String tone;

	// Getter for emailContent
	public String getEmailContent() {
		return emailContent;
	}

	// Setter for emailContent
	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}

	// Getter for tone
	public String getTone() {
		return tone;
	}

	// Setter for tone
	public void setTone(String tone) {
		this.tone = tone;
	}

}
