class Lexer_Main inherits IO{
    cum : INT;
    n   : INT;

    cumFunc( n:INT ):INT{{
        cum <- 0;
        while(n<=10)loop{
            cum <- cum + n;
            n <- n+1;
        }
        pool;
        cum;
    }};

    main() : SELF_TYPE{{
        n <- 0;
       out_string(cumFunc());
    }};

  };