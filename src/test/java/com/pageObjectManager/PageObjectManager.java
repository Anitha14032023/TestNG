package com.pageObjectManager;

import com.pageObjectModel.LoginPageModel;
import com.pageObjectModel.SearchPageModel;
import com.utility.FileReaderManager;

public class PageObjectManager {

	// LoginPageModel login = new LoginPageModel();

	private LoginPageModel login;// login = null
	private FileReaderManager read;
	private SearchPageModel search;

	public SearchPageModel getSearch() {
		if (search==null) {
			
			search = new SearchPageModel();
		}
		return search;
	}

	public LoginPageModel getLogin() {
		if (login == null) {

			login = new LoginPageModel();
		}
		return login;
	}

	public FileReaderManager getFileReaderManager() {

		if (read == null) {

			read = new FileReaderManager();
		}
		return read;
	}
	

	

	

}
	
	
	
	
	
	


