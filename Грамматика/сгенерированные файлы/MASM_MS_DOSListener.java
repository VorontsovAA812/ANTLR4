// Generated from MASM_MS_DOS.G4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MASM_MS_DOSParser}.
 */
public interface MASM_MS_DOSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(MASM_MS_DOSParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(MASM_MS_DOSParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#simplified_segment_directives}.
	 * @param ctx the parse tree
	 */
	void enterSimplified_segment_directives(MASM_MS_DOSParser.Simplified_segment_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#simplified_segment_directives}.
	 * @param ctx the parse tree
	 */
	void exitSimplified_segment_directives(MASM_MS_DOSParser.Simplified_segment_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#data_segment}.
	 * @param ctx the parse tree
	 */
	void enterData_segment(MASM_MS_DOSParser.Data_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#data_segment}.
	 * @param ctx the parse tree
	 */
	void exitData_segment(MASM_MS_DOSParser.Data_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#data_directive}.
	 * @param ctx the parse tree
	 */
	void enterData_directive(MASM_MS_DOSParser.Data_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#data_directive}.
	 * @param ctx the parse tree
	 */
	void exitData_directive(MASM_MS_DOSParser.Data_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MASM_MS_DOSParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MASM_MS_DOSParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#type_and_value}.
	 * @param ctx the parse tree
	 */
	void enterType_and_value(MASM_MS_DOSParser.Type_and_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#type_and_value}.
	 * @param ctx the parse tree
	 */
	void exitType_and_value(MASM_MS_DOSParser.Type_and_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MASM_MS_DOSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MASM_MS_DOSParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#code_segment}.
	 * @param ctx the parse tree
	 */
	void enterCode_segment(MASM_MS_DOSParser.Code_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#code_segment}.
	 * @param ctx the parse tree
	 */
	void exitCode_segment(MASM_MS_DOSParser.Code_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(MASM_MS_DOSParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(MASM_MS_DOSParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#comand}.
	 * @param ctx the parse tree
	 */
	void enterComand(MASM_MS_DOSParser.ComandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#comand}.
	 * @param ctx the parse tree
	 */
	void exitComand(MASM_MS_DOSParser.ComandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(MASM_MS_DOSParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(MASM_MS_DOSParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#xclhg}.
	 * @param ctx the parse tree
	 */
	void enterXclhg(MASM_MS_DOSParser.XclhgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#xclhg}.
	 * @param ctx the parse tree
	 */
	void exitXclhg(MASM_MS_DOSParser.XclhgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MASM_MS_DOSParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MASM_MS_DOSParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(MASM_MS_DOSParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(MASM_MS_DOSParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#jmp}.
	 * @param ctx the parse tree
	 */
	void enterJmp(MASM_MS_DOSParser.JmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#jmp}.
	 * @param ctx the parse tree
	 */
	void exitJmp(MASM_MS_DOSParser.JmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#operand1}.
	 * @param ctx the parse tree
	 */
	void enterOperand1(MASM_MS_DOSParser.Operand1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#operand1}.
	 * @param ctx the parse tree
	 */
	void exitOperand1(MASM_MS_DOSParser.Operand1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#operand2}.
	 * @param ctx the parse tree
	 */
	void enterOperand2(MASM_MS_DOSParser.Operand2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#operand2}.
	 * @param ctx the parse tree
	 */
	void exitOperand2(MASM_MS_DOSParser.Operand2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#memory_reference}.
	 * @param ctx the parse tree
	 */
	void enterMemory_reference(MASM_MS_DOSParser.Memory_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#memory_reference}.
	 * @param ctx the parse tree
	 */
	void exitMemory_reference(MASM_MS_DOSParser.Memory_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(MASM_MS_DOSParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(MASM_MS_DOSParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#general_registers}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_registers(MASM_MS_DOSParser.General_registersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#general_registers}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_registers(MASM_MS_DOSParser.General_registersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(MASM_MS_DOSParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(MASM_MS_DOSParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#metka}.
	 * @param ctx the parse tree
	 */
	void enterMetka(MASM_MS_DOSParser.MetkaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#metka}.
	 * @param ctx the parse tree
	 */
	void exitMetka(MASM_MS_DOSParser.MetkaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MASM_MS_DOSParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MASM_MS_DOSParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#sixteen_bit_register}.
	 * @param ctx the parse tree
	 */
	void enterSixteen_bit_register(MASM_MS_DOSParser.Sixteen_bit_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#sixteen_bit_register}.
	 * @param ctx the parse tree
	 */
	void exitSixteen_bit_register(MASM_MS_DOSParser.Sixteen_bit_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#eight_bit_high_register}.
	 * @param ctx the parse tree
	 */
	void enterEight_bit_high_register(MASM_MS_DOSParser.Eight_bit_high_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#eight_bit_high_register}.
	 * @param ctx the parse tree
	 */
	void exitEight_bit_high_register(MASM_MS_DOSParser.Eight_bit_high_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#eight_bit_low_register}.
	 * @param ctx the parse tree
	 */
	void enterEight_bit_low_register(MASM_MS_DOSParser.Eight_bit_low_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#eight_bit_low_register}.
	 * @param ctx the parse tree
	 */
	void exitEight_bit_low_register(MASM_MS_DOSParser.Eight_bit_low_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#segment_registers}.
	 * @param ctx the parse tree
	 */
	void enterSegment_registers(MASM_MS_DOSParser.Segment_registersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#segment_registers}.
	 * @param ctx the parse tree
	 */
	void exitSegment_registers(MASM_MS_DOSParser.Segment_registersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASM_MS_DOSParser#index_registers}.
	 * @param ctx the parse tree
	 */
	void enterIndex_registers(MASM_MS_DOSParser.Index_registersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASM_MS_DOSParser#index_registers}.
	 * @param ctx the parse tree
	 */
	void exitIndex_registers(MASM_MS_DOSParser.Index_registersContext ctx);
}