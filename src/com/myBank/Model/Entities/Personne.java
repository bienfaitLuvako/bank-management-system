package com.myBank.Model.Entities;



public class Personne {
	
	private Long id;
	private String firstname;
	private String lastname;
	private String idNat;
	private String birthday;
	private String genre;
	private String photo;
	private String phone;
	
	
	public Personne(Long id, String firstname, String lastname, String idNat, String birthday, String genre, String photo,
			String phone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.idNat = idNat;
		this.birthday = birthday;
		this.genre = genre;
		this.photo = photo;
		this.phone = phone;
	}
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the idNat
	 */
	public String getIdNat() {
		return idNat;
	}
	/**
	 * @param idNat the idNat to set
	 */
	public void setIdNat(String idNat) {
		this.idNat = idNat;
	}
	/**
	 * @return the age
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
