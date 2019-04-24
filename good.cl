class Lexer_Main inherits IO{
    main() : SELF_TYPE{
        out_string(fact(5));
    };
    fact(i:Int): Int{
        if(i=0) Then 1 else i*fact(i-1) fi;
    };
};