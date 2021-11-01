package com.guzman.dojosurvey;

public class Users {
	private String name;
	private String dojoLocation;
	private String favoriteLanguage;
	private String comment;
	
	public Users(String name, String dojoLocation, String favoriteLanguage, String comment) {
		this.name = name;
		this.dojoLocation = dojoLocation;
		this.favoriteLanguage=favoriteLanguage;
		this.comment=comment;
	}
	public String getName() {
		return name ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return dojoLocation;
	}
	public void setLocation(String dojoLocation) {
		this.dojoLocation = dojoLocation;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getLanguage() {
		return favoriteLanguage;
	}
	public void setLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

}
