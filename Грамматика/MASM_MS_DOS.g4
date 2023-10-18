grammar MASM_MS_DOS;
programm: simplified_segment_directives;
simplified_segment_directives:
		data_segment code_segment end;  // упрощённые директивы определения сегмента

data_segment: DATA (data_directive)*;
data_directive: (name type_and_value );
name: id;
type_and_value: (DB | DW | DD | DF | DP | DQ | DT) value ;      
value
    : '?'  // неопределенное значение
    | id 
    ;


code_segment: CODE (instruction)*;
instruction: (metka? comand);
//команды

comand: add|sub | mov|xclhg|jmp;
mov: (MOV operand1 ',' operand2);
xclhg:(XCLHG operand1 ',' operand2);
add: (ADD operand1 ',' operand2);
sub: (SUB operand1 ',' operand2);
jmp: (JMP ID);
operand1: (id|register); 
operand2: (id|register);

//вводим определение ригистров
memory_reference: '[' register? ']';
register: general_registers | segment_registers | index_registers;
general_registers: sixteen_bit_register | eight_bit_high_register | eight_bit_low_register;

end: metka? END;

metka: ID ':';
//id и лексические правила
id	
	: ID
	| NUMBER
	;
NUMBER: 
	(INT |REAL);
	
INT:
		(DIGIT)+ ('d' | 'D')?
        |(DIGIT)+ ('h' | 'H')
        |(DIGIT)+ ('o' | 'O' | 'Q'|'q')
        | (DIGIT)+ ('b' | 'B')	
		;
REAL:
	 ('+' | '-')? (DIGIT)+ '.' (DIGIT)+ ('E' ('+' | '-')? (DIGIT)+)? ;// [[+|-]]цифры.цифры[[E[[+|-]]цифры]]
 

sixteen_bit_register: 'AX' | 'BX' | 'CX' | 'DX' | 'SI' | 'DI' | 'BP' | 'SP';
eight_bit_high_register: 'AH' | 'BH' | 'CH' | 'DH';
eight_bit_low_register: 'AL' | 'BL' | 'CL' | 'DL';
segment_registers: 'CS' | 'DS' | 'ES' | 'SS';
index_registers: 'SI' | 'DI';

DB: ('db' | 'byte') ;
DW: ('dw' | 'word') ;
DD: ('dd' | 'dword') ;
DF: ('df' | 'tbyte') ; 
DP: ('dp' | 'pword') ; 
DQ: ('dq' | 'qword') ;
DT: ('dt' | 'tword') ; 
MOV: 'mov';
XCLHG: 'xclhg';
ADD: 'add' ;
SUB: 'sub';
JMP: 'jmp';
DATA: '.data' ;
CODE: '.code' ;
END: 'end';

// Индификатор начинается с буквы (латинской), 
// может состоять из букв, цифр и символов из набора @ _ $ ? 
ID: LETTER (LETTER|DIGIT)*;
fragment LETTER : [a-zA-Z_?$@]; 
fragment DIGIT: [0-9];
WS : [ \t\r\n]+ -> skip ;	
	




		