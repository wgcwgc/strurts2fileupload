package com.zhy.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport
{
	/**
	 * 
	 */
    private static final long serialVersionUID = 1L;
	public File uploadFile;
	public String uploadFileFileName;
	public String username;

	public String doUpload()
	{
		try
		{
			System.out.println(username);
			System.out.println(uploadFileFileName);
			File destFile = new File("f:/backup/" , uploadFileFileName);
			FileUtils.copyFile(uploadFile ,destFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
