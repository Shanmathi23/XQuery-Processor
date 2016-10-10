grammar Xquery;

r : oxq | xq;
ap :	ap1|ap3;
ap1 :	'document''('fileName')''/'rp ;
ap3:	'document''('fileName')''//'rp ;    

rp :	tagName
		| many
		| self
		| parent
		| text
		| '@'attName
		| '('rp')'
		| rp '/' rp
		| rp '//' rp
		| rp '['f']'
		| rp','rp
		;
many : '*' ;
self : '.' ;
parent : '..' ;
text : 'text()';
tagName:	ID ;
fileName:	'"'ID'"' ;
attName:	ID ;


f  :	rp
		| rp '=' rp
		| rp' eq 'rp
		| rp '==' rp
		| rp' is 'rp
		| fBracket
		| not
		| f ' and ' f
		| f ' or ' f
		;
not : 'not ' f;
fBracket : '('f')';


xq :      var
	| StringConstant
	| ap
	| '('xq')'
	| xq','xq
	| xq'/'rp
	| xq'//'rp
	| '<'tagName'>' '{'xq'}' '</'tagName'>'
	| forClause (letClause )?(whereClause )?returnClause
	| letClause xq
	;


forClause: 'for ' var ' in ' xq (',' var ' in ' xq)* ;  
	    

letClause: 'let ' var ':=' xq (',' var ':=' xq)* ;	    

 
whereClause: 'where ' cond ;

cond:     xq '=' xq
	| xq' eq 'xq
	| xq '==' xq
	| xq' is 'xq
	| 'empty ''('xq')'
	| some
	| '('cond')'
	| cond ' and ' cond
	| cond ' or ' cond
	| 'not ' cond
	;

returnClause: ' return ' xq ;

some: 'some ' var ' in ' xq (',' var ' in ' xq)* ' satisfies ' cond ;


oxq: 'for' forJ 'where' condJ 'return' returnJ ;

forJ : var 'in' path (',' var 'in' path)*  ;

path : ap 
     | var ('/'|'//') rp
     ;

condJ : var ('eq'|'=') var 
      | var ('eq'|'=') StringConstant
      | condJ 'and' condJ 
      ;

returnJ :path
        |  var
        | '(' returnJ ')'
        | returnJ ',' returnJ
        | '<' tagName '>' '{' returnJ '}' '</' tagName '>'
        ;


var : '$'ID ;

StringConstant : [^"][A-Za-z0-9_-!, ]*['.']*[A-Za-z0-9_-!, ]*["$] ;

ID : ([a-z]|[A-Z]|'.'|'_')+ ;

Ws: [\t\r\n ]+ -> skip;