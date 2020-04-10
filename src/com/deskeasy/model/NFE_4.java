package com.deskeasy.model;

import java.util.List;

public class NFE_4 {
	
	private NFE_Emit emit;
	private NFE_Dest dest;
	private List<NFE_Prod> prod;
	private String vBC;
	private String vICMS;
	private String vICMSDeson;
	private String vFCPUFDest;
	private String vICMSUFDest;
	private String vICMSUFRemet;
	private String vFCP;
	private String vBCST;
	private String vST;
	private String vFCPST;
	private String vDesc;
	private String vFCPSTRet;
	private String vProd;
	private String vFrete;
	private String vSeg;
	private String vII;
	private String vIPI;
	private String vIPIDevol;
	private String vPIS;
	private String vCOFINS;
	private String vOutro;
	private String vNF;
	private String vTotTrib;
	
	public String getvBC() {
		return vBC;
	}
	public void setvBC(String vBC) {
		this.vBC = vBC;
	}
	public String getvICMS() {
		return vICMS;
	}
	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}
	public String getvICMSDeson() {
		return vICMSDeson;
	}
	public void setvICMSDeson(String vICMSDeson) {
		this.vICMSDeson = vICMSDeson;
	}
	public String getvFCPUFDest() {
		return vFCPUFDest;
	}
	public void setvFCPUFDest(String vFCPUFDest) {
		this.vFCPUFDest = vFCPUFDest;
	}
	public String getvICMSUFDest() {
		return vICMSUFDest;
	}
	public void setvICMSUFDest(String vICMSUFDest) {
		this.vICMSUFDest = vICMSUFDest;
	}
	public String getvICMSUFRemet() {
		return vICMSUFRemet;
	}
	public void setvICMSUFRemet(String vICMSUFRemet) {
		this.vICMSUFRemet = vICMSUFRemet;
	}
	public String getvFCP() {
		return vFCP;
	}
	public void setvFCP(String vFCP) {
		this.vFCP = vFCP;
	}
	public String getvBCST() {
		return vBCST;
	}
	public void setvBCST(String vBCST) {
		this.vBCST = vBCST;
	}
	public String getvST() {
		return vST;
	}
	public void setvST(String vST) {
		this.vST = vST;
	}
	public String getvFCPST() {
		return vFCPST;
	}
	public void setvFCPST(String vFCPST) {
		this.vFCPST = vFCPST;
	}
	public String getvFCPSTRet() {
		return vFCPSTRet;
	}
	public void setvFCPSTRet(String vFCPSTRet) {
		this.vFCPSTRet = vFCPSTRet;
	}
	public String getvProd() {
		return vProd;
	}
	public void setvProd(String vProd) {
		this.vProd = vProd;
	}
	public String getvFrete() {
		return vFrete;
	}
	public void setvFrete(String vFrete) {
		this.vFrete = vFrete;
	}
	public String getvSeg() {
		return vSeg;
	}
	public void setvSeg(String vSeg) {
		this.vSeg = vSeg;
	}
	public String getvII() {
		return vII;
	}
	public void setvII(String vII) {
		this.vII = vII;
	}
	public String getvIPI() {
		return vIPI;
	}
	public void setvIPI(String vIPI) {
		this.vIPI = vIPI;
	}
	public String getvIPIDevol() {
		return vIPIDevol;
	}
	public void setvIPIDevol(String vIPIDevol) {
		this.vIPIDevol = vIPIDevol;
	}
	public String getvPIS() {
		return vPIS;
	}
	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}
	public String getvCOFINS() {
		return vCOFINS;
	}
	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}
	public String getvOutro() {
		return vOutro;
	}
	public void setvOutro(String vOutro) {
		this.vOutro = vOutro;
	}
	public String getvNF() {
		return vNF;
	}
	public void setValoresNota(Double vProd, Double vDesc) {
		this.vProd = String.format("%.2f", vProd).replace(',', '.');
		this.vDesc = String.format("%.2f", vDesc).replace(',', '.');
		this.vNF   = String.format("%.2f", vProd - vDesc).replace(',', '.');
	}
	public void setvNF(String vNF) {
		this.vNF = vNF;
	}
	public String getvTotTrib() {
		return vTotTrib;
	}
	public void setvTotTrib(String vTotTrib) {
		this.vTotTrib = vTotTrib;
	}
	public NFE_Emit getEmit() {
		return emit;
	}
	public void setEmit(NFE_Emit emit) {
		this.emit = emit;
	}
	public NFE_Dest getDest() {
		return dest;
	}
	public void setDest(NFE_Dest dest) {
		this.dest = dest;
	}
	public List<NFE_Prod> getProd() {
		return prod;
	}
	public void setProd(List<NFE_Prod> prod) {
		this.prod = prod;
	}
	public String getvDesc() {
		if(this.vDesc == null) return "0.00";
		return vDesc;
	}
	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}
	
}
