// Generated from C:/Users/amr25/Desktop/Compilers/src\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterProgramBlocks(CoolParser.ProgramBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitProgramBlocks(CoolParser.ProgramBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(CoolParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(CoolParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(CoolParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(CoolParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CoolParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CoolParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolParser.ExprContext ctx);
}