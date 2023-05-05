package Symbol;
import Interpreter.gramaticaListener;
import Interpreter.gramaticaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Map;


public class MyListerner1 implements gramaticaListener{

    SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable(){
        return this.symbolTable;
    }
    @Override
    public void enterStart(gramaticaParser.StartContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );


    }

    @Override
    public void exitStart(gramaticaParser.StartContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void enterProgram(gramaticaParser.ProgramContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void exitProgram(gramaticaParser.ProgramContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void enterIf_decl(gramaticaParser.If_declContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void exitIf_decl(gramaticaParser.If_declContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void enterSentence(gramaticaParser.SentenceContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void exitSentence(gramaticaParser.SentenceContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void enterVar_decl(gramaticaParser.Var_declContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void exitVar_decl(gramaticaParser.Var_declContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void enterVar_assig(gramaticaParser.Var_assigContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void exitVar_assig(gramaticaParser.Var_assigContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void enterPrintln(gramaticaParser.PrintlnContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void exitPrintln(gramaticaParser.PrintlnContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void enterAsig_op(gramaticaParser.Asig_opContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void exitAsig_op(gramaticaParser.Asig_opContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void enterOperacion(gramaticaParser.OperacionContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void exitOperacion(gramaticaParser.OperacionContext ctx) {
        String var1=ctx.start.getText();
        String var2= String.valueOf(ctx.start.getType());
        symbolTable.addSymbol(var1,var2 );
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        String var1=terminalNode.getText();
        String var2= String.valueOf(String.valueOf(terminalNode.getSymbol()));
        symbolTable.addSymbol(var1,var2 );


    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        String var1=errorNode.getText();
        String var2= String.valueOf(errorNode.getSymbol());
        symbolTable.addSymbol(var1, var2);



    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        String var1=parserRuleContext.getText();
        String var2= String.valueOf(String.valueOf(parserRuleContext.start.getType()));
        symbolTable.addSymbol(var1, var2);


    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
        String var1=parserRuleContext.getText();
        String var2= String.valueOf(String.valueOf(parserRuleContext.start.getType()));
        symbolTable.addSymbol(var1, var2);

    }
}
