package main;

class Html { 
    private String output;
    private String title;
    private String heading;
    private String content;

    /**
     * formats output string
     */
    public void format() {
        this.output = "<!DOCTYPE html>\n";
        this.output += "<html>\n";
        this.output += "<head>\n";
        this.output += this.title;
        this.output += "</head>\n";
        this.output += "<body>\n";
        this.output += this.heading;
        this.output += this.content;
        this.output += "</body>\n";
        this.output += "</html>\n";
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        if (this.content == null) { 
            this.content = content + "\n";
        } else { 
            this.content += content + "\n";
        }
    }

    /**
     * @param heading the heading to set
     */
    public void setHeading(String heading) {
        this.heading = "<h1>" + heading + "</h1>\n";
    }
   
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = "<title>" + title + "</title>\n";
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @return the heading
     */
    public String getHeading() {
        return heading;
    }

    /**
     * @return the outputPage
     */
    public String getOutput() {
        return output;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    } 
} 