// Generated from E:/����� ������/2nd term/compilers/project/Compilers/src\Cool.g4 by ANStringLR 4.7.2
import com.sun.corba.se.spi.ior.ObjectId;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.temporal.Temporal;


public class ThreeAddress extends CoolBaseVisitor<String> {

    static class Temp{
        public static int counter = 0;
        private int number;
        public Temp(){
            number = ++counter;
        }
        public String toString(){
            return "t" + this.number;
        }
    }
    /**
     * Visit a parse tree produced by {@link CoolParser#program}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    public String visitProgram(CoolParser.ProgramContext ctx){
        return visit(ctx.programBlocks());
    }
    /**
     * Visit a parse tree produced by the {@code classes}
     * labeled alternative in {@link CoolParser#programBlocks}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    public String visitClasses(CoolParser.ClassesContext ctx){
        System.out.println(visitChildren(ctx));
        return "";
    }
    /**
     * Visit a parse tree produced by the {@code eof}
     * labeled alternative in {@link CoolParser#programBlocks}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    public String visitEof(CoolParser.EofContext ctx){
        return "";
    }
    /**
     * Visit a parse tree produced by {@link CoolParser#classDefine}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    public String visitClassDefine(CoolParser.ClassDefineContext ctx){
        System.out.println(visitChildren(ctx));
        return "";
    }
    /**
     * Visit a parse tree produced by the {@code method}
     * labeled alternative in {@link CoolParser#feature}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    public String visitMethod(CoolParser.MethodContext ctx){
        System.out.println("BeginFunc");
        String ret = visit(ctx.expression());
        System.out.println("Return " + ret);
        System.out.println("EndFunc");
        return "";
    }
    /**
     * Visit a parse tree produced by the {@code property}
     * labeled alternative in {@link CoolParser#feature}.
     * @param ctx the parse tree
     * @return the visitor result
     */

    public String visitProperty(CoolParser.PropertyContext ctx){
        if(ctx.getChildCount()>3){
            System.out.println(ctx.OBJECTID().getText() + " = " + visit(ctx.expression()));
        }
        return "";
    }
    /**
     * Visit a parse tree produced by {@link CoolParser#formal}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    public String visitFormal(CoolParser.FormalContext ctx){

        return visitChildren(ctx);
    }


    public String visitMinus(CoolParser.MinusContext ctx){
        Temp t = new Temp();

        System.out.println(t.toString() + " = " + visit(ctx.expression(0)) + " - " + visit(ctx.expression(1)));

        return t.toString();
    }


    public String visitString(CoolParser.StringContext ctx){

        return ctx.STRING().getText();
    }



    public String visitWhile(CoolParser.WhileContext ctx){
        System.out.println("L0: ");
        System.out.println("IFz "+ visit(ctx.expression(0)) + " GOTO L1");
        visit(ctx.expression(1));
        System.out.println("goto L0");
        System.out.println("L1: ");
        return "";
    }


    public String visitDivision(CoolParser.DivisionContext ctx){
        Temp t = new Temp();

        System.out.println(t.toString() + " = " + visit(ctx.expression(0)) + " / " + visit(ctx.expression(1)));

        return t.toString();
    }

    public String visitNegative(CoolParser.NegativeContext ctx){
        Temp t = new Temp();

        System.out.println(t.toString() + " = " +  " - " + visit(ctx.expression()));

        return t.toString();
    }

    public String visitBoolNot(CoolParser.BoolNotContext ctx){
        Temp t = new Temp();
        System.out.println(t.toString()+" = "+ " ! "+ visit(ctx.expression()));

        return t.toString();
    }

    public String visitLessThan(CoolParser.LessThanContext ctx){
        Temp t = new Temp();
        System.out.println(t.toString()+" = "+ visit(ctx.expression(0))+" < "+ visit(ctx.expression(1)));

        return t.toString();
    }

    public String visitId(CoolParser.IdContext ctx){
        return ctx.OBJECTID().getText();
    }

    public String visitMultiply(CoolParser.MultiplyContext ctx){
        Temp t = new Temp();

        System.out.println(t.toString() + " = " + visit(ctx.expression(0)) + " * " + visit(ctx.expression(1)));

        return t.toString();
    }


    public String visitIf(CoolParser.IfContext ctx){
        Temp t = new Temp();
        String x;
        x= t.toString();
        System.out.println(x+" = "+ visit(ctx.expression(0)));
        System.out.println("IFz "+x+ " GoTo L0 " );
        System.out.println("L0 :");
        System.out.println(visit(ctx.expression(1)));
        return "";

    }




    public String visitOwnMethodCall(CoolParser.OwnMethodCallContext ctx){

        return "";
    }

    public String visitAdd(CoolParser.AddContext ctx){
        Temp t = new Temp();

        System.out.println(t.toString() + " = " + visit(ctx.expression(0)) + " + " + visit(ctx.expression(1)));

        return t.toString();
    }




    public String visitParentheses(CoolParser.ParenthesesContext ctx){
        return visit(ctx.expression());
    }

    public String visitAssignment(CoolParser.AssignmentContext ctx){
        String ret = visit(ctx.expression());
        System.out.println(ctx.OBJECTID().getText() + " = "  + ret);

        return "";
    }


    public String visitInt(CoolParser.IntContext ctx){
        return ctx.INT().getText();
    }
    public String visitEqual(CoolParser.EqualContext ctx){
        Temp t = new Temp();
        System.out.println(t.toString()+" = "+ visit(ctx.expression(0))+" == "+visit(ctx.expression(1)));
        return t.toString();
    }
    public String visitTrue(CoolParser.TrueContext ctx){
        Temp t = new Temp();
        System.out.println(t.toString()+" ="+" True");
        return t.toString();
    }
    public String visitFalse(CoolParser.FalseContext ctx){
        Temp t = new Temp();
        System.out.println(t.toString()+" = "+"False");
        return t.toString();
    }

    public String visitLessEqual(CoolParser.LessEqualContext ctx){
        Temp t = new Temp();
        System.out.println(t.toString()+" = "+ visit(ctx.expression(0))+" <= "+visit(ctx.expression(1)));
        return t.toString();
    }

    public String visitMethodCall(CoolParser.MethodCallContext ctx){
        Temp t = new Temp();
        String x;
        x= t.toString();
        System.out.println(x+" = "+ visit(ctx.expression(0)));
        System.out.println("PushParam "+ x);
        System.out.println("LCall " + ctx.OBJECTID().getText());
        return "";
    }
}