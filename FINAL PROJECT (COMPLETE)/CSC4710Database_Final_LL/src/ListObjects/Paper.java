package ListObjects;

public class Paper {
public int paperid;
public String title;
public String abs;
public String pdf;
public int getPaperid() {
	return paperid;
}
public Paper(int paperid, String title) {
	super();
	this.paperid = paperid;
	this.title = title;
}
public void setPaperid(int paperid) {
	this.paperid = paperid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAbs() {
	return abs;
}
public void setAbs(String abs) {
	this.abs = abs;
}
public String getPdf() {
	return pdf;
}
public void setPdf(String pdf) {
	this.pdf = pdf;
}
}
