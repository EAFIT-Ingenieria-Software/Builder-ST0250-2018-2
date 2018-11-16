package main;

/**
 * Builder
 */
public interface Builder {
    public void setTitle(String name);
    public void setHeading(String name);
    public void setContent(String name); 
    public void format();
    public Html getHtml();
}
 