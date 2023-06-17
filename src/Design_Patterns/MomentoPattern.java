package Design_Patterns;

import java.util.Stack;

// Editor Example
public class MomentoPattern {
    public static void main(String[] args) {
        var edit = new Editor();
        var l1 = edit.setLoan("Ahmed", 20);
        System.out.println(edit.getLoan());
        var l2 = edit.setLoan("Omer", 10);
        System.out.println(edit.getLoan());
        System.out.println(edit.restoreLoan(l1));


    }
}
class Editor{
    private String name;
    private double loan;
    public EditorState setLoan(String name, double loan){
        this.name = name;
        this.loan = loan;
        var e =  new EditorState(name, loan);
        new EditorHistory().push(e);
        return e;
    }
    public String getLoan() {
        return name + ": " + loan;
    }

    public EditorState changeLoan(String name, double loan) {
        this.name = name;
        this.loan = loan;
        var e =  new EditorState(name, loan);
        new EditorHistory().push(e);
        return e;
    }
    public String restoreLoan(EditorState state) {
        EditorState r = new EditorHistory().pop();
        new EditorHistory().push(new EditorState(r.name, r.loan));
        this.name = r.name;
        this.loan = r.loan;
        return this.name + ": " + this.loan;
    }
}
class EditorState{
    String name;
    double loan;
    public EditorState(String name, double loan){
        this.name = name;
        this.loan = loan;
    }

    public String getContent() {
        return name + ": " + "loan";
    }

}
class EditorHistory{
static Stack<EditorState> StateList= new Stack<>();
    public void push(EditorState ES){
        StateList.push(ES);
    }
    public EditorState pop(){
        return StateList.pop();
    }
}