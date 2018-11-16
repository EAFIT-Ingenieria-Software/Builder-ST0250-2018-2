package main;

class HtmlDirector {
    private Builder htmlBuilder;

    HtmlDirector(Builder builder) {
        this.htmlBuilder = builder;
    }

    public void buildPage() {
        this.htmlBuilder.setTitle("Best Title Ever");
        this.htmlBuilder.setHeading("Look I'm a header");
        this.htmlBuilder.setContent("First Line");
        this.htmlBuilder.setContent("Second Line");
        this.htmlBuilder.setContent("Third Line");
        this.htmlBuilder.format();
    } 

    public Html getPage() {
        return this.htmlBuilder.getHtml();
    }
}
