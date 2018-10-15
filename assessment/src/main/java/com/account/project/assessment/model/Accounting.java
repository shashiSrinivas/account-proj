package com.account.project.assessment.model;

public class Accounting {
	 private long id;
	    private String firstName;
	    private String secondName;
	    private String accountNumber;
	    
	    public Accounting()
	    {
	    	
	    }
	    
	    public Accounting(long id, String firstName, String secondName,String accountNumber)
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

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

}
