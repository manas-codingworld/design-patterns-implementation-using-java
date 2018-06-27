package com.myapp.creational.builder;

public class LunchOrder {
	
	public static class Builder{
		private String upma,idli,dosa;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}

		public String getUpma() {
			return upma;
		}

		public String getIdli() {
			return idli;
		}

		public String getDosa() {
			return dosa;
		}

		public LunchOrder build(){
			return new LunchOrder(this);
		}
		public Builder upma(String upma){
			this.upma=upma;	
			return this;
		}
		public Builder idli(String idli){
			this.idli=idli;	
			return this;
		}
		public Builder dosa(String dosa){
			this.dosa=dosa;	
			return this;
		}
	}
	
	private final String upma,idli,dosa;
	
	public String getUpma() {
		return upma;
	}

	public String getIdli() {
		return idli;
	}

	public String getDosa() {
		return dosa;
	}

	public LunchOrder(Builder builder){
		this.idli=builder.idli;
		this.upma=builder.upma;
		this.dosa=builder.dosa;
	}
}
