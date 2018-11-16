package main;

class Main {
    public static void main(String[] args) {
        Builder builder = new HtmlConcretBuilder();
        HtmlDirector director = new HtmlDirector(builder); 
        director.buildPage();

        Html page = director.getPage();

        System.out.println(page.getOutput());
    }
}
