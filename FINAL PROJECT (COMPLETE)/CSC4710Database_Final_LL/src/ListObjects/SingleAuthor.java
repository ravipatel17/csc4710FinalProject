package ListObjects;

public class SingleAuthor {
	
public String author;
public String title;
public int paperid; 

public String getAuthor() {
	return author;
}

public void setAuthor(String name) {
	this.author = name;
}

public String getTitle() {
	return title;
}

public void setTitle(String p) {
	this.title = p;
}

public void setPaperid(int Num) {
	paperid=Num; 
}

public int getPaperid() {
	return paperid; 
}

public SingleAuthor(String n , int Num, String p)
{
	author = n;
	paperid=Num; 
	title=p; 
}


public SingleAuthor(int paperid, String title ) {
	super();
	this.title = title;
	this.paperid = paperid;
}
}
