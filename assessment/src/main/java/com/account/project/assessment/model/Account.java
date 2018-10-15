package com.account.project.assessment.model;

public class Account {
	 private long id;
	    private String firstName;
	    private String secondName;
	    private long accountNumber;
	    
	    public Account()
	    {
	    	
	    }
	    
	    public Account(long id, String firstName, String secondName,long accountNumber)
	    {
	    	this.id = id;
	    	this.firstName = firstName;
	    	this.secondName = secondName;
	    	this.accountNumber = accountNumber;
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSecondName() {
			return secondName;
		}

		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}

		public long getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}

}
