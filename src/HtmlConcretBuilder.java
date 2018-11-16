package main;

class HtmlConcretBuilder implements Builder {
    private Html htmlPage;

    HtmlConcretBuilder() {
        this.htmlPage = new Html();
    }

    @Override
    public void setContent(String name) {
        this.htmlPage.setContent(name);
    }

    @Override
    public void setHeading(String name) {
       this.htmlPage.setHeading(name); 
    }

    @Override
    public void setTitle(String name) {
       this.htmlPage.setTitle(name); 
    } 

    @Override
    public Html getHtml() {
        return this.htmlPage;
    }

    @Override
    public void format() {
        this.htmlPage.format();
    }
}