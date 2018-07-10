package mvcTry;

import java.util.ArrayList;

public class Model {

	private ArrayList<String> data;
	private int elements;

	
	public Model(ArrayList<String> data) {
		super();
		this.data = data;
		elements = 0;
	}

	/**
	 * 
	 * @return the list of strings to be displayed
	 */
	public ArrayList<String> getData() {
		return data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(ArrayList<String> data) {
		this.data = data;
	}
	
	public boolean arrayUpdated()
	{
		if (data.size() != elements)
		{
			return true;
		}
		return false;
	}
}
