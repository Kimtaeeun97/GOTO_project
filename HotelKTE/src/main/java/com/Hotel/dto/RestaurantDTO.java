package com.Hotel.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class RestaurantDTO {

	private String re_ctcode;
	private String recode;
	private String re_name;
	private String readdr;
	private MultipartFile rephoto;
	private String reintro;
	private String refilename;
	private String readdr_address;
	private String readdr_detailAddress;
	private String readdr_extraAddress;
	private String readdr_postcode;
	public String getRe_ctcode() {
		return re_ctcode;
	}
	public void setRe_ctcode(String re_ctcode) {
		this.re_ctcode = re_ctcode;
	}
	public String getRecode() {
		return recode;
	}
	public void setRecode(String recode) {
		this.recode = recode;
	}
	public String getRename() {
		return re_name;
	}
	public void setRename(String rename) {
		this.re_name = rename;
	}
	public String getReaddr() {
		return readdr;
	}
	public void setReaddr(String readdr) {
		this.readdr = readdr;
	}
	public MultipartFile getRephoto() {
		return rephoto;
	}
	public void setRephoto(MultipartFile rephoto) {
		this.rephoto = rephoto;
	}
	public String getReintro() {
		return reintro;
	}
	public void setReintro(String reintro) {
		this.reintro = reintro;
	}
	public String getRefilename() {
		return refilename;
	}
	public void setRefilename(String refilename) {
		this.refilename = refilename;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public String getReaddr_address() {
		return readdr_address;
	}
	public void setReaddr_address(String readdr_address) {
		this.readdr_address = readdr_address;
	}
	public String getReaddr_detailAddress() {
		return readdr_detailAddress;
	}
	public void setReaddr_detailAddress(String readdr_detailAddress) {
		this.readdr_detailAddress = readdr_detailAddress;
	}
	public String getReaddr_extraAddress() {
		return readdr_extraAddress;
	}
	public void setReaddr_extraAddress(String readdr_extraAddress) {
		this.readdr_extraAddress = readdr_extraAddress;
	}
	public String getReaddr_postcode() {
		return readdr_postcode;
	}
	public void setReaddr_postcode(String readdr_postcode) {
		this.readdr_postcode = readdr_postcode;
	}
	@Override
	public String toString() {
		return "RestaurantDTO [re_ctcode=" + re_ctcode + ", recode=" + recode + ", re_name=" + re_name + ", readdr="
				+ readdr + ", rephoto=" + rephoto + ", reintro=" + reintro + ", refilename=" + refilename
				+ ", readdr_address=" + readdr_address + ", readdr_detailAddress=" + readdr_detailAddress
				+ ", readdr_extraAddress=" + readdr_extraAddress + ", readdr_postcode=" + readdr_postcode + "]";
	}
	
	
	
	
	
}
