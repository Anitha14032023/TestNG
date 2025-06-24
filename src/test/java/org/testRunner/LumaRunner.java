package org.testRunner;

import java.io.IOException;

import com.base.Baseclass;
import com.pageObjectManager.PageObjectManager;


public class LumaRunner extends Baseclass {
	
	public static void main(String[] args) throws IOException {
		
		PageObjectManager  pageObjectManager  =  new  PageObjectManager();
		
		launchingBrowser(pageObjectManager.getFileReaderManager().getDataProperty("browser"));
		launchingURL(pageObjectManager.getFileReaderManager().getDataProperty("url"));
		pageObjectManager.getLogin().getValidLogin();
		pageObjectManager.getSearch().getvalidsearch();
		
		
	}

}
