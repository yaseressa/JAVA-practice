package roar;

import java.util.concurrent.atomic.AtomicInteger;

public class Momento {
    public static void main(String[] args) {
        var atom = new AtomicInteger(23);
       Momento.Content b= new Momento.Content();
        b.setContent("ahmed");
        b.setContent("omer");
        b.setContent("Ebrahem");
        System.out.println(b.getContent());
        b.undo();
        System.out.println(b.getContent());
    }
    static class Content{
        private String content;
        private String prevContent;

        public String getContent() {
            return content;
        }
        public void undo(){
            content = prevContent;
        }

        public void setContent(String content) {
            prevContent = this.content;
            this.content = content;
        }
    }
}

