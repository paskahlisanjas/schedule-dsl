// Generated from /home/paskahlis/Documents/mine/RPLSD/Schedule DSL/src/grammar/SchedulingGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SchedulingGrammarParser}.
 */
public interface SchedulingGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SchedulingGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SchedulingGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(SchedulingGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(SchedulingGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(SchedulingGrammarParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(SchedulingGrammarParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#kode}.
	 * @param ctx the parse tree
	 */
	void enterKode(SchedulingGrammarParser.KodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#kode}.
	 * @param ctx the parse tree
	 */
	void exitKode(SchedulingGrammarParser.KodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#atribut}.
	 * @param ctx the parse tree
	 */
	void enterAtribut(SchedulingGrammarParser.AtributContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#atribut}.
	 * @param ctx the parse tree
	 */
	void exitAtribut(SchedulingGrammarParser.AtributContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#meta_kebutuhan}.
	 * @param ctx the parse tree
	 */
	void enterMeta_kebutuhan(SchedulingGrammarParser.Meta_kebutuhanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#meta_kebutuhan}.
	 * @param ctx the parse tree
	 */
	void exitMeta_kebutuhan(SchedulingGrammarParser.Meta_kebutuhanContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#meta_fasilitas}.
	 * @param ctx the parse tree
	 */
	void enterMeta_fasilitas(SchedulingGrammarParser.Meta_fasilitasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#meta_fasilitas}.
	 * @param ctx the parse tree
	 */
	void exitMeta_fasilitas(SchedulingGrammarParser.Meta_fasilitasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#kebutuhan}.
	 * @param ctx the parse tree
	 */
	void enterKebutuhan(SchedulingGrammarParser.KebutuhanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#kebutuhan}.
	 * @param ctx the parse tree
	 */
	void exitKebutuhan(SchedulingGrammarParser.KebutuhanContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#fasilitas}.
	 * @param ctx the parse tree
	 */
	void enterFasilitas(SchedulingGrammarParser.FasilitasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#fasilitas}.
	 * @param ctx the parse tree
	 */
	void exitFasilitas(SchedulingGrammarParser.FasilitasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#sks}.
	 * @param ctx the parse tree
	 */
	void enterSks(SchedulingGrammarParser.SksContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#sks}.
	 * @param ctx the parse tree
	 */
	void exitSks(SchedulingGrammarParser.SksContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#kapasitas}.
	 * @param ctx the parse tree
	 */
	void enterKapasitas(SchedulingGrammarParser.KapasitasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#kapasitas}.
	 * @param ctx the parse tree
	 */
	void exitKapasitas(SchedulingGrammarParser.KapasitasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#preferensi}.
	 * @param ctx the parse tree
	 */
	void enterPreferensi(SchedulingGrammarParser.PreferensiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#preferensi}.
	 * @param ctx the parse tree
	 */
	void exitPreferensi(SchedulingGrammarParser.PreferensiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#hari}.
	 * @param ctx the parse tree
	 */
	void enterHari(SchedulingGrammarParser.HariContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#hari}.
	 * @param ctx the parse tree
	 */
	void exitHari(SchedulingGrammarParser.HariContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchedulingGrammarParser#jam}.
	 * @param ctx the parse tree
	 */
	void enterJam(SchedulingGrammarParser.JamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchedulingGrammarParser#jam}.
	 * @param ctx the parse tree
	 */
	void exitJam(SchedulingGrammarParser.JamContext ctx);
}