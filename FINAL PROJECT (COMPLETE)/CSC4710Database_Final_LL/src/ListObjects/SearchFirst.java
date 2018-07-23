package ListObjects;

public class SearchFirst {
	
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

public SearchFirst(String n , int Num, String p)
{
	author = n;
	paperid=Num; 
	title=p; 
}
}
