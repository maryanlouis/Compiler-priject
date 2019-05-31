import org.antlr.v4.codegen.model.AddToLabelList;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
public class threeAddressCode extends CoolBaseVisitor <String> {
    @Override
    public String visitProgram(CoolParser.ProgramContext ctx){
        ParseTree child = ctx.getChild(0);
        Label l1= new Label();
        child = (ParseTree) l1;
        String id =ctx.getText();
        String next= ctx.getChild(0).getText();
        return id+next;
    }
}

