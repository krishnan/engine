/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-04-04T00:00:00Z
 * LicenseName: AGPL-3.0+
 * FileName: FileLanguage.java  
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> To which family a given file relates the most? </text> 
 */
package spdxlib;

public enum FileLanguage{
    
    // compiled
    JAVA,
    DELPHI,
    C,
    C_PLUS_PLUS,
    DOT_NET,
    C_SHARP,
    OBJECTIVE_C,
    ASSEMBLER,
    HAXE,
    GO,
    MATLAB,
    SCALA,
    CLOJURE,
    
    // scripted
    PHP,
    JAVASCRIPT,
    RUBY,
    PYTHON,
    PERL,
    LISP,
    SCRIPT_LINUX,
    SCRIPT_WINDOWS,
    COFFEE,
    LUA,
    GROOVY,
    
    // mixed (can be compiled or interpreted)
    BASIC,
    ABAP,
    ERLANG,
    R,
    D,
    
    // misc
    SQL,
    HTML,
    UNSORTED,
    MULTIPLE;
    
    
    @Override
    public String toString() {
       switch (this) {
        case JAVA: return "Java";
        case DELPHI: return "Delphi";
        case C: return "C";
        case C_PLUS_PLUS: return "C++";
        case DOT_NET: return ".NET";
        case C_SHARP: return "C#";
        case OBJECTIVE_C: return "Objective C";
        case ASSEMBLER: return "Assembler";
        case SCALA: return "Scala";
        case CLOJURE: return "Clojure";
    
    // scripted
        case PHP: return "PHP";
        case JAVASCRIPT: return "Javascript";
        case COFFEE: return "Coffee script";
        case RUBY: return "Ruby";
        case PYTHON: return "Python";
        case PERL: return "Perl";
        case SCRIPT_LINUX: return "Linux script";
        case SCRIPT_WINDOWS: return "Windows script";
    
    // misc
        case SQL: return "SQL";
        case ABAP: return "ABAP";
        case HTML: return "HTML";
        case BASIC: return "Basic";
        case UNSORTED: return "Unsorted";
        case MULTIPLE: return "Multiple";
        }
        return "";
    }
}
